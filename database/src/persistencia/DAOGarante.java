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
import modelo.Garante;

public class DAOGarante {

    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Garante> getGarantes() 
    {
        ArrayList<Garante> garantes = new ArrayList<>();
        String sql = "SELECT * FROM garante";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Garante garante = new Garante();
                    garante.setIdGarante(rs.getString(1));
                    garante.setNombre(rs.getString(2));
                    garante.setApellido(rs.getString(3));
                    garante.setEmail(rs.getString(4));
                    garante.setCelular(rs.getString(5));
                    garante.setObservacion(rs.getString(6));
                    garante.setNumeroDocumnto(rs.getString(7));
                    garante.setTipoDocumento(rs.getString(8));
                    garante.setFechaNacimiento(rs.getString(9));
                    garante.setRubro(rs.getString(10));
                    garante.setSueldo(rs.getString(11));
                    garante.setCalle(rs.getString(12));
                    garante.setNumeroCalle(rs.getString(13));
                    garante.setPiso(rs.getString(14));
                    garante.setLocalidad(rs.getString(15));
                    garante.setProvincia(rs.getString(16));
                    garante.setCuit(rs.getString(17));
                    
                    garantes.add(garante);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOGarante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return garantes;
    }

    public void guardar(Garante usuario) {
        PreparedStatement pps;
        try {
            // terminar de hacer
            pps = cn.prepareStatement("INSERT INTO garante (idGarante, nombre, apellido, email, celular, observaciones, documento, tipoDocumento, fechaNacimiento, rubro, sueldo, calle, nro, piso, localidad, provincia, cuit) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, usuario.getIdGarante());
            pps.setString(2, usuario.getNombre());
            pps.setString(3, usuario.getApellido());
            pps.setString(4, usuario.getEmail());
            pps.setString(5, usuario.getCelular());
            pps.setString(6, usuario.getObservacion());
            pps.setString(7, usuario.getNumeroDocumnto());
            pps.setString(8, usuario.getTipoDocumento());
            pps.setString(9, usuario.getFechaNacimiento());
            pps.setString(10, usuario.getRubro());
            pps.setString(11, usuario.getSueldo());
            pps.setString(12, usuario.getCalle());
            pps.setString(13, usuario.getNumeroCalle());
            pps.setString(14, usuario.getPiso());
            pps.setString(15, usuario.getLocalidad());
            pps.setString(16, usuario.getProvincia());
            pps.setString(17, usuario.getCuit());
            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOGarante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
