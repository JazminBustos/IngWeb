// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import java.util.ArrayList;
import modelo.Propiedad;

import persistencia.DAOPropiedad;

public class PropiedadBO{private final DAOPropiedad daoPropiedad = new DAOPropiedad();

    public ArrayList<Propiedad> getGarantes() 
    {
           return daoPropiedad.getPropiedades();
    }

    /*
    public Garante buscarGarante(Garante g)
    {
        return daoGarante.buscarGarante(g);
    }*/

    public void guardar(Propiedad p)
    {
        daoPropiedad.guardar(p);
    }




    
}
