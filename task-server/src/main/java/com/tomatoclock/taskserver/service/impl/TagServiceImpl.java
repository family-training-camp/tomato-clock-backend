package com.tomatoclock.taskserver.service.impl;

import com.tomatoclock.taskserver.config.UserContext;
import com.tomatoclock.taskserver.converter.TagConverter;
import com.tomatoclock.taskserver.dto.CurrentUser;
import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.entity.Tag;
import com.tomatoclock.taskserver.param.CreateTagParam;
import com.tomatoclock.taskserver.param.UpdateTagParam;
import com.tomatoclock.taskserver.repository.TagRepository;
import com.tomatoclock.taskserver.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class TagServiceImpl implements TagService {
  @Resource private TagRepository tagRepository;

  @Transactional
  @Override
  public void createTag(CreateTagParam param) throws Exception {
    CurrentUser currentUser = UserContext.getCurrentUser();
    checkTagWhetherExist(param.getTagName(), currentUser.getId());
    Tag tag = new Tag();
    tag.setTagName(param.getTagName());
    tag.setUserId(currentUser.getId());
    tag.setColor("#ffffff");
    tagRepository.save(tag);
  }

  private void checkTagWhetherExist(String tagName, Long userId) throws Exception {
    if (tagRepository.findByTagNameAndUserId(tagName, userId).isPresent()) {
      throw new Exception("标签已存在");
    }
  }

  @Override
  @Transactional
  public List<TagDTO> searchAllTags() {
    CurrentUser currentUser = UserContext.getCurrentUser();
    List<Tag> tags = tagRepository.findAllByUserId(currentUser.getId());
    return TagConverter.fromTags(tags);
  }

  @Override
  @Transactional
  public void updateTag(UpdateTagParam param) throws Exception {
    CurrentUser currentUser = UserContext.getCurrentUser();
    Tag tag = findByIdAndUserId(param.getTagId(), currentUser.getId());
    checkTagWhetherExist(param.getTagName(), currentUser.getId());
    if (!param.getTagName().isEmpty()) {
      tag.setTagName(param.getTagName());
    }
    if (!param.getColor().isEmpty()) {
      tag.setColor(param.getColor());
    }
  }

  @Override
  @Transactional
  public void deleteTag(Long tagId) throws Exception {
    CurrentUser currentUser = UserContext.getCurrentUser();
    Tag tag = findByIdAndUserId(tagId, currentUser.getId());
    tag.setDelete(true);
  }

  private Tag findByIdAndUserId(Long tagId, Long userId) throws Exception {
    return tagRepository
        .findByIdAndUserId(tagId, userId)
        .orElseThrow(() -> new Exception("找不到指定的标签"));
  }
}
