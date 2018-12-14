package persistencia;

import java.sql.*;

public class ConectionBD {

    Connection cn;
    private boolean flag = true;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sai21", "root", "");
            flag = true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            flag = false;
        }
        return cn;
    }

    public boolean conection() {
        Connection conexion = conexion();
        return flag;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Operacion No Soportada.");
    }
}
