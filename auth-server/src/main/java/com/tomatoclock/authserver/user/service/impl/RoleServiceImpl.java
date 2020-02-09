package com.tomatoclock.authserver.user.service.impl;

import com.tomatoclock.authserver.user.entity.Role;
import com.tomatoclock.authserver.user.repository.RoleRepository;
import com.tomatoclock.authserver.user.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService {
  @Resource private RoleRepository roleRepository;

  @Override
  public Role findByName(String name) {
    return roleRepository.findByName(name);
  }
}
