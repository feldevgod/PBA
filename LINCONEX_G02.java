package linconex_g02;

import java.util.Arrays;
import java.util.Scanner;

public class LINCONEX_G02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //inicializamos las variables
        int i = 0;
        String fecha3;      
        Persona personas[] = new Persona[100];//inicializamos el array que va a contener los examenes
        mensajePrincipal(entrada);
        int opcion = entrada.nextInt(); //inicializamos la variable que va a contener la opcion ingresada por el usuario
        //dentro del while, si la opcion ingresada coincide con la del if, se accede a cada modulo correspondiente
        while (opcion != 9) {
            if (opcion == 1) {
                registroPersona(entrada, i, personas);
                registroMoto(entrada, i);
                registroExamenMoto(entrada, personas, i);
                i++;
            } else if (opcion == 2) {
                registroPersona(entrada, i, personas);
                registroAuto(entrada, i);
                registroExamenAuto(entrada, personas, i);
                i++;
            } else if (opcion == 3) {
                mensajeConsultas(entrada);
                int opcion2 = entrada.nextInt();
                if (opcion2 == 1) {
                    consultaDni(entrada, personas, i);
                } else if (opcion2 == 2) {
                    consultaFechaMoto(entrada, personas, i);
                } else if (opcion2 == 3) {
                    consultaFechaAuto(entrada, personas, i);
                } else if (opcion2 == 4) {
                    System.out.println("Ingrese su consulta");
                    String consulta;
                    consulta = entrada.nextLine();
                } else if (opcion2 == 9) {

                }
            }
            mensajePrincipal(entrada);
            System.out.println();
            opcion = entrada.nextInt();

        }

    }
    //Este modulo nos imprime en pantalla el mensaje principal
    private static void mensajePrincipal(Scanner entrada) {
        System.out.println();
        System.out.println("LICENCIAS DE CONDUCIR");
        System.out.println("Menú Principal");
        System.out.println("===============================");
        System.out.println("1.- Registrar Examen MOTO");
        System.out.println("2.- Registrar Examen AUTO");
        System.out.println("3.- Consultas");
        System.out.println();
        System.out.println("9.- Cerrar la aplicación");
        System.out.println();
        System.out.println("Ingrese una opción:");
    }
    //Este modulo realiza el registro de la persona solicitandole al usuario sus datos personales
    private static void registroPersona(Scanner entrada, int i, Persona personas[]) {
        System.out.println();
        System.out.println("Ingrese DNI:");
        int dni = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su fecha de nacimiento:");
        String nac;
        nac = entrada.nextLine();
        System.out.println("Ingrese sus nombres:");
        String nombres;
        nombres = entrada.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido;
        apellido = entrada.nextLine();
        Persona persona = new Persona(dni,nac,nombres,apellido); //creamos un nuevo objeto del tipo Persona y le asignamos sus atributos
        personas[i] = persona; //colocamos el objeto persona dentro del array personas en la posicion indicada por i
        

    }
    //Este modulo realiza el registro de la moto solicitandole al usuario informacion de la misma
    private static void registroMoto(Scanner entrada, int i) {
        System.out.println();
        System.out.println("Ingrese patente:");
        String patente;
        patente = entrada.nextLine();
        System.out.println("Ingrese marca:");
        String marca;
        marca = entrada.nextLine();
        System.out.println("Ingrese cilindrada:");
        String cilindrada;
        cilindrada = entrada.nextLine();
        System.out.println("¿Tiene todos los espejos?");
        String espe;
        espe = entrada.nextLine();
        boolean espejos;
        if (espe == "si") {
            espejos = true;
        } else {
            espejos = false;
        }

    }
    //Este modulo realiza el registro del auto solicitandole al usuario informacion del mismo
    private static void registroAuto(Scanner entrada, int i) {
        System.out.println();
        System.out.println("Ingrese patente:");
        String patente;
        patente = entrada.nextLine();
        System.out.println("Ingrese marca:");
        String marca;
        marca = entrada.nextLine();
        System.out.println("Ingrese cilindrada:");
        String cilindrada;
        cilindrada = entrada.nextLine();
        System.out.println("¿Cuantas puertas tiene?");
        int puertas = entrada.nextInt();

    }
    //Este modulo realiza el registro del examen de moto solicitandole al usuario los datos del examen
    private static void registroExamenMoto(Scanner entrada, Persona personas[], int i) {
        System.out.println();
        System.out.println("Ingrese la cantidad de faltas cometidas en el circuito");
        int faltas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de segundos que pasaron hasta completar el circuito");
        double segundos = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de circuitos que recorrió");
        int circuitos = entrada.nextInt();
        System.out.println("Ingrese la fecha en la cual realizó el examen en formato dd/mm/yyyy");
        entrada.nextLine();
        String fecha2;
        fecha2 = entrada.nextLine();
        boolean x;
        if (faltas < 5 && segundos < 1200) {
            x = true;
        } else {
            x = false;
        }
        personas[i].examen = new Examen(faltas, segundos, circuitos, x, fecha2, "moto");//creamos un objeto de tipo Examen y lo colocamos dentro del array personas en el atributo examen        
        System.out.println();                                                           
        
    }
    //Este modulo realiza el registro del examen de auto
    private static void registroExamenAuto(Scanner entrada, Persona personas[], int i) {
        System.out.println();
        System.out.println("Ingrese la cantidad de faltas cometidas en el circuito");
        int faltas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de segundos que pasaron hasta completar el circuito");
        double segundos = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de circuitos que recorrió");
        int circuitos = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la fecha en la cual realizó el examen en formato dd/mm/yyyy");
        String fecha2;
        fecha2 = entrada.nextLine();
        boolean x;
        if (faltas < 3 && segundos < 1800) {
            x = true;
        } else {
            x = false;
        }
        personas[i].examen = new Examen(faltas, segundos, circuitos, x, fecha2, "auto");//creamos un objeto de tipo Examen y lo colocamos dentro del array personas en el atributo examen
        System.out.println();
       

    }
    //Este modulo nos imprime en pantalla el mensaje de consultas
    private static void mensajeConsultas(Scanner entrada) {
        System.out.println();
        System.out.println("LICENCIAS DE CONDUCIR");
        System.out.println("Menú Consultas");
        System.out.println("===============================");
        System.out.println("1.- Examen por DNI");
        System.out.println("2.- Exámenes de moto por FECHA");
        System.out.println("3.- Exámenes de auto por FECHA");
        System.out.println("4.- <Consulta Opcional>");
        System.out.println();
        System.out.println("9.- Volver al menú anterior");
        System.out.println();
        System.out.println("Ingrese una opción:");

    }
    //Este modulo realiza la busqueda de examenes por medio del dni de la persona
    private static void consultaDni(Scanner entrada, Persona personas[], int i) {
        System.out.println();
        System.out.println("ingrese DNI");
        int dni2 = entrada.nextInt();
        System.out.println();
        for (int j = 0; j < i ; j++) {
            if (dni2 == personas[j].getDni()) { //si el dni ingresado por el usuario coincide con el atributo del objeto persona almacenado en la posicion i del array personas
                                                // nos imprime en pantalla los datos del examen realizado
                System.out.println("Apellido: " + personas[j].getApellido());
                System.out.println("Nombres: " + personas[j].getNombres());
                System.out.println("Circuitos: " + personas[j].examen.getCantidadDeCircuitos());
                System.out.println("Tiempo: " + personas[j].examen.getSegundos());
                System.out.println("Faltas: " + personas[j].examen.getFaltasTotales());
                System.out.println("Fecha: " + personas[j].examen.getFecha());
                if (personas[j].examen.isAprobado()) {
                    System.out.println("Estado: aprobado");
                } else {
                    System.out.println("Estado: desaprobado");
                }
                System.out.println();
            }
            else {
                System.out.println("Ninguna persona con el DNI ingresado ha rendido examen alguno en Villa Pehuenia");
            }
        }
    }
    //Este modulo realiza la busqueda de examenes de moto por medio de la fecha de realizacion del mismo
    private static void consultaFechaMoto(Scanner entrada, Persona personas[], int i) {
        System.out.println();
        entrada.nextLine();
        System.out.println("Ingrese una fecha");
        String fecha3;
        fecha3 = entrada.nextLine();
        System.out.println();
        for (int j = 0; j < i ; j++) {//si la fecha ingresada por el usuario coincide con el atributo de examen almacenado en la persona que ocupa posicion i del array personas
                                      //y si el tipo de vehiculo registrado en examen coincide con "moto" nos imprime en pantalla los datos del examen realizado
            if (fecha3.equals(personas[j].examen.getFecha())) {
                if (personas[j].examen.isAprobado()) {
                    System.out.println(personas[j].getDni() + " Aprobado");
                    System.out.println();
                } else {
                    System.out.println(personas[j].getDni() + " Desaprobado");
                    System.out.println();
                }

            } else {
                System.out.println("No se encontraron resultados");
                System.out.println();
            }
        }
    }
    //Este modulo realiza la busqueda de examenes de auto por medio de la fecha de realizacion del mismo
    private static void consultaFechaAuto(Scanner entrada, Persona personas[], int i) {
        System.out.println();
        System.out.println("Ingrese una fecha");
        entrada.nextLine();
        String fecha3;
        fecha3 = entrada.nextLine();
        System.out.println();
        for (int j = 0; j < i; j++) {//si la fecha ingresada por el usuario coincide con el atributo de examen almacenado en la persona que ocupa posicion i del array personas
                                      // y si el tipo de vehiculo registrado en examen coincide con "auto" nos imprime en pantalla los datos del examen realizado
            if (fecha3.equals(personas[j].examen.getFecha())) {
                for (int l = 0; l < i; l++) {
                    if (personas[l].examen.getTipoDeVehiculo() == "auto") {
                        if (personas[l].examen.isAprobado()) {
                            System.out.println(personas[l].getDni() + " Aprobado");
                        } else {
                            System.out.println(personas[l].getDni() + " Desaprobado");
                        }
                    }
                }
            } else {
                System.out.println("No se encontraron resultados");
                System.out.println();
            }
        }
    }
}
