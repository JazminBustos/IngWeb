// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package negocios;

import java.util.ArrayList;
import modelo.Empresa;
import persistencia.DAOEmpresa;

public class EmpresaBO{
    private final DAOEmpresa daoEmpresa = new DAOEmpresa();

    public ArrayList<Empresa> getEmpresas() 
    {
           return daoEmpresa.getGarantes();
    }

    /*
    public Garante buscarGarante(Garante g)
    {
        return daoGarante.buscarGarante(g);
    }*/

    public void guardar(Empresa e)
    {
        daoEmpresa.guardar(e);
    }





    
}
