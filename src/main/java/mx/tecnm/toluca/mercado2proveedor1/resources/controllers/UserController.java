package mx.tecnm.toluca.mercado2proveedor1.resources.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import mx.tecnm.toluca.mercado2proveedor1.model.User;
import mx.tecnm.toluca.mercado2proveedor1.resources.services.impl.UserServices;

/**
 *
 * @author 
 */
@Path("users")
public class UserController {
    
    private UserServices userServices;
    
    @GET
    public Response ping(){
        return Response
                .ok("Hey! This is the user controller")
                .build();
    }
    
    @GET
    @Path("/{email}")
    public User ping(@PathParam("email")String email){
        try {
            return userServices.getUserByEmail(email);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
