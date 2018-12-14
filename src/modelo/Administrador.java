// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package modelo;

public class Administrador extends Usuario {

    String idAdministrador, nombre, apellido, celular, fechaInicioTrabajo;

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaInicioTrabajo() {
        return fechaInicioTrabajo;
    }

    public void setFechaInicioTrabajo(String fechainicioTrabajo) {
        this.fechaInicioTrabajo = fechainicioTrabajo;
    }
}
