package com.tomatoclock.taskserver.controller;

import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.param.CreateTagParam;
import com.tomatoclock.taskserver.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "任务标签模块")
@RestController
@RequestMapping("/tags")
public class TagController {
  @Resource private TagService tagService;

  @ApiOperation(value = "新增标签")
  @PostMapping
  public void createTag(@RequestBody CreateTagParam param) {
    tagService.createTag(param);
  }

  @ApiOperation("查询用户所有的标签")
  @GetMapping
  public List<TagDTO> searchTagById() {
    return tagService.searchAllTags();
  }
}
