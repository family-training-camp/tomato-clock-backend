package com.tomatoclock.authserver.user.service;

import com.tomatoclock.authserver.user.param.RegisterUserParam;

public interface UserService {
  void register(RegisterUserParam param);
}
