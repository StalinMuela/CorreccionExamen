import Clases.Pasajeros;
import Clases.Rutas;
import Clases.S_Normal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Correccion Prueba");
        Pasajeros p = new Pasajeros();
        Rutas r = new Rutas(1,12.1,"David");

        System.out.println("MENU INTERFAZZ");
        System.out.println("---- Boleteria ----- ");
        System.out.println("Datos generales");
        p.escribir();


    }
}