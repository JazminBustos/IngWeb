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
import modelo.Propiedad;
import modelo.Propietario;

public class DAOPropiedad{
    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Propiedad> getPropiedades() 
    {
        ArrayList<Propiedad> propiedades = new ArrayList<>();
        String sql = "SELECT * FROM propiedad";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Propiedad propiedad = new Propiedad();
                    propiedad.setIdPropiedad(rs.getString(1));
                    propiedad.setTipo(rs.getString(2));
                    propiedad.setCalle(rs.getString(3));
                    propiedad.setNumero(rs.getString(4));
                    propiedad.setPiso(rs.getString(5));
                    propiedad.setPuerta(rs.getString(6));
                    propiedad.setLocalidad(rs.getString(7));
                    propiedad.setProvincia(rs.getString(8));
                    propiedad.setLegajo(rs.getString(9));
                    propiedad.setObservaciones(rs.getString(10));
                    propiedad.setPropietario(rs.getString(11));
                    
                    propiedades.add(propiedad);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPropiedad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return propiedades;
    }

    public void guardar(Propiedad usuario) {
        PreparedStatement pps;
        try {
            // terminar de hacer
            pps = cn.prepareStatement("INSERT INTO propiedad ( idPropiedad, tipo, calle, numero, piso, puerta, localidad, provincia, legajo, observaciones, propietario) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, usuario.getIdPropiedad());
            pps.setString(2, usuario.getTipo());
            pps.setString(3, usuario.getCalle());
            pps.setString(4, usuario.getNumero());
            pps.setString(5, usuario.getPiso());
            pps.setString(6, usuario.getPuerta());
            pps.setString(7, usuario.getLocalidad());
            pps.setString(8, usuario.getProvincia());
            pps.setString(9, usuario.getLegajo());
            pps.setString(10, usuario.getObservaciones());
            pps.setObject(11, usuario.getPropietario());
            
            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPropiedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
