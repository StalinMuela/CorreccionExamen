package Clases;

public class S_Normal extends Servicios{
    String tipoasiento;
    String lugarpasillo;
    Boolean espacioMaleta;
    Boolean maletaAdicional;

    public S_Normal() {
    }

    public S_Normal(String ruta, String servicio, double pasajetotal, String nombre, int numasientos, String tiposervicio, String tipoasiento, String lugarpasillo, Boolean espacioMaleta, Boolean maletaAdicional) {
        super(ruta, servicio, pasajetotal, nombre, numasientos, tiposervicio);
        this.tipoasiento = tipoasiento;
        this.lugarpasillo = lugarpasillo;
        this.espacioMaleta = espacioMaleta;
        this.maletaAdicional = maletaAdicional;
    }
}
