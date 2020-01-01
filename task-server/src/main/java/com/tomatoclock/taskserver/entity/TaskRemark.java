package com.tomatoclock.taskserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class TaskRemark extends BaseEntity {
  @ManyToOne(targetEntity = Task.class)
  private Task task;

  private String content;
}
