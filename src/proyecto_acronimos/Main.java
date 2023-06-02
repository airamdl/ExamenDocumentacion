//clase Main
/**
 * Es la clase main
 * @author Airamdl
 *
 */
package proyecto_acronimos;



import java.util.*;


/**
 * Clase main
 */
public class Main {


    /**
     *main
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Clase main en la que se le pedira al usuario una cadena para poder trabajar con los acronimos
         */
        System.out.println("ACRÓNIMO");
        // Se inicializa la clase Scanner
        Scanner teclado = new Scanner(System.in);
        // Se inicializa la cadena
        String cadena;

        System.out.printf("OBTENER ACRÓNIMO DE UN TEXTO");

        System.out.printf("Teclee el texto :");
        // Se pide al usuario la cadena
        /**
         * @param tipo String pide al usuario
         */
        cadena = teclado.nextLine();

        Acronimos x = new Acronimos();

        String resultado = x.obtenerAcronimo(cadena);
        // Printeamos el resutlado del acronimo al usuario
        System.out.printf("El acrónimo de %s es %s\n", cadena, resultado);

    }

}
