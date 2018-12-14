// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class DAOUsuario {

    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsuario(rs.getString(1));
                    usuario.setUsuario(rs.getString(2));
                    usuario.setClave(rs.getString(3));
                    String temp = rs.getString(4);
                    if (temp.compareTo("1") == 0) {
                        usuario.setEstadoAdmin(true);
                    }
                    if (temp.compareTo("0") == 0) {
                        usuario.setEstadoAdmin(false);
                    }
                    usuarios.add(usuario);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    public Usuario buscarUsuario(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE usuario = '" + usuario.getUsuario() + "'";
        Statement st;
        Usuario user = new Usuario();
        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    user.setIdUsuario(rs.getString(1));
                    user.setUsuario(rs.getString(2));
                    user.setClave(rs.getString(3));
                    String temp = rs.getString(4);
                    if (temp.compareTo("1") == 0) {
                        usuario.setEstadoAdmin(true);
                    }
                    if (temp.compareTo("0") == 0) {
                        usuario.setEstadoAdmin(false);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public void guardar(Usuario usuario) {
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("INSERT INTO usuario (idUsuario, usuario, clave, estadoAdmin) VALUES (?,?,?,?)");
            pps.setString(1, usuario.getIdUsuario());
            pps.setString(2, usuario.getUsuario());
            pps.setString(3, usuario.getClave());
            if (usuario.getEstadoAdmin()) {
                pps.setString(4, "Verdadero");
            } else {
                pps.setString(4, "Falso");
            }

            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
