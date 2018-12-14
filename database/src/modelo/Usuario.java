// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package modelo;

public class Usuario {

    String idUsuario, usuario, clave;
    Boolean estadoAdmin;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getEstadoAdmin() {
        return estadoAdmin;
    }

    public void setEstadoAdmin(Boolean estadoAdmin) {
        this.estadoAdmin = estadoAdmin;
    }
}
