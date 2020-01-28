package com.tomatoclock.userserver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String id;
    private String username;
    private String motto;
    private String avatarUrl;
}
