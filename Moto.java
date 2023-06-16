package linconex_g02;


public class Moto extends Vehiculos {
    private boolean tieneTodosLosEspejos;

    public Moto(boolean tieneTodosLosEspejos, String patente, String marca, String cilindrada) {
        super(patente, marca, cilindrada);
        this.tieneTodosLosEspejos = tieneTodosLosEspejos;
    }

    

    public boolean isTieneTodosLosEspejos() {
        return tieneTodosLosEspejos;
    }

    public void setTieneTodosLosEspejos(boolean tieneTodosLosEspejos) {
        this.tieneTodosLosEspejos = tieneTodosLosEspejos;
    }
    
}
