package com.ninos.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.UserDTO;
import com.ninos.service.UserService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

  private final UserService userService;


    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO){
        UserDTO userDTO1 =  userService.addUser(userDTO);
        return new ResponseEntity<>(userDTO1, HttpStatus.CREATED);
    }

    @GetMapping("/fetchUserById/{userId}")
    public ResponseEntity<UserDTO> findRestaurantById(@PathVariable Long userId) {
        UserDTO userDTO = userService.fetchUserDetailsById(userId);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }


}
