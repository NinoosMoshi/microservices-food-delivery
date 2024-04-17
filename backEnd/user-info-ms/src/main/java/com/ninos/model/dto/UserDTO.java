package com.ninos.model.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;

}
