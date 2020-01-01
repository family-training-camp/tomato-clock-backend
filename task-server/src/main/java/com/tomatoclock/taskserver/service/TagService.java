package com.tomatoclock.taskserver.service;

import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.param.CreateTagParam;

import java.util.List;

public interface TagService {
  void createTag(CreateTagParam param);
  List<TagDTO> searchAllTags();

}
