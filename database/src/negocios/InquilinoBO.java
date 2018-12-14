// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import java.util.ArrayList;
import java.util.List;
import modelo.Inquilino;
import persistencia.DAOInquilino;

public class InquilinoBO {
    
    private final DAOInquilino daoInquilino = new DAOInquilino();

    public ArrayList<Inquilino> getInquilinos() {
        return daoInquilino.getInquilinos();
    }
/*
    public Inquilino buscarInquilino(Inquilino inquilino) {
        return daoInquilino.buscarInquilino(inquilino);
    }
*/
    public void guardar(Inquilino inquilino) {
        daoInquilino.guardar(inquilino);
    }
}
