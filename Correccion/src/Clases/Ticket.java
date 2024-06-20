package Clases;

public class Ticket {
    double pasajeros;


    public Ticket() {
    }

    public Ticket(double pasajeros) {
        this.pasajeros = pasajeros;
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
