/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.user.microservice.api.dto;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Tarmizi<tarmizi.id>
 */
@Data
public class UserDto implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String password;    
    private String userId;
    private String encryptedPassword;
}
