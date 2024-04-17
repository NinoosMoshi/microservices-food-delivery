package com.ninos.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ninos.model.dto.UserDTO;
import com.ninos.model.entity.User;

@Service
public class UserMapper {

    public UserDTO mapUserToUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }


    public User mapUserDTOToUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

}
