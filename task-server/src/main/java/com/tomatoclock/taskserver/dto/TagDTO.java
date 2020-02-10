package com.tomatoclock.taskserver.dto;

import lombok.Data;

@Data
public class TagDTO {
  private Long tagId;
  private String tagName;
  private String color;
}
