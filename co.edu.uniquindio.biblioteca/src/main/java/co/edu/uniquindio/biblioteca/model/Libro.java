package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String nombre;
    private String isbn;

    public Libro(String nombre, String isbn){
        this.nombre=nombre;
        this.isbn = isbn;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn (String isbn){
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
