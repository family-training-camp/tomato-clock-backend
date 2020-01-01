package com.tomatoclock.taskserver.param;

import lombok.Data;

@Data
public class CreateTagParam {
  private String tagName;
  private String color;
}
