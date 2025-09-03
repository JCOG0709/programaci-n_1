package co.edu.uniquindio.biblioteca.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private int edad;

    // Constructor con parámetros
    public Cliente(String nombre,String apellido, String id, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombreCliente){
        this.nombre=nombre;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String idCliente){
        this.id=id;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellidoCliente){
        this.apellido=apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edadCliente){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
