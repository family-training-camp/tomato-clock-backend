package com.tomatoclock.userserver.service;

import com.tomatoclock.userserver.dto.UserDTO;
import com.tomatoclock.userserver.param.RegisterParam;

public interface UserService {

    UserDTO getUserDTOById(String id);

    void register(RegisterParam param);

    void update(UserDTO userDTO);
}
