/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.user.microservice.api.controllers;

import id.tarmizi.user.microservice.api.dto.UserDto;
import id.tarmizi.user.microservice.api.request.UserRequest;
import id.tarmizi.user.microservice.api.response.UserResponse;
import id.tarmizi.user.microservice.api.service.UserService;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tarmizi<tarmizi.id>
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    
    @Autowired
    private Environment env;
    
    @Autowired
    UserService userService;
    
    @GetMapping("/status/check")
    public String status(){
        return "Working on port: " + env.getProperty("local.server.port");
    }
    
    @RequestMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest req){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);   
        
        UserDto userDto = modelMapper.map(req, UserDto.class);
        UserDto createdUser = userService.createUser(userDto);
        
        UserResponse returnValue = modelMapper.map(createdUser, UserResponse.class);
        return new ResponseEntity(returnValue, HttpStatus.CREATED);
    }
}
