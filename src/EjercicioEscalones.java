import java.util.Scanner;

public class EjercicioEscalones {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa un numero: ");
        int n = leer.nextInt();
        if (n > 0) {
            // Escalera ascendente de abajo hacia arriba
            for (int i = n; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else if (n < 0) {
            // Escalera descendente de arriba hacia abajo
            n = -n; // Convertir a positivo para usar en los bucles
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }
        } else {
            // Caso donde n es 0
            System.out.println("__");
        }
    }
}