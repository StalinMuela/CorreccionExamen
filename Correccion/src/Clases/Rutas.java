package Clases;
import java.util.Scanner;

public class Rutas extends Ticket{
    String nombre;

    public Rutas() {
    }

    public Rutas(double pasajeros, double precio, String nombre) {
        super(pasajeros, precio);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double ruta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------- RUTAS -------");
        System.out.println("Quito - Guayaquil $20");
        System.out.println("Quito - Tulcan $17.50");
        System.out.println("Quito - Puyo $15");
        System.out.println("Quito - Riobamba $20");
        System.out.println("Ingresa la ruta a viajar: ");
        nombre = sc.nextLine();

        switch (nombre){
            case "Guayaquil":
                precio = 20.0;
                System.out.println("Valor a pagar: " + precio);
                break;
            case "Tulcan":
                precio = 17.5;
                System.out.println("Valor a pagar: " + precio);
                break;
            case "Puyo":
                precio = 15.0;
                System.out.println("Valor a pagar: " + precio);
                break;
            case "Riobamba":
                precio = 17.50;
                System.out.println("Valor a pagar: " + precio);
                break;
            default:
                System.out.println("Ingresa correctamente xddd");
                break;
        }
        return precio;
    }
}
