// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package modelo;

public class Servicio {

    String idServicio, concepto, importeOriginal, estado;
    Double saldo;
    String fechaVencimiento;
    Propiedad propiedad;

    public Propiedad getPropiedad() {
        return propiedad;
    }

    
    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getImporteOriginal() {
        return importeOriginal;
    }

    public void setImporteOriginal(String importeOriginal) {
        this.importeOriginal = importeOriginal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
