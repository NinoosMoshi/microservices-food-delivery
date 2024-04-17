package com.ninos.service;

import com.ninos.model.dto.UserDTO;

public interface UserService {

    UserDTO addUser(UserDTO userDTO);

    UserDTO fetchUserDetailsById(Long id);

}
