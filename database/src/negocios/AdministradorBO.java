// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import java.util.ArrayList;
import modelo.Administrador;
import persistencia.DAOAdministrador;

public class AdministradorBO {

    private final DAOAdministrador daoAdministrador = new DAOAdministrador();

    public ArrayList<Administrador> getAdministradores() {
        return daoAdministrador.getAdministradores();
    }

    public Administrador buscarAdministrador(Administrador administrador) {
        return daoAdministrador.buscarAdministrador(administrador);
    }
    
    public String buscarNombre(Integer id) {
        return daoAdministrador.buscarNombre(id);
    }    

    public void guardar(Administrador administrador) {
        daoAdministrador.guardar(administrador);
    }
}
