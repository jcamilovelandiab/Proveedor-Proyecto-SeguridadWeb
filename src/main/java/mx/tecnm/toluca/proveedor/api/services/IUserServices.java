/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.services;

import java.util.List;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 *
 * @author jcami
 */
public interface IUserServices {
    
    public Usuario getUserByUsername(String username) throws Exception;
    public Usuario getUserByUsernameAndPassword(String username, String password) throws Exception;
    public List<Usuario> getUsers() throws Exception;
    
}
