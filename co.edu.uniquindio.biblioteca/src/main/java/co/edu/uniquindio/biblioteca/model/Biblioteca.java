package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Cliente> listaCliente = new ArrayList();
    private ArrayList<Libro> listaLibro = new ArrayList();
    private ArrayList<Empleado> listaEmpleado = new ArrayList();

    public Biblioteca(String nombre, ArrayList<Cliente> listaCliente,  ArrayList<Libro> listaLibro, ArrayList<Empleado> listaEmpleado) {
        this.nombre=nombre;
        this.listaCliente=listaCliente;
        this.listaLibro=listaLibro;
        this.listaEmpleado=listaEmpleado;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public ArrayList<Cliente> getListaCliente(){
        return this.listaCliente;
    }
    public ArrayList<Libro> getListaLibro(){
        return this.listaLibro;
    }
    public ArrayList<Empleado> getListaEmpleado(){
        return this.listaEmpleado;
    }

}
