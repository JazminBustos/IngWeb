// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package modelo;

public class Contrato {

    String idContrato, fechaIngreso, fechaInicio, fechaFin;
    Integer diasDeGracia;
    Double porcentajePunitorio, porcentajeComision, valorComision;
    Inquilino inquilino;
    Propiedad propiedad;
    Garante garante;

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getDiasDeGracia() {
        return diasDeGracia;
    }

    public void setDiasDeGracia(Integer diasDeGracia) {
        this.diasDeGracia = diasDeGracia;
    }

    public Double getPorcentajePunitorio() {
        return porcentajePunitorio;
    }

    public void setPorcentajePunitorio(Double porcentajePunitorio) {
        this.porcentajePunitorio = porcentajePunitorio;
    }

    public Double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(Double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Double getValorComision() {
        return valorComision;
    }

    public void setValorComision(Double valorComision) {
        this.valorComision = valorComision;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Garante getGarante() {
        return garante;
    }

    public void setGarante(Garante garante) {
        this.garante = garante;
    }
}
