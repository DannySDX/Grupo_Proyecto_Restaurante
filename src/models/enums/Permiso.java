package models.enums;

/**
 *
 * @author Alejandro Escobedo
 */
public enum Permiso {
    
    PROVEEDOR("PROVEEDOR"),
    CAJERO("cajero"),
    ADMINISTRADOR("administrador");
    
    private String descripcion;

    private Permiso(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private Permiso() {
    }

    
    
}
