package com.tomatoclock.taskserver.param;

import com.tomatoclock.taskserver.constant.TaskStatus;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchParam {
  private TaskStatus taskStatus;
  private String taskName;
  private Instant fromDate;
  private Instant toDate;
}
