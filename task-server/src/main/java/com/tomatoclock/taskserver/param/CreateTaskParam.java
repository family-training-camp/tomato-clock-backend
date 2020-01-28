package com.tomatoclock.taskserver.param;

import com.tomatoclock.taskserver.constant.TaskType;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskParam {
  private String taskName;
  private TaskType taskType;
  private Instant endDate;
  private List<String> tags = new ArrayList<>();
}
