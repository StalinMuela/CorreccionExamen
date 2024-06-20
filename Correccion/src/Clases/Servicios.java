package Clases;

public class Servicios extends Rutas{
    String tiposervicio;

    public Servicios() {
    }
    public Servicios(String ruta, String servicio, double pasajetotal, String nombre, int numasientos, String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public void mostrarServicio() {
        System.out.println("Tipo de Servicio: " + tiposervicio);
    }
    
}
