package com.tomatoclock.authserver.user.controller;

import com.tomatoclock.authserver.user.param.RegisterUserParam;
import com.tomatoclock.authserver.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
  @Resource private UserService userService;
  @PostMapping
  public void register(@RequestBody RegisterUserParam param){
    userService.register(param);
  }
}
