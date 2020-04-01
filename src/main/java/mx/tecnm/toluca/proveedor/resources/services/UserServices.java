/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.resources.services;

import java.util.List;
import javax.inject.Named;
import javax.security.enterprise.authentication.mechanism.http.AutoApplySession;
import mx.tecnm.toluca.proveedor.model.User;
import mx.tecnm.toluca.proveedor.resources.repositories.UserRepository;

/**
 *
 * @author jcami
 */
@Named("UserServices")
public class UserServices implements IUserServices{

    //public UserRepository userRepository = UserRepository.getInstance();
    public UserRepository userRepository;
    
    public UserServices(){
        userRepository = new UserRepository();
    }
    
    /**
     *
     * @param email
     * @return
     * @throws Exception
     */
    public User getUserByUsername(String username) throws Exception {
        return userRepository.getUserByUsername(username);
    }

    public User getUserByUsernameAndPassword(String username, String password) throws Exception{
        return userRepository.getUserByUsernameAndPassword(username, password);
    }
    
    public List<User> getUsers() throws Exception{
        return userRepository.getUsers();
    }
    
}
