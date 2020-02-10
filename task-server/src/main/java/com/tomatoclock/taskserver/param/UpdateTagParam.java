package com.tomatoclock.taskserver.param;

import lombok.Data;

@Data
public class UpdateTagParam {
  private Long tagId;
  private String tagName = "";
  private String color = "";
}
