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
import modelo.Inquilino;

public class DAOInquilino {

    ConectionBD con = new ConectionBD();
    Connection cn = con.conexion();

    public ArrayList<Inquilino> getInquilinos() {
        ArrayList<Inquilino> inquilinos = new ArrayList<>();
        String sql = "SELECT * FROM inquilino";
        Statement st;

        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Inquilino inquilino = new Inquilino();
                    
                    inquilino.setIdInquilino(rs.getString(1));
                    inquilino.setIdUsuario(rs.getString(2));
                    inquilino.setIdInquilino(rs.getString(3));
                    inquilino.setNombre(rs.getString(4));
                    inquilino.setApellido(rs.getString(5));                    
                    inquilino.setEmail(rs.getString(6));
                    inquilino.setCelular(rs.getString(7));
                    inquilino.setObservacion(rs.getString(8));
                    inquilino.setNumeroDocumnto(rs.getString(9));
                    inquilino.setTipoDocumento(rs.getString(10));
                    inquilino.setFechaNacimiento(rs.getString(11));
                    inquilino.setCondicionIVA(rs.getString(12));
                    inquilino.setCuit(rs.getString(13));                    
                    inquilino.setCuentaBancaria(rs.getString(14));
                    inquilino.setCbu(rs.getString(15));
                    inquilino.setGenero(rs.getString(16));
                    inquilino.setDeuda(rs.getString(17));
                    
                    inquilinos.add(inquilino);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOInquilino.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inquilinos;
    }

    public Inquilino buscarInquilino(Inquilino inquilino) {
        String sql = "SELECT * FROM inquilino WHERE inquilino = '" + inquilino.getUsuario() + "'";
        Statement st;
        Inquilino inq = new Inquilino();
        try {
            st = cn.createStatement();
            try (ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    
                    /*
                    inq.setIdUsuario(rs.getString(1));
                    inq.setUsuario(rs.getString(2));
                    inq.setClave(rs.getString(3));
                    */
                    
                    String temp = rs.getString(17);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inq;
    }

    public void guardar(Inquilino inquilino) {
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("INSERT INTO inquilino (idInquilino,idUsuario,idGarante,nombre,apellido,email,celular,observaciones,documento,tipoDocumento,fechaNacimiento,condicionIVA,cuit,cuentaBancaria,cbu,genero,saldo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//            pps.setString(1, "1");
//            pps.setString(2, "2");
//            pps.setString(3, "1");
            pps.setString(1, inquilino.getIdInquilino());
            pps.setString(2, inquilino.getIdUsuario());
            pps.setString(3, inquilino.getIdInquilino());
            pps.setString(4, inquilino.getNombre());
            pps.setString(5, inquilino.getApellido());
            pps.setString(6, inquilino.getEmail());
            pps.setString(7, inquilino.getCelular());
            pps.setString(8, inquilino.getObservacion());
            pps.setString(9, inquilino.getNumeroDocumnto());
            pps.setString(10, inquilino.getTipoDocumento());
            pps.setString(11, inquilino.getFechaNacimiento());
            pps.setString(12, inquilino.getCondicionIVA());
            pps.setString(13, inquilino.getCuit());
            pps.setString(14, inquilino.getCuentaBancaria());
            pps.setString(15, inquilino.getCbu());
            pps.setString(16, inquilino.getGenero());
            pps.setString(17, inquilino.getDeuda());

            pps.executeUpdate();
            pps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOInquilino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
