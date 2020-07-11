/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.user.microservice.api.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author Tarmizi<tarmizi.id>
 */
@Data
public class UserRequest {
    
    @NotNull(message = "First name cannot be null")
    @Size(min=2, message = "First name must not be less than 2 characters")
    private String firstName;
    
    @NotNull(message = "Last name cannot be null")
    @Size(min=2, message = "First name must not be less than 2 characters")
    private String lastName;
    
    @NotNull(message = "Email name cannot be null")
    @Email
    private String email;
    
    @NotNull(message = "Password name cannot be null")
    @Size(min = 8, max = 16, message = "Password must be equel or greater than and less than 16 characters")
    private String password;  
    
    private String userId;
}
