package com.tomatoclock.taskserver.service;

import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.param.CreateTagParam;
import com.tomatoclock.taskserver.param.UpdateTagParam;

import java.util.List;

public interface TagService {
  void createTag(CreateTagParam param) throws Exception;
  List<TagDTO> searchAllTags();

  void updateTag(UpdateTagParam param) throws Exception;

  void deleteTag(Long tagId) throws Exception;
}
