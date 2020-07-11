/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.user.microservice.api.service.impl;

import id.tarmizi.user.microservice.api.dto.UserDto;
import id.tarmizi.user.microservice.api.entity.UserEntity;
import id.tarmizi.user.microservice.api.service.UserService;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import id.tarmizi.user.microservice.api.repository.UsersRepository;

/**
 *
 * @author Tarmizi<tarmizi.id>
 */
@Service
public class UserServiceImpl implements UserService{
    
    UsersRepository usersRepository;
    
    @Autowired
    public UserServiceImpl(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    
    @Override
    public UserDto createUser(UserDto dto) {
        
        dto.setUserId(UUID.randomUUID().toString());
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        
        UserEntity userEntity = modelMapper.map(dto, UserEntity.class);
        userEntity.setEncryptedPassword("testvv");
        usersRepository.save(userEntity);
        
        UserDto returnValue = modelMapper.map(userEntity, UserDto.class);
        return returnValue;
    }
    
}
