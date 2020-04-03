/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor;

/**
 *
 * @author jcami
 */
public enum ApplicationError {
    RECURSO_NO_EXISTE(0, "EL RECURSO NO EXISTE"),
    ERROR_SERVIDOR(1, "HA OCURRIDO UN ERROR EN EL SERVIDOR"),
    ERROR_BASE_DE_DATOS(2, "HA OCURRIDO UN ERROR EN LA BASE DE DATOS"),
    RECURSO_DUPLICADO(3, "NO SE ACEPTAN RECURSOS DUPLICADOS");
    
    private final int codigo;
    private final String descripcion;
    
    private ApplicationError(int codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public static ApplicationError getRECURSO_NO_EXISTE() {
        return RECURSO_NO_EXISTE;
    }

    public static ApplicationError getERROR_SERVIDOR() {
        return ERROR_SERVIDOR;
    }

    public static ApplicationError getERROR_BASE_DE_DATOS() {
        return ERROR_BASE_DE_DATOS;
    }

    public static ApplicationError getRECURSO_DUPLICADO() {
        return RECURSO_DUPLICADO;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "ApplicationError{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }
    
}
