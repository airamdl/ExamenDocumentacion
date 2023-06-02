// clase acrónimos

package proyecto_acronimos;

/**
 * Clase acronimos para obtener el acronimo que queramos
 * @author Airamdl
 *  Clase acronimos
 */

public class Acronimos {


    /**
     * Constructor del acronimo
     * @param cadena pide al usuario la cadena a introducir para trabajar con ella
     * @return tipo String devuelve el resultado de la cadena
     */
    public String obtenerAcronimo(String cadena){

        String resultado="";

        char caracter;

        int n=cadena.length();
/**
 * bucle for para recorrer la cadena caracter por caracter
 */
        for(int i=0;i<n;i++){
            /**
             *  se le asigna el caracter en la posición i a la variable "caracter" para trabajar con ella
             */
            caracter=cadena.charAt(i);

            /**
             * condicional if que nos dice que si el caracter es distinto de un espacio en blanco entra
             */
            if(caracter!=' '){
                /**
                 * condicional if en el que entra el primer caracter para añadirlo a resultado del acronimo
                 * @return String nos devuelve el caracter en la posicion 0
                 */
                if (i==0){

                    resultado=resultado+caracter+'.';

                }
                //Si no se cumple la anterior condición siempre entrara aqui
                else{
                    /**
                     * Si el caracter anterior es un espacio en blanco quiere decir que es la primero letra de la palabra por lo que cogera el caracter
                     * @return String nos devuelve el caracter
                     */
                    if(cadena.charAt(i-1)==' '){

                        resultado=resultado+caracter+'.';

                    }

                }

            }

        }
        /**
         *  devuelve en un String el resultado del acronimo del texto que pedimos al usuario
         */

        return resultado;

    }

}