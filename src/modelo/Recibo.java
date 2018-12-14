
package modelo;

public class Recibo {

    String idRecibo, estadoRendicion, fechaEmision, importeTotal, acalaracion, punitorios, aclaracionDescuento;
    Double importeDescuento, importeRendicion, importeARendir;
    String fechaRendicion;
    Inquilino inquilino;

    public String getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(String idRecibo) {
        this.idRecibo = idRecibo;
    }

    public String getEstadoRendicion() {
        return estadoRendicion;
    }

    public void setEstadoRendicion(String estadoRendicion) {
        this.estadoRendicion = estadoRendicion;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(String importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getAcalaracion() {
        return acalaracion;
    }

    public void setAcalaracion(String acalaracion) {
        this.acalaracion = acalaracion;
    }

    public String getPunitorios() {
        return punitorios;
    }

    public void setPunitorios(String punitorios) {
        this.punitorios = punitorios;
    }

    public String getAclaracionDescuento() {
        return aclaracionDescuento;
    }

    public void setAclaracionDescuento(String aclaracionDescuento) {
        this.aclaracionDescuento = aclaracionDescuento;
    }

    public Double getImporteDescuento() {
        return importeDescuento;
    }

    public void setImporteDescuento(Double importeDescuento) {
        this.importeDescuento = importeDescuento;
    }

    public Double getImporteRendicion() {
        return importeRendicion;
    }

    public void setImporteRendicion(Double importeRendicion) {
        this.importeRendicion = importeRendicion;
    }

    public Double getImporteARendir() {
        return importeARendir;
    }

    public void setImporteARendir(Double importeARendir) {
        this.importeARendir = importeARendir;
    }

    public String getFechaRendicion() {
        return fechaRendicion;
    }

    public void setFechaRendicion(String fechaRendicion) {
        this.fechaRendicion = fechaRendicion;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }
}
