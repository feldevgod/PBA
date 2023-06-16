package linconex_g02;


public class Examen {
    
    private int faltasTotales;
    private double segundos;
    private int cantidadDeCircuitos;
    private boolean aprobado;
    private String fecha;
    private String tipoDeVehiculo;

    public Examen(int faltasTotales, double segundos, int cantidadDeCircuitos, boolean aprobado, String fecha, String tipoDeVehiculo) {
        this.faltasTotales = faltasTotales;
        this.segundos = segundos;
        this.cantidadDeCircuitos = cantidadDeCircuitos;
        this.aprobado = aprobado;
        this.fecha = fecha;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public int getFaltasTotales() {
        return faltasTotales;
    }

    public void setFaltasTotales(int faltasTotales) {
        this.faltasTotales = faltasTotales;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public int getCantidadDeCircuitos() {
        return cantidadDeCircuitos;
    }

    public void setCantidadDeCircuitos(int cantidadDeCircuitos) {
        this.cantidadDeCircuitos = cantidadDeCircuitos;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }   
        
    
}
