package mx.tecnm.toluca.proveedor.resources.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import mx.tecnm.toluca.proveedor.model.User;
import mx.tecnm.toluca.proveedor.resources.services.IUserServices;
import mx.tecnm.toluca.proveedor.resources.services.UserServices;

/**
 *
 * @author 
 */
@Path("users")
public class UserController {
    
    
    private IUserServices userServices = new UserServices();
    
    @GET
    public String getUsers(){
        try {
            List<User> users = userServices.getUsers();
            return "Hey this is the user Controller";
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @GET
    @Path("/{username}")
    public List<User> getUserByUsername(@PathParam("username")String username){
        try {
            return userServices.getUsers();
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
