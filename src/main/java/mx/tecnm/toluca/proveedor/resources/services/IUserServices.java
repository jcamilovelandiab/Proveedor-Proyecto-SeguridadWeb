/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.resources.services;

import java.util.List;
import mx.tecnm.toluca.proveedor.model.User;

/**
 *
 * @author jcami
 */
public interface IUserServices {
    
    public User getUserByUsername(String username) throws Exception;
    public User getUserByUsernameAndPassword(String username, String password) throws Exception;
    public List<User> getUsers() throws Exception;
    
}
