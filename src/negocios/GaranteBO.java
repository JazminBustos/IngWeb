// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import java.util.ArrayList;
import modelo.Garante;
import persistencia.DAOGarante;



public class GaranteBO
{
    private final DAOGarante daoGarante = new DAOGarante();

    public ArrayList<Garante> getGarantes() 
    {
           return daoGarante.getGarantes();
    }

    /*
    public Garante buscarGarante(Garante g)
    {
        return daoGarante.buscarGarante(g);
    }*/

    public void guardar(Garante g)
    {
        daoGarante.guardar(g);
    }





}
