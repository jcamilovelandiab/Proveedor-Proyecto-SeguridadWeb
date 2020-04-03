/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.repositories;

import javax.ejb.EJB;
import javax.inject.Named;
import mx.tecnm.toluca.proveedor.model.Usuario;

/**
 *
 * @author jcami
 */
public interface IUsuarioRepository extends DAO<Usuario,Long>{
    
}
