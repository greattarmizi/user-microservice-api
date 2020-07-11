/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.user.microservice.api.repository;

import id.tarmizi.user.microservice.api.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Tarmizi<tarmizi.id>
 */
public interface UsersRepository extends CrudRepository<UserEntity, Long>{
    
}
