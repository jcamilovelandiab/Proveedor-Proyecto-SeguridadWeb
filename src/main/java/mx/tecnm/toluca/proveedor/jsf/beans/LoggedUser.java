/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.jsf.beans;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 *
 * @author jcami
 */
@ManagedBean("loggedUser")
@SessionScoped
public class LoggedUser implements Serializable{
    
    Usuario loggedUser;

    public LoggedUser() {
    }

    public Usuario getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(Usuario loggedUser) {
        this.loggedUser = loggedUser;
    }
    
}