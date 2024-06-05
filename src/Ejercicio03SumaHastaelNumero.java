import java.util.Scanner;

public class Ejercicio03SumaHastaelNumero {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int numero, suma;
        /*
         * con un ciclo do-while pedimos el número
         * este se detendra cuando se ingrese un 0
         */
        do {
            suma = 0;
            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = leer.nextInt();
            // si es diferente de cero procede
            if (numero != 0) {
                for (int i = 0; i <= numero; i++) {
                    suma = suma + i;
                }
                System.out.println("La suma desde el 0 hasta " + numero + ",es :  " + suma);
            }
        } while (numero != 0);
    }
}