import java.util.Scanner;

/**
 * HDT6: HashMap
 * Diccionario de Jerga Urbana / Modismos
 * Diego Rizzo (22955) y Yu-Fong Chen (242115)
*/

public class Main {

    // Inicialización del controlador
    private static Controlador controlador = new Controlador();
    
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("¡Bienvenid@!");
        menu();
    }

    // El menu principal del programa
    private static void menu(){
        Scanner teclado = new Scanner(System.in);
        int seleccion;

        do { 
            System.out.println("*** Diccionario de Jergas / Modismos ***");
            System.out.println("");

            System.out.println("¿Qué te gustaría usar?");
            System.out.println("    (1) Buscar una palabra");
            System.out.println("    (2) Ingresar una nueva palabra");
            System.out.println("    (3) Cerrar el diccionario");

            seleccion = teclado.nextInt();
            teclado.nextLine();                                             // Para limpiar el \n

            switch (seleccion) {
                case 1:
                    buscarPalabra(teclado);
                    break;
                case 2: 
                    crearPalabra(teclado);
                    break;
                case 3: 
                    System.out.println("¡Gracias por usar!");
                    teclado.close();
                    System.exit(0);                                 // Un "0" es que terminó bien
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (true);
    }

    // Para buscar una palabra
    private static void buscarPalabra(Scanner teclado) {
        System.out.println("");
        System.out.println("Ingrese la palabra que quiere buscar");
        String buscarPalabra = teclado.nextLine().trim().toLowerCase();
        String resultado = controlador.buscar(buscarPalabra);           // Lo busca en el Controlador
        if (resultado != null) {
            System.out.println("'" + buscarPalabra + "'" + " significa");
            System.err.println("'" + resultado + "'");
        } else {
            System.out.println("La palabra " + buscarPalabra + " no se encuentra en el diccionario.");
        }
    }

    // Para agregar/crear una palabra
    private static void crearPalabra(Scanner teclado) {

        while (true) { 
            System.out.println("");
            System.out.println("Ingrese la palabra");
            String newPalabra = teclado.nextLine();
            System.out.println("Ingrese la definición");
            String newDefinicion = teclado.nextLine();

            System.out.println("Ha ingresado '" + newPalabra + "' que significa,");
            System.out.println("'" + newDefinicion + "'");
            System.out.println("¿Está bien la palabra ingresada? (Sí / No)");
            String confirmacion = teclado.nextLine().trim().toLowerCase();

            // Normalizar el "Sí" o "No"
            if (confirmacion.equals("si") || confirmacion.equals("sí")) {
                controlador.agregar(newPalabra, newDefinicion);
                System.out.println(newPalabra + " fue ingresada correctamente. :)");
            } else if (confirmacion.equals("no")) {
                System.out.println("Por favor ingresar los datos nuevamente");
            } else {
                System.out.println("Por favor ingresar 'sí' o 'no'.");
            }
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
