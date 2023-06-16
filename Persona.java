
package linconex_g02;


public class Persona {
    private int dni;
    private String fechaDeNacimiento;
    private String nombres;
    private String apellido;
    public Examen examen;


    public Persona(int dni, String fechaDeNacimiento, String nombres, String apellido) {
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
    
}
