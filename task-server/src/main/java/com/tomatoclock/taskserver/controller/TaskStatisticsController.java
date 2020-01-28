package com.tomatoclock.taskserver.controller;

import com.tomatoclock.taskserver.service.TaskStatisticsService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "番茄钟数据统计模块")
@RestController
@RequestMapping("/tasks/statistics")
public class TaskStatisticsController {

  @Resource private TaskStatisticsService taskStatisticsService;
}
