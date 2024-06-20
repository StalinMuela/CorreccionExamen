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

    public String getTipoasiento() {
        return tipoasiento;
    }

    public void setTipoasiento(String tipoasiento) {
        this.tipoasiento = tipoasiento;
    }

    public String getLugarpasillo() {
        return lugarpasillo;
    }

    public void setLugarpasillo(String lugarpasillo) {
        this.lugarpasillo = lugarpasillo;
    }

    public Boolean getEspacioMaleta() {
        return espacioMaleta;
    }

    public void setEspacioMaleta(Boolean espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }

    public Boolean getMaletaAdicional() {
        return maletaAdicional;
    }

    public void setMaletaAdicional(Boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }

    public void mostrar() {

        System.out.println("El nombre es " + getNombre());
        System.out.println("El lugar es " + getLugarpasillo());
        System.out.println("El espacio es " + getEspacioMaleta());
        System.out.println("El maleta es " + getMaletaAdicional());

    }
}
