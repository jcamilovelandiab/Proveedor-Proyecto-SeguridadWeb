/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.validation.constraints.NotNull;
import mx.tecnm.toluca.proveedor.ApplicationException;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 *
 * @author jcami
 */
@Stateless
public class UsuarioRepository implements DAO<Usuario,Long>{
    
    @PersistenceUnit
    EntityManager em;

    @Override
    public Usuario find(Long findByPK) throws Exception {
        return em.find(Usuario.class, findByPK);
    }

    @Override
    public void save(Usuario entity) throws Exception {
        em.persist(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
        return em.merge(entity);
    }

    @Override
    public void delete(Usuario entity) throws Exception {
        em.remove(entity);
    }
    
}
