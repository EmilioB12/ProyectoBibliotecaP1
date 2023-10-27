import java.util.Scanner;
public class Libros {
    private String nombre;
    private String autor;
    private String editorial;
    private int codigo;

    public Libros(){

    }

    public Libros(String nombre, String autor, String editorial, int codigo) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void ingresarDatosLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        this.autor = sc.nextLine();
        System.out.println("Ingrese la editorial del libro: ");
        this.editorial = sc.nextLine();
        System.out.println("Ingrese el codigo del libro: ");
        this.codigo = sc.nextInt();
    }

    public void imprimirLibro(){
        System.out.println("Libro: "+nombre);
        System.out.println("Autor: "+autor);
        System.out.println("Editorial: "+editorial);
        System.out.println("Codigo: "+codigo);
    }
}
