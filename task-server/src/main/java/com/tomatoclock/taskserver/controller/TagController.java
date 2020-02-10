package com.tomatoclock.taskserver.controller;

import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.param.CreateTagParam;
import com.tomatoclock.taskserver.param.UpdateTagParam;
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
  public void createTag(@RequestBody CreateTagParam param) throws Exception {
    tagService.createTag(param);
  }

  @ApiOperation("查询用户所有的标签")
  @GetMapping
  public List<TagDTO> searchTagById() {
    return tagService.searchAllTags();
  }

  @ApiOperation("修改标签")
  @PutMapping("/{tagId}")
  public void updateTag(@PathVariable Long tagId, @RequestBody UpdateTagParam param) throws Exception {
    param.setTagId(tagId);
    tagService.updateTag(param);
  }

  @ApiOperation("删除标签")
  @DeleteMapping("/{tagId}")
  public void deleteTag(@PathVariable Long tagId) throws Exception {
    tagService.deleteTag(tagId);
  }
}
