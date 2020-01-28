package com.tomatoclock.taskserver.service.impl;

import com.tomatoclock.taskserver.dto.CompositeTaskDTO;
import com.tomatoclock.taskserver.dto.TaskDTO;
import com.tomatoclock.taskserver.dto.TaskDashboardDTO;
import com.tomatoclock.taskserver.param.CreateTaskParam;
import com.tomatoclock.taskserver.param.SearchParam;
import com.tomatoclock.taskserver.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TaskServiceImpl implements TaskService {

    @Override
    public void create(CreateTaskParam param) {

    }

    @Override
    public void update(TaskDTO taskDTO) {

    }

    @Override
    public CompositeTaskDTO search(SearchParam searchParam) {
        return null;
    }

    @Override
    public TaskDashboardDTO getDashboardInfo() {
        return null;
    }
}
