
package negocios;

import java.util.ArrayList;
import modelo.Recibo;
import persistencia.DAORecibo;

public class ReciboBO{
    private final DAORecibo daoRecibo = new DAORecibo();

    public ArrayList<Recibo> getRecibos() 
    {
           return daoRecibo.getRecibos();
    }

    /*
    public Garante buscarGarante(Garante g)
    {
        return daoGarante.buscarGarante(g);
    }*/

    public void guardar(Recibo r)
    {
        daoRecibo.guardar(r);
    }





    
}
