package com.tomatoclock.taskserver.dto;

import com.tomatoclock.taskserver.constant.TaskStatus;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TargetTaskDTO {
  private String taskName;
  private TaskStatus status;
  private List<String> tags = new ArrayList<>();
}
