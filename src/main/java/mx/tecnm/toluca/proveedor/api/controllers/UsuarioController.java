package mx.tecnm.toluca.proveedor.api.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mx.tecnm.toluca.proveedor.model.Usuario;
import mx.tecnm.toluca.proveedor.api.repositories.UsuarioRepository;
import mx.tecnm.toluca.proveedor.api.services.IUserServices;
import mx.tecnm.toluca.proveedor.api.services.UserServices;

/**
 *
 * @author 
 */
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {
    
    @EJB
    private UsuarioRepository usuarioRepository;
    
    @POST
    public Response crear(Usuario usuario){
        throw new UnsupportedOperationException("error");
    }
    
    @GET
    @Path("/{id:[0-9][0-9]*}")
    public Response buscar(@PathParam("id") Long usuarioId){
        throw new UnsupportedOperationException("error");
    }
    
    @PUT
    @Path("/{id:[0-9][0-9]*}")
    public Response update(@PathParam("id") Long usuarioId, Usuario usuario){
        throw new UnsupportedOperationException("error");
    }
    
    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response delete(@PathParam("id") Long usuarioId){
        return null;
    }
    
}
