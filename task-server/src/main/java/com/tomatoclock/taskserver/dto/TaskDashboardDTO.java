package com.tomatoclock.taskserver.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDashboardDTO {
  private List<TaskDashboardDetailDTO> details = new ArrayList<>();

  @Getter
  @Setter
  public static class TaskDashboardDetailDTO {
    private String title;
    private long amount;
  }
}
