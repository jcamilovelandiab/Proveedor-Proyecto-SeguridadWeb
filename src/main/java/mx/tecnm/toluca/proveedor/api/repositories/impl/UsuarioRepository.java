/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.repositories.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.validation.constraints.NotNull;
import mx.tecnm.toluca.proveedor.ApplicationException;
import mx.tecnm.toluca.proveedor.api.repositories.DAO;
import mx.tecnm.toluca.proveedor.api.repositories.IUsuarioRepository;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 *
 * @author jcami
 */
@Named("usuarioRepository")
public class UsuarioRepository implements IUsuarioRepository{
    
    //@PersistenceUnit
    EntityManager entityManager;

    @Override
    public Usuario find(Long findByPK) throws ApplicationException {
        return entityManager.find(Usuario.class, findByPK);
    }

    @Override
    public void save(Usuario entity) throws ApplicationException {
        entityManager.persist(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws ApplicationException {
        return entityManager.merge(entity);
    }

    @Override
    public void delete(Usuario entity) throws ApplicationException {
        entityManager.remove(entity);
    }

    @Override
    public void remove(Long pkEntity) throws ApplicationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() throws ApplicationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
