package co.edu.uniquindio.biblioteca.model;

public class Prestamo {
    private String numeroPrestamo;
    private String fechaPrestamo;
    private String fechaEntrega;
    private String descripcion;

    Prestamo(String numeroPrestamo, String fechaPrestamo, String fechaEntrega, String descripcion){
        this.numeroPrestamo=numeroPrestamo;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaEntrega=fechaEntrega;
        this.descripcion=descripcion;
    }
    public String getNumeroPrestamo(){
        return this.numeroPrestamo;
    }
    public void setNumeroPrestamo(){
        this.numeroPrestamo=numeroPrestamo;
    }
    public String getFechaPrestamo(){
        return this.fechaPrestamo;
    }
    public void setFechaPrestamo(){
        this.fechaPrestamo=fechaPrestamo;
    }
    public String getFechaEntrega(){
        return this.fechaEntrega;
    }
    public void setFechaEntrega(){
        this.fechaEntrega=fechaEntrega;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(){
        this.descripcion=descripcion;
    }
}
