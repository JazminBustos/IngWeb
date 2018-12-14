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
import modelo.Administrador;
import modelo.Usuario;

public class DAOAdministrador {

    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Administrador> getAdministradores() {
        ArrayList<Administrador> administradores = new ArrayList<>();
        String sql = "SELECT * FROM administrador";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Administrador administrador = new Administrador();

                    administrador.setIdAdministrador(rs.getString(1));
                    administrador.setNombre(rs.getString(2));
                    administrador.setApellido(rs.getString(3));
                    administrador.setCelular(rs.getString(4));
                    administrador.setFechaInicioTrabajo(rs.getString(4));
                    administrador.setIdUsuario(rs.getString(6));
                    administradores.add(administrador);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return administradores;
    }

    public Administrador buscarAdministrador(Administrador administrador) {
        String sql = "SELECT * FROM administrador WHERE idAdministrador = '" + administrador.getIdAdministrador() + "'";
        Statement st;
        Administrador admin = new Administrador();
        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {

                    admin.setIdAdministrador(rs.getString(1));
                    admin.setNombre(rs.getString(2));
                    admin.setApellido(rs.getString(3));
                    admin.setCelular(rs.getString(4));
                    admin.setFechaInicioTrabajo(rs.getString(5));
                    admin.setIdUsuario(rs.getString(6));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return administrador;
    }

    public String buscarNombre(Integer id){
        String sql = "SELECT a.apellido, a.nombre FROM usuario u inner join administrador a ON u.idUsuario = a.idUsuario AND u.idUsuario = " + id;
        String txt = "";

        Statement st;        
        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    txt = rs.getString(1) + ", " + rs.getString(2) + ".";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return txt;
    }

    public void guardar(Administrador administrador) {
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("INSERT INTO usuario (idAdministrador, nombre, apellido, celular, fechaInicioTrabajo, idUsuario VALUES (?,?,?,?,?,?)");
            pps.setString(1, administrador.getIdAdministrador());
            pps.setString(2, administrador.getNombre());
            pps.setString(3, administrador.getApellido());
            pps.setString(4, administrador.getCelular());
            pps.setString(5, administrador.getFechaInicioTrabajo());
            pps.setString(6, administrador.getIdUsuario());
            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
