import java.util.Scanner;
// import Palabra;

/**
 * HDT6: HashMap
 * Diccionario de Jerga Urbana / Modismos
 * Diego Rizzo (22955) y Yu-Fong Chen (242115)
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("¡Bienvenid@!");
        String resultado = menu();
        System.out.println(resultado);
    }

    private static String menu(){
        Scanner teclado = new Scanner(System.in);
        int seleccion;

        do { 
            System.out.println("");
            System.out.println("*** Diccionario de Jergas / Modismos ***");
            System.out.println("");

            System.out.println("¿Qué te gustaría usar?");
            System.out.println("    (1) Buscar una palabra");
            System.out.println("    (2) Ingresar una nueva palabra");
            System.out.println("    (3) Cerrar el diccionario");

            seleccion = teclado.nextInt();

            switch (seleccion) {
                case 1:
                case 2: 
                    crearPalabra();
                    teclado.close();
                    System.out.println();
                case 3: 

                default:
                    System.out.println("Opción inválida.");
            }
        } while (true);
    }

    private static String crearPalabra() {
        Scanner teclado = new Scanner(System.in);

        while (true) { 
            System.out.println("Ingrese la palabra");
            String newPalabra = teclado.nextLine();
            System.out.println("Ingrese la definición");
            String newDefinicion = teclado.nextLine();
    
            System.out.println("¿Está bien la palabra ingresada? (Sí / No)");
            String confirmacion = teclado.nextLine();
    
            teclado.close();
            String prueba = (newPalabra + " " + newDefinicion + " " + confirmacion);
            return prueba;
        }
    }
}

/**
new palabra = (shute "Alguien entrometido")
new palabra = (pisto "Dinero")
new palabra = (patojo "Un niño o alguien jóven")

    hola bienvenido
    diccionario de jergas / modismos
    que le gustaria hacer?
    cerrar el diccionario

(1) buscar una palabra
ingrese la palabra que quiere buscar:
(pasa la palabra por el hash function y consigue la definición)
la palabra palabra significa significado

regresa al menu


(2) ingresar una nueva palabra
ingrese la palabra que quiere ingresar:
ingrese la definición de la palabra:
ha ingresado palabra y significado, está seguro que está correcto?
(si o no)
la palabra palabra ha sido ingresada correctamente
    o regresa a palabra y definicion

regresa al menu
*/
