/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.user.microservice.api.service;

import id.tarmizi.user.microservice.api.request.UserRequest;
import id.tarmizi.user.microservice.api.dto.UserDto;

/**
 *
 * @author Tarmizi<tarmizi.id>
 */
public interface UserService {
    UserDto createUser(UserDto dto);
}
