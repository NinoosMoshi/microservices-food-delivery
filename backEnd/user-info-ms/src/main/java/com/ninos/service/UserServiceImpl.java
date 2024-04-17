package com.ninos.service;

import lombok.AllArgsConstructor;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ninos.mapper.UserMapper;
import com.ninos.model.dto.UserDTO;
import com.ninos.model.entity.User;
import com.ninos.repository.UserRepository;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user = userRepository.save(userMapper.mapUserDTOToUser(userDTO));
        return userMapper.mapUserToUserDTO(user);
    }


    @Override
    public UserDTO fetchUserDetailsById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return userMapper.mapUserToUserDTO(user.get());
        }
        return null;
    }


}
