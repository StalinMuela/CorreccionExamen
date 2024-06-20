package Clases;

public class S_Vip extends Servicios{

    String servicioAdicionales;
    int maletas;
    Boolean maletaadicional;

    public S_Vip() {
    }

    public S_Vip(String ruta, String servicio, double pasajetotal, String nombre, int numasientos, String tiposervicio, String servicioAdicionales, int maletas, Boolean maletaadicional) {
        super(ruta, servicio, pasajetotal, nombre, numasientos, tiposervicio);
        this.servicioAdicionales = servicioAdicionales;
        this.maletas = maletas;
        this.maletaadicional = maletaadicional;
    }
}
