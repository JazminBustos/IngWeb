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
import modelo.Propietario;

public class DAOPropietario{
    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();
    
 public ArrayList<Propietario> getPropietario() 
    {
    ArrayList<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM garante";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Propietario propietario = new Propietario();
                    propietario.setIdPropietario(rs.getString(1));
                    propietario.setNombre(rs.getString(2));
                    propietario.setApellido(rs.getString(3));
                    propietario.setEmail(rs.getString(4));
                    propietario.setCelular(rs.getString(5));
                    propietario.setObservacion(rs.getString(6));
                    propietario.setNumeroDocumnto(rs.getString(7));
                    propietario.setTipoDocumento(rs.getString(8));
                    propietario.setFechaNacimiento(rs.getString(9));
                    propietario.setCalle(rs.getString(10));
                    propietario.setNumeroCalle(rs.getString(11));
                    propietario.setPiso(rs.getString(12));
                    propietario.setLocalidad(rs.getString(13));
                    propietario.setProvincia(rs.getString(14));
                   
                    
                    propietarios.add(propietario);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPropietario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return propietarios;
    }

    public void guardar(Propietario usuario) {
        PreparedStatement pps;
        try {
            // terminar de hacer
            pps = cn.prepareStatement("INSERT INTO propietario (idGarante, nombre, apellido, email, celular, observaciones, documento, tipoDocumento, fechaNacimiento,  calle, nro, piso, localidad, provincia) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, usuario.getIdPropietario());
            pps.setString(2, usuario.getNombre());
            pps.setString(3, usuario.getApellido());
            pps.setString(4, usuario.getEmail());
            pps.setString(5, usuario.getCelular());
            pps.setString(6, usuario.getObservacion());
            pps.setString(7, usuario.getNumeroDocumnto());
            pps.setString(8, usuario.getTipoDocumento());
            pps.setString(9, usuario.getFechaNacimiento());
          
            pps.setString(10, usuario.getCalle());
            pps.setString(11, usuario.getNumeroCalle());
            pps.setString(12, usuario.getPiso());
            pps.setString(13, usuario.getLocalidad());
            pps.setString(14, usuario.getProvincia());
            
            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPropietario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
