/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.repositories;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jcami
 */
public interface DAO<T extends Serializable, PK>{
    //public List<T> findAll() throws Exception;
    public T find(PK findByPK) throws Exception;
    public void save(T entity) throws Exception;
    public T update(T entity) throws Exception;
    public void delete(T entity) throws Exception;
    //public void remove(PK pkEntity) throws Exception;
}
