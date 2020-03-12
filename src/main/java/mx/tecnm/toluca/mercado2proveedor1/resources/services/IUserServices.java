/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.mercado2proveedor1.resources.services;

import javax.validation.constraints.NotNull;
import mx.tecnm.toluca.mercado2proveedor1.model.User;

/**
 *
 * @author jcami
 */
public interface IUserServices {
    
    public User getUserByEmail(@NotNull String email) throws Exception;
    public User getUserByEmailAndPassword(@NotNull String email,@NotNull String password) throws Exception;
    
}
