package com.tomatoclock.taskserver.dto;

import com.tomatoclock.taskserver.constant.TaskStatus;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
  private String id;
  private TaskStatus status;
  private String taskName;
  private Instant endDate;
  private boolean isDelete = false;
  private List<String> tags = new ArrayList<>();
}
