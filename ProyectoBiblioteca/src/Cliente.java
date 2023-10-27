import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private int numeroUsuario;
    private Libros libro;
    private int numeroLibros;
    List<Libros> listaLibros = new ArrayList<>();
    public Cliente(){

    }

    public Cliente(String nombre, int edad, String cedula, int numeroUsuario, Libros libro, int numeroLibros, List<Libros> listaLibros) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.numeroUsuario = numeroUsuario;
        this.libro = libro;
        this.numeroLibros = numeroLibros;
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public List<Libros> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libros> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void ingreseNumeroLibros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de libros a retirar: ");
        this.numeroLibros = sc.nextInt();
    }

    public void ingresarDatosCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese la edad del cliente: ");
        this.edad = sc.nextInt();
        System.out.println("Ingrese la cedula del cliente: ");
        this.cedula = sc.next();
        System.out.println("Ingrese el numero de usuario del cliente: ");
        this.numeroUsuario = sc.nextInt();
    }

    public void registroLibro(){
        ingreseNumeroLibros();
        for(int i=1;i<=numeroLibros;i++){
            Libros libro=new Libros();
            System.out.println("Libro "+i);
            libro.ingresarDatosLibro();
            listaLibros.add(libro);
        }
    }

    public void imprimirLibro(){
        for(Libros libro:this.listaLibros){
            libro.imprimirLibro();
        }
    }

    public void imprimirCliente(){
        System.out.println("\n");
        System.out.println("Cliente: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Cedula: "+cedula);
        System.out.println("Numero de usuario: "+numeroUsuario);
        System.out.println("\n");
    }

}
