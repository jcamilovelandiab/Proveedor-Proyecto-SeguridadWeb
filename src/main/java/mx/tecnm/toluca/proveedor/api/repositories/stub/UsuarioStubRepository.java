/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.repositories.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import mx.tecnm.toluca.proveedor.ApplicationException;
import mx.tecnm.toluca.proveedor.api.repositories.IUsuarioRepository;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 * Esta clase es un repositorio que se creó con el fin
 * de realizar pruebas. Solamente se quiere probar los microservicios,
 * y que el alcance de las pruebas no lleguen hasta la base de datos.
 * @author jcami
 */
@Named("usuarioStubRepository")
public class UsuarioStubRepository implements IUsuarioRepository{

    private final Map<Long, Usuario> usuarios;
    
    public UsuarioStubRepository(){
        this.usuarios = new HashMap<>();
        Usuario usuarioA = new Usuario(new Long(1), "juan camilo", "camilovb", "camilo@mail.com", "camilo123");
        Usuario usuarioB = new Usuario(new Long(2), "lionel messi", "liomessi", "messi@mail.com", "messi123");
        this.usuarios.put(usuarioA.getUsuarioId(), usuarioA);
        this.usuarios.put(usuarioB.getUsuarioId(), usuarioB);
    }
    
    @Override
    public Usuario find(Long findByPK) throws ApplicationException {
        if(usuarios.containsKey(findByPK)){
            throw new ApplicationException("El usuario no existe");
        }
        Usuario usuario = usuarios.get(findByPK);
        usuario.setUsuarioId(null);
        return usuario;
    }

    @Override
    public void save(Usuario entity) throws ApplicationException {
        System.out.println("Hey estoy acá");
        if(usuarios.containsKey(entity.getUsuarioId())){
           throw new ApplicationException("Ya existe un usuario con el mismo id"); 
        }
        usuarios.put(entity.getUsuarioId(), entity);
    }

    @Override
    public Usuario update(Usuario entity) throws ApplicationException {
        return usuarios.replace(entity.getUsuarioId(), entity);
    }

    @Override
    public void delete(Usuario entity) throws ApplicationException {
        usuarios.remove(entity.getUsuarioId());
    }

    @Override
    public void remove(Long pkEntity) throws ApplicationException {
        usuarios.remove(pkEntity);
    }

    @Override
    public List<Usuario> findAll() throws ApplicationException {
        List<Usuario> usuarioList = new ArrayList<>();
        for(Long usuarioId: usuarios.keySet()){
            usuarioList.add(usuarios.get(usuarioId));
        }
        return usuarioList;
    }
    
}
