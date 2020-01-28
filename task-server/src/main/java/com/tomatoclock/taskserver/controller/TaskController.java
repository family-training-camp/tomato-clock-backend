package com.tomatoclock.taskserver.controller;

import com.tomatoclock.taskserver.dto.CompositeTaskDTO;
import com.tomatoclock.taskserver.dto.TaskDTO;
import com.tomatoclock.taskserver.dto.TaskDashboardDTO;
import com.tomatoclock.taskserver.param.CreateTaskParam;
import com.tomatoclock.taskserver.param.SearchParam;
import com.tomatoclock.taskserver.service.TaskService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "番茄钟模块")
@RestController
@RequestMapping("/tasks")
public class TaskController {

  @Resource private TaskService taskService;

  @PostMapping
  public void create(@RequestBody CreateTaskParam param) {
    taskService.create(param);
  }

  @PutMapping
  public void update(@RequestBody TaskDTO taskDTO) {
    taskService.update(taskDTO);
  }

  @PostMapping("/search")
  public CompositeTaskDTO search(@RequestBody SearchParam searchParam) {
    return taskService.search(searchParam);
  }

  @GetMapping("/dashboard")
  public TaskDashboardDTO getDashboardInfo() {
    return taskService.getDashboardInfo();
  }
}
