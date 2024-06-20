package Clases;
import java.util.Scanner;
public class Pasajeros extends Ticket{
    String nombre;
    int edad;
    String genero;
    int numero;
    String correo;

    public Pasajeros() {
    }

    public Pasajeros(double pasajeros, double precio, String nombre, int edad, String genero, int numero, String correo) {
        super(pasajeros, precio);
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.numero = numero;
        this.correo = correo;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void escribir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        this.setNombre(sc.nextLine());
        System.out.println("Ingresa el edad: ");
        this.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingresa el genero: ");
        this.setGenero(sc.nextLine());
        System.out.println("Ingresa el numero: ");
        this.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingresa el correo: ");
        this.setCorreo(sc.nextLine());
    }


    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Numero: " + numero);
        System.out.println("Correo: " + correo);
    }
}
