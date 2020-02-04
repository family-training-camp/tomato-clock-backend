package com.tomatoclock.authserver.user.service.impl;

import com.tomatoclock.authserver.user.entity.User;
import com.tomatoclock.authserver.user.param.RegisterUserParam;
import com.tomatoclock.authserver.user.repository.UserRepository;
import com.tomatoclock.authserver.user.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
  @Resource private UserRepository userRepository;

  @Override
  @Transactional
  public void register(RegisterUserParam param) {
    User user = new User();
    user.setUsername(param.getUsername());
    user.setPassword(new BCryptPasswordEncoder().encode(param.getPassword()));
    userRepository.save(user);
  }
}
