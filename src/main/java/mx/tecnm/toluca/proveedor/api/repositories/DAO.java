/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.repositories;

import java.io.Serializable;
import java.util.List;
import mx.tecnm.toluca.proveedor.ApplicationException;

/**
 *
 * @author jcami
 * @param <T>
 * @param <PK>
 */
public interface DAO<T extends Serializable, PK>{
    public List<T> findAll() throws ApplicationException;
    public T find(PK findByPK) throws ApplicationException;
    public void save(T entity) throws ApplicationException;
    public T update(T entity) throws ApplicationException;
    public void delete(T entity) throws ApplicationException;
    public void remove(PK pkEntity) throws ApplicationException;
}
