package com.tomatoclock.userserver.param;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterParam {
    private String username;
    private String email;
    private String password;
}
