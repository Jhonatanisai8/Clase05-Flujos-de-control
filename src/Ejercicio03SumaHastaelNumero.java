import java.util.Scanner;

/**
 * Ejercicio03SumaHastaelNumero
 */
public class Ejercicio03SumaHastaelNumero {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numero, suma = 0;
        System.out.print("Ingrese un número: ");
        numero = leer.nextInt();

        for (int i = 0; i <= numero; i++) {
            suma = suma + i;
        }

        System.out.println("La suma es: " + suma);
    }
}