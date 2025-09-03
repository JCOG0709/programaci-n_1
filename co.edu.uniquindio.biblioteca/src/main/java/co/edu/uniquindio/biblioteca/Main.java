package co.edu.uniquindio.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Cliente;
import co.edu.uniquindio.biblioteca.model.Empleado;
import co.edu.uniquindio.biblioteca.model.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = inicializarDatos();
        int opcionSeleccionada = 0;
        Cliente cliente = null;
        Empleado empleado = null;
        Libro libro = null;
        // Bucle que mantiene el programa corriendo hasta que se seleccione "6"
        while (opcionSeleccionada != 7) {
            mostrarMenu();
            opcionSeleccionada =leerEntero("ingrese un valor deacuerdo a las opciones del menú anterior");

            switch (opcionSeleccionada) {
                case 1:
                    cliente = crearCliente(biblioteca);
                    biblioteca.getListaCliente().add(cliente);
                    System.out.println("Cliente creado" + cliente);
                    break;
                case 2:
                    empleado = crearEmpleado(biblioteca);;
                    System.out.println("Empleado creado" + empleado);
                    break;
                case 3:
                    libro = crearLibro(biblioteca);
                    System.out.println("Libro creado" + libro);
                    break;
                case 4:
                    cliente = obtenerCliente(biblioteca);
                    int edad = leerEntero("ingrese la edad del cliente a validar");
                    String resultadoValidacion= validarEdadCliente(cliente, edad);
                    System.out.println(resultadoValidacion);

                    break;
                case 5:
                    libro = obtenerNombreLibro(biblioteca);
                    String resultadoValidacionLibro = validarNombreLibro(libro);
                    System.out.println(resultadoValidacionLibro);
                    break;
                case 6:
                    empleado = obtenerEmpleado(biblioteca);
                    String busquedaEmpleado = validarEmpleado(empleado);
                    System.out.println(busquedaEmpleado);
                    break;
                case 7:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }

    private static String validarEmpleado(Empleado empleado) {
        if (empleado !=null){
            return "la informacion del cliente es" + empleado;
        }else{
            return "el empleado no existe";
        }
    }

    private static Empleado obtenerEmpleado(Biblioteca biblioteca) {
        String idEmpleado = leerStringConsola("Ingrese el Id del empleado");
        Empleado buscarId = null;
        for(int i=0;i<biblioteca.getListaEmpleado().size();i++){
            if(biblioteca.getListaEmpleado().get(i).getId().equals(idEmpleado) ){
                buscarId = biblioteca.getListaEmpleado().get(i);
            }
        }
        return buscarId;
    }

    private static Libro obtenerNombreLibro(Biblioteca biblioteca) {
        String nombreLibro = leerStringConsola("Ingrese el nombre del libro");
        Libro encontrarLibro = null;
        for(int i=0; i<biblioteca.getListaLibro().size();i++){
            if(biblioteca.getListaLibro().get(i).getNombre().equals(nombreLibro)){
                encontrarLibro = biblioteca.getListaLibro().get(i);
                break;
                }
            }
        return encontrarLibro;

    }

    private static String validarNombreLibro(Libro libro) {
        if (libro != null) {
            return "El nombre del libro es valido";
        }else{
            return "El nombre del libro no existe";
        }

    }

    private static String validarEdadCliente(Cliente cliente, int edad) {
        if(cliente != null){
            if(cliente.getEdad() == edad){
                 return "la edad del cliente es valida";
            }else{
                return "la edad del cliente no es valida";
            }
        }else{
            return "el cliente no existe";
        }
    }

    private static Cliente obtenerCliente(Biblioteca biblioteca) {
        String idCliente = leerStringConsola("ingrese el id del cliente a obtener");
        Cliente clienteEncontrado = null;
        for(int i=0; i<biblioteca.getListaCliente().size();i++){
            if(biblioteca.getListaCliente().get(i).getId().equals(idCliente)){
                clienteEncontrado = biblioteca.getListaCliente().get(i);
                break;
            }
        }
        return clienteEncontrado;
    }

    public static Libro crearLibro(Biblioteca biblioteca) {
        String nombreLibro = leerStringConsola("ingrese el nombre del libro");
        String isbnLibro = leerStringConsola("ingrese el ISBN del libro: ");

        Libro libro = new Libro(nombreLibro, isbnLibro);

        libro.setNombre (nombreLibro);
        libro.setIsbn (isbnLibro);

        biblioteca.getListaLibro().add(libro);

        return libro;
    }

    public static Empleado crearEmpleado(Biblioteca biblioteca){
        String nombreEmpleado = leerStringConsola("ingrese el nombre del empleado: ");
        String apellidoEmpleado = leerStringConsola("ingrese el apellido del empleado: ");
        String idEmpleado = leerStringConsola("ingrese el id del empleado");
        int edadEmpleado = leerEntero("ingrese la edad del empleado: ");

        Empleado empleado = new Empleado(nombreEmpleado,apellidoEmpleado, idEmpleado, edadEmpleado);

        empleado.setNombre(nombreEmpleado);
        empleado.setApellido(apellidoEmpleado);
        empleado.setId(idEmpleado);
        empleado.setEdad(edadEmpleado);

        biblioteca.getListaEmpleado().add(empleado);

        return empleado;

    }
    public static Cliente crearCliente(Biblioteca biblioteca) {
        // obtener datos desde consola
        String nombreCliente = leerStringConsola("Ingrese el nombre del cliente: ");
        String apellidoCliente = leerStringConsola("Ingrese el apellido del cliente");
        String idCliente = leerStringConsola("Ingrese el id del cliente");
        int edadCliente = leerEntero("Ingrese la edad del cliente");

        // Crear la instancia del cliente
        Cliente cliente = new Cliente(nombreCliente, idCliente, apellidoCliente, edadCliente);

        // Asignar valores con setters
        cliente.setNombre(nombreCliente);
        cliente.setApellido(apellidoCliente);
        cliente.setId(idCliente);
        cliente.setEdad(edadCliente);

        biblioteca.getListaCliente().add(cliente);

        return cliente;
    }
    //public static String crearEmpleado(){}

    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }

    public static void mostrarMenu() {
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Crear Empleado ");
        System.out.println("3 - Registrar Libro");
        System.out.println("4 - validar edad del cliente");
        System.out.println("5 - validar nombre de un libro");
        System.out.println("6 - Buscar un empleado");
        System.out.println("7 - Salir del programa");

    }
    public static String leerStringConsola(String mensaje) {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }
   public static Biblioteca inicializarDatos(){

        Biblioteca biblioteca =new Biblioteca("Uq", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        Cliente cliente = new Cliente("Juan", "Ortiz", "1005", 24);

        biblioteca.getListaCliente().add(cliente);

        return biblioteca;
    }



}
