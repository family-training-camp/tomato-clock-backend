package com.tomatoclock.userserver.controller;

import com.tomatoclock.userserver.dto.UserDTO;
import com.tomatoclock.userserver.param.RegisterParam;
import com.tomatoclock.userserver.service.UserService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Resource private UserService userService;

  @GetMapping("/{id}")
  public UserDTO getUserDTOById(@PathVariable String id) {
    return userService.getUserDTOById(id);
  }

  @PostMapping
  public void register(@RequestBody RegisterParam param) {
    userService.register(param);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody UserDTO userDTO, @PathVariable String id) {
    userDTO.setId(id);
    userService.update(userDTO);
  }
}
