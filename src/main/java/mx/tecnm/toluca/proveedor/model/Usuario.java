/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcami
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuarioId")
    private Long usuarioId;
    
    @NotNull
    @Size(min = 3, max = 45)
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull
    @Size(min = 3, max = 45)
    @Column(name = "usuario")
    private String usuario;
    
    @NotNull
    @Size(min = 5, max = 45)
    @Column(name = "correo")
    private String correo;
    
    @NotNull
    @Size(min = 5, max = 45)
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    
    public Usuario(){
    }

    public Usuario(Long usuarioId, String nombre, String usuario, String correo, String contraseña) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setLogin(String login) {
        this.usuario = login;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
