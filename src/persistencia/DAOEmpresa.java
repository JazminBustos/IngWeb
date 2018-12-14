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
import modelo.Empresa;

public class DAOEmpresa{
ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Empresa> getGarantes() 
    {
        ArrayList<Empresa> empresas = new ArrayList<>();
        String sql = "SELECT * FROM empresa";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Empresa empresa = new Empresa();
                    empresa.setNombre(rs.getString(1));
                    empresa.setPais(rs.getString(2));
                    empresa.setProvincia(rs.getString(3));
                    empresa.setLocalidad(rs.getString(4));
                    empresa.setCodigoPostal(rs.getString(5));
                    empresa.setCalle(rs.getString(6));
                    empresa.setNumero(rs.getString(7));
                    empresa.setTelefono(rs.getString(8));
                    empresa.setEmail(rs.getString(9));
                    
          
                    empresas.add(empresa);
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOGarante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  empresas;
    }

    public void guardar( Empresa usuario) {
        PreparedStatement pps;
        try {
            // terminar de hacer
            pps = cn.prepareStatement("INSERT INTO  empresas (nombre, pais, provincia, localidad, codigoPostal, calle, numero, telefono, email;) VALUES (?,?,?,?,?,?,?,?,?)");
            pps.setString(1, usuario.getNombre());
            pps.setString(2, usuario.getPais());
            pps.setString(3, usuario.getProvincia());
            pps.setString(4, usuario.getLocalidad());
            pps.setString(5, usuario.getCodigoPostal());
            pps.setString(6, usuario.getCalle());
            pps.setString(7, usuario.getNumero());
            pps.setString(8, usuario.getTelefono());
            pps.setString(9, usuario.getEmail());
            
            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
