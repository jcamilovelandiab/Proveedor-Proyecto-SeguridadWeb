/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.services;

import java.util.List;
import javax.inject.Named;
import javax.security.enterprise.authentication.mechanism.http.AutoApplySession;
import mx.tecnm.toluca.proveedor.model.Usuario;
import mx.tecnm.toluca.proveedor.api.repositories.UsuarioRepository;

/**
 *
 * @author jcami
 */
@Named("UserServices")
public class UserServices implements IUserServices{

    //public UserRepository userRepository = UserRepository.getInstance();
    public UsuarioRepository userRepository;
    
    public UserServices(){
        userRepository = new UsuarioRepository();
    }
    
    /**
     *
     * @param email
     * @return
     * @throws Exception
     */
    public Usuario getUserByUsername(String username) throws Exception {
        return null;
    }

    public Usuario getUserByUsernameAndPassword(String username, String password) throws Exception{
        return null;
    }
    
    public List<Usuario> getUsers() throws Exception{
        return null;
    }
    
}
