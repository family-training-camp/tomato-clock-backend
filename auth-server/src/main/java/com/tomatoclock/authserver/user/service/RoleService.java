package com.tomatoclock.authserver.user.service;

import com.tomatoclock.authserver.user.entity.Role;

public interface RoleService {
  Role findByName(String name);
}
