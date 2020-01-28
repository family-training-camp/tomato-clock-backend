package com.tomatoclock.taskserver.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompositeTaskDTO {
  private List<NormalTaskDTO> normalTasks = new ArrayList<>();
  private List<TargetTaskDTO> targetTasks = new ArrayList<>();
}
