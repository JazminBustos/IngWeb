// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import persistencia.ConectionBD;

public class ConeccionBO {

    ConectionBD con = new ConectionBD();

    public boolean conection() {
        return con.conection();
    }
}
