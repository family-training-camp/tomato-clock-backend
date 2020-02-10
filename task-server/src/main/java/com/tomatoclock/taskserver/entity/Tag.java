package com.tomatoclock.taskserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Tag extends BaseEntity {
  private String tagName;
  private String color;
  private Long userId;
}
