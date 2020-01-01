package com.tomatoclock.taskserver.service.impl;

import com.tomatoclock.taskserver.converter.TagConverter;
import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.entity.Tag;
import com.tomatoclock.taskserver.param.CreateTagParam;
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
  public void createTag(CreateTagParam param) {
    Tag tag = new Tag();
    tag.setTagName(param.getTagName());
    tag.setUserId("test");
    tag.setColor("#ffffff");
    tagRepository.save(tag);
  }

  @Override
  public List<TagDTO> searchAllTags() {
    List<Tag> tags = tagRepository.findAllByUserId("test");
    return TagConverter.fromTags(tags);
  }
}
