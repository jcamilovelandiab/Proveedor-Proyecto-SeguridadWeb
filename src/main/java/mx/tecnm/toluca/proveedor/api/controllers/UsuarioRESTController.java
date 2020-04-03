package mx.tecnm.toluca.proveedor.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Named;
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
import mx.tecnm.toluca.proveedor.ApplicationError;
import mx.tecnm.toluca.proveedor.ApplicationException;
import mx.tecnm.toluca.proveedor.api.repositories.IUsuarioRepository;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 *
 * @author 
 */
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioRESTController {
    
    // Los dos repositorios. Uno es caché y otro está conectado a la base de datos
    @Inject
    @Named("usuarioStubRepository") //@Named("usuarioRepository")
    IUsuarioRepository usuarioRepository;
    
    @GET
    public Response get(){
        List<Usuario> usuarioA = new ArrayList<>();
        try {
            usuarioA = usuarioRepository.findAll();
            return Response.ok(200).entity(usuarioA).build();
        } catch (ApplicationException ex) {
            Logger.getLogger(UsuarioRESTController.class.getName()).log(Level.SEVERE, null, ex);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @POST
    public Response crear(Usuario usuario){
        try {
            usuarioRepository.save(usuario);
            return Response.ok(200).build();
        } catch (ApplicationException ex) {
            Logger.getLogger(UsuarioRESTController.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getMessage().equals(ApplicationError.RECURSO_DUPLICADO.name())){
                return Response.status(Response.Status.NOT_FOUND).build();
            }else if(ex.getMessage().equals(ApplicationError.ERROR_BASE_DE_DATOS.name())){
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            }
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    
    @GET
    @Path("/{usuarioId}")
    public Response buscar(@PathParam("usuarioId") Long usuarioId){
        return Response.ok(200).entity("Este es el usuario "+usuarioId).build();
        /*
        try {
            Usuario u = usuarioRepository.find(usuarioId);
            return Response.ok(200).entity(u).build();
        } catch (ApplicationException ex) {
            Logger.getLogger(UsuarioRESTController.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getMessage().equals(ApplicationError.RECURSO_NO_EXISTE.name())){
                return Response.status(Response.Status.NOT_FOUND).build();
            }else if(ex.getMessage().equals(ApplicationError.ERROR_BASE_DE_DATOS.name())){
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            }
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        */
    }
    
    @PUT
    @Path("/{usuarioId:[0-9][0-9]*}")
    public Response actualizar(@PathParam("usuarioId") Long usuarioId, Usuario usuario){
        try {
            if(!usuarioId.equals(usuario.getUsuarioId())){
                return Response.status(Response.Status.BAD_REQUEST).build();
            }
            Usuario u = usuarioRepository.update(usuario);
            return Response.ok(200).entity(u).build();
        } catch (ApplicationException ex) {
            Logger.getLogger(UsuarioRESTController.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getMessage().equals(ApplicationError.RECURSO_NO_EXISTE.name())){
                return Response.status(Response.Status.NOT_FOUND).build();
            }else if(ex.getMessage().equals(ApplicationError.ERROR_BASE_DE_DATOS.name())){
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            }
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    
    @DELETE
    @Path("/{usuarioId:[0-9][0-9]*}")
    public Response eliminar(@PathParam("usuarioId") Long usuarioId){
        try {
            usuarioRepository.remove(usuarioId);
            return Response.ok(200).build();
        } catch (ApplicationException ex) {
            Logger.getLogger(UsuarioRESTController.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getMessage().equals(ApplicationError.RECURSO_NO_EXISTE.name())){
                return Response.status(Response.Status.NOT_FOUND).build();
            }else if(ex.getMessage().equals(ApplicationError.ERROR_BASE_DE_DATOS.name())){
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            }
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    
}
