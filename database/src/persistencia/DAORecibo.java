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
import modelo.Recibo;

public class DAORecibo{
    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Recibo> getRecibos() 
    {
        ArrayList<Recibo> recibos = new ArrayList<>();
        String sql = "SELECT * FROM recibo";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Recibo recibo = new Recibo();
                    recibo.setIdRecibo(rs.getString(1));
                    recibo.setEstadoRendicion(rs.getString(2));
                    recibo.setFechaEmision(rs.getString(3));
                    recibo.setImporteTotal(rs.getString(4));
                    recibo.setAcalaracion(rs.getString(5));
                    recibo.setPunitorios(rs.getString(6));
                    recibo.setAclaracionDescuento(rs.getString(7));
                    recibo.setImporteDescuento(rs.getDouble(8));
                    recibo.setImporteRendicion(rs.getDouble(9));
                    recibo.setImporteARendir(rs.getDouble(10));
                    recibo.setFechaRendicion(rs.getString(11));
                    recibo.setInquilino(rs));
                    
                    
                    recibos.add(recibo);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAORecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recibos;
    }

    public void guardar(Recibo usuario) {
        PreparedStatement pps;
        try {
            // terminar de hacer
            pps = cn.prepareStatement("INSERT INTO recibo (idGarante, nombre, apellido, email, celular, observaciones, documento, tipoDocumento, fechaNacimiento, rubro, sueldo, calle, nro, piso, localidad, provincia, cuit) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, usuario.getIdRecibo());
            pps.setString(2, usuario.getEstadoRendicion());
            pps.setString(3, usuario.getFechaEmision());
            pps.setString(4, usuario.getImporteTotal());
            pps.setString(5, usuario.getAcalaracion());
            pps.setString(6, usuario.getPunitorios());
            pps.setString(7, usuario.getAclaracionDescuento());
            pps.setDouble(8, usuario.getImporteDescuento());
            pps.setDouble(9, usuario.getImporteRendicion());
            pps.setDouble(10, usuario.getImporteARendir());
            pps.setString(11, usuario.getFechaRendicion());
            pps.(12, usuario.getInquilino());
            
            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAORecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
