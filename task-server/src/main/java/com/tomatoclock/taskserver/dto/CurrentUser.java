package com.tomatoclock.taskserver.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CurrentUser {
  private Long id;
  private String username;
  private List<String> roles = new ArrayList<>();
}
