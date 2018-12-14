
package negocios;

import java.util.ArrayList;
import modelo.Propietario;
import persistencia.DAOPropietario;

public class PropietarioBO{
    private final DAOPropietario daoPropietario = new DAOPropietario();

    public ArrayList<Propietario> getPropietarios() 
    {
           return daoPropietario.getPropietario();
    }

    /*
    public Garante buscarGarante(Garante g)
    {
        return daoGarante.buscarGarante(g);
    }*/

    public void guardar(Propietario g)
    {
        daoPropietario.guardar(g);
    }




    
}
