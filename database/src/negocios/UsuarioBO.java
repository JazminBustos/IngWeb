// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import modelo.Usuario;
import persistencia.DAOUsuario;
import java.util.ArrayList;

public class UsuarioBO {

    private final DAOUsuario daoUsuario = new DAOUsuario();

    public ArrayList<Usuario> getUsuarios() {
           return daoUsuario.getUsuarios();
    }

    public Usuario buscarUsuario(Usuario usuario) {
        return daoUsuario.buscarUsuario(usuario);
    }

    public void guardar(Usuario usuario) {
        daoUsuario.guardar(usuario);
    }
}
