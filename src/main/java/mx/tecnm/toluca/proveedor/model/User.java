/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jcami
 */
public class User implements Serializable{
    
    String name;
    String username;
    String email;
    String password;
    
    public User(){
    }
    
    public User(String name, @NotNull String username, @NotNull String email, @NotNull String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", username=" + username + ", email=" + email + ", password=" + password + '}';
    }
    
}
