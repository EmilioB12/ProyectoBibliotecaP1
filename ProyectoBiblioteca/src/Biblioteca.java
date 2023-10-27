import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private String status;
    private int numeroClientes;
    private Cliente cliente;

    List<Cliente> listaClientes = new ArrayList<>();

    public Biblioteca(){

    }

    public Biblioteca(String nombre, String ubicacion, String status, int numeroClientes, Cliente cliente, List<Cliente> listaClientes) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.status = status;
        this.numeroClientes = numeroClientes;
        this.cliente = cliente;
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void ingreseNumeroClientes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de clientes a registrar: ");
        this.numeroClientes = sc.nextInt();
    }

    public void ingresarDatosBiblioteca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la biblioteca: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese la ubicacion de la biblioteca: ");
        this.ubicacion = sc.nextLine();
        System.out.println("Ingrese el status de la biblioteca: ");
        this.status = sc.next();
        ingresarClientes();
    }

    public void ingresarClientes(){
        ingreseNumeroClientes();
        for(int i=1;i<=numeroClientes;i++){
            Cliente cliente=new Cliente();
            System.out.println("Cliente "+i);
            cliente.ingresarDatosCliente();
            cliente.registroLibro();
            listaClientes.add(cliente);
        }
        imprimirClientes();
    }

    public void imprimirClientes(){
        imprimirBiblioteca();
        for(Cliente cliente:this.listaClientes){
            cliente.imprimirCliente();
            cliente.imprimirLibro();
        }
    }

    public void imprimirBiblioteca(){
        System.out.println("Biblioteca: "+nombre);
        System.out.println("Direccion: "+ubicacion);
        System.out.println("Status: "+status);
    }
}
