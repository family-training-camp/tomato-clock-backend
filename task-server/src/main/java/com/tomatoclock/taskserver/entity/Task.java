package com.tomatoclock.taskserver.entity;

import com.tomatoclock.taskserver.constant.TaskStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Task extends BaseEntity {

  private String taskName;
  @OneToOne
  private Tag tag;

  @Enumerated(EnumType.STRING)
  private TaskStatus status;

  private String ownerId;
  private String description;
  private Instant deadline;
  @OneToMany(targetEntity = TaskRemark.class, mappedBy = "task") private List<TaskRemark> remarks = new ArrayList<>();
}
