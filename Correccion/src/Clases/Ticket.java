package Clases;

public class Ticket {
    double pasajeros;
    double precio;


    public Ticket() {
    }

    public Ticket(double pasajeros, double precio) {
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public double getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(double pasajeros) {
        this.pasajeros = pasajeros;
    }



    public void mostar(){
        System.out.println("Hola");
    }
}
