/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.mercado2proveedor1.resources.repositories;

import java.util.HashMap;
import javax.validation.constraints.NotNull;
import mx.tecnm.toluca.mercado2proveedor1.ApplicationException;
import mx.tecnm.toluca.mercado2proveedor1.model.User;

/**
 *
 * @author jcami
 */
public class UserRepository {
    
    //private static UserRepository repository = null;
    
    public HashMap<String,User> users;
    
    public UserRepository(){
        users = new HashMap<String,User>();
        User camiloUser = new User("Camilo", "Velandia", "camilo@mail.com", "camilo123");
        users.put(camiloUser.getEmail(), camiloUser);
    }
    
    public User getUserByEmail(@NotNull String email) throws ApplicationException{
        if(users.containsKey(email)){
            return users.get(email);
        }
        throw new ApplicationException("This user does not exist");
    }
    
    public User getUserByEmailAndPassword(@NotNull String email, @NotNull String password) throws ApplicationException{
        if(users.containsKey(email)){
            User user = users.get(email);
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                user.setPassword(null);
                return user;
            }else{
                throw new ApplicationException("This user does not exist");
            }
        }
        throw new ApplicationException("This user does not exist");
    }
    
}
