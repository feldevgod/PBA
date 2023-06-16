package linconex_g02;


public class Auto extends Vehiculos {
    private int cantidadDePuertas;
    
    public Auto(int cantidadDePuertas, String patente, String marca, String cilindrada) {
        super(patente, marca, cilindrada);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
}
