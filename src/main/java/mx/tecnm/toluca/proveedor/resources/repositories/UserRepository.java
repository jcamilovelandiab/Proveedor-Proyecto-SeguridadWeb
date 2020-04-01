/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.resources.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.validation.constraints.NotNull;
import mx.tecnm.toluca.proveedor.ApplicationException;
import mx.tecnm.toluca.proveedor.model.User;

/**
 *
 * @author jcami
 */
public class UserRepository {
    
    //private static UserRepository repository = null;
    
    public HashMap<String,User> users;
    
    public UserRepository(){
        users = new HashMap<String,User>();
        User supermercado1 = new User("Supermercado1", "Supermercado1Seg","supermercado1@mail.com", "supermercado123");
        User oxxo = new User("super2", "OXXO","oxxo@mail.com", "OXXO123");
        users.put(supermercado1.getUsername(), supermercado1);
        users.put(oxxo.getUsername(), oxxo);
    }
    
    public User getUserByUsername(@NotNull String email) throws ApplicationException{
        if(users.containsKey(email)){
            return users.get(email);
        }
        throw new ApplicationException("This user does not exist");
    }
    
    public User getUserByUsernameAndPassword(@NotNull String username, @NotNull String password) throws ApplicationException{
        if(users.containsKey(username)){
            User user = users.get(username);
            if(user.getEmail().equals(username) && user.getPassword().equals(password)){
                user.setPassword(null);
                return user;
            }else{
                throw new ApplicationException("This user does not exist");
            }
        }
        throw new ApplicationException("This user does not exist");
    }
    
    public List<User> getUsers(){
        List<User> userList = new ArrayList<>();
        for(String email: users.keySet()){
            userList.add(users.get(email));
        }
        return userList;
    }
    
}
