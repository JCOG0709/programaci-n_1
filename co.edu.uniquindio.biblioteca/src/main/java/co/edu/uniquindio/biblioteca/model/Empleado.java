package co.edu.uniquindio.biblioteca.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String id;
    private int edad;

    public Empleado(String nombre, String apellido, String id, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.edad=edad;
    }
    public String getNombre(){

        return this.nombre;
    }
    public void setNombre(String nombreEmpleado){

        this.nombre=nombre;
    }
    public String getApellido(){

        return this.apellido;
    }
    public void setApellido(String apellido){

        this.apellido=apellido;
    }
    public String getId(){

        return this.id;
    }
    public void setId(String id){

        this.id=id;
    }
    public int getEdad(){

        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                '}';
    }
}
