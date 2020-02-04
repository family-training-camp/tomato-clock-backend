package com.tomatoclock.authserver.user.param;

import lombok.Data;

@Data
public class RegisterUserParam {
  private String username;
  private String password;
}
