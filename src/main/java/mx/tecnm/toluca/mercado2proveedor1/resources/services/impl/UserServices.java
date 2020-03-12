/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.mercado2proveedor1.resources.services.impl;

import javax.security.enterprise.authentication.mechanism.http.AutoApplySession;
import mx.tecnm.toluca.mercado2proveedor1.model.User;
import mx.tecnm.toluca.mercado2proveedor1.resources.repositories.UserRepository;
import mx.tecnm.toluca.mercado2proveedor1.resources.services.IUserServices;

/**
 *
 * @author jcami
 */
public class UserServices implements IUserServices {

    //public UserRepository userRepository = UserRepository.getInstance();
    public UserRepository userRepository = new UserRepository();
    
    /**
     *
     * @param email
     * @return
     * @throws Exception
     */
    @Override
    public User getUserByEmail(String email) throws Exception {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public User getUserByEmailAndPassword(String email, String password) throws Exception{
        return userRepository.getUserByEmailAndPassword(email, password);
    }
    
}
