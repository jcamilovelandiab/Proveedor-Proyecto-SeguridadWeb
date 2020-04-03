/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author jcami
 */
@Path("login")
public class LoginRESTController {
    
    @GET
    public String login(){
        return "Este es el controlador del login";
    }
    
}
