package com.tomatoclock.userserver.service.impl;

import com.tomatoclock.userserver.dto.UserDTO;
import com.tomatoclock.userserver.param.RegisterParam;
import com.tomatoclock.userserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUserDTOById(String id) {
        return null;
    }

    @Override
    public void register(RegisterParam param) {

    }

    @Override
    public void update(UserDTO userDTO) {

    }
}
