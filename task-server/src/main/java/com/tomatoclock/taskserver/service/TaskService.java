package com.tomatoclock.taskserver.service;

import com.tomatoclock.taskserver.dto.CompositeTaskDTO;
import com.tomatoclock.taskserver.dto.TaskDTO;
import com.tomatoclock.taskserver.dto.TaskDashboardDTO;
import com.tomatoclock.taskserver.param.CreateTaskParam;
import com.tomatoclock.taskserver.param.SearchParam;

public interface TaskService {

    void create(CreateTaskParam param);

    void update(TaskDTO taskDTO);

    CompositeTaskDTO search(SearchParam searchParam);

    TaskDashboardDTO getDashboardInfo();
}
