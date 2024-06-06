import java.util.Scanner;
public class Ejercicio05TrianguloAsteristicos {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int alto;
        System.out.print("Ingresa la altura del triángulo:");
        alto = leer.nextInt();

        int i, j;

        // formamamos el triángulo
        for (i = 1; i <= alto; i++) {
            System.out.println();
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (i = 1; i <= alto; i++) {
            System.out.println();
            for (j = 1; j <= alto - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void piramide() {
        int alto = 5;
        int i = 1;
        int j = 1;
        for (i = 1; i <= alto; i++) {
            System.out.println();
            for (j = 1; j <= alto + i - 1; j++) {
                if (j <= alto - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void triaguloNormal() {
        int alto = 5;
        int i = 1;
        int j = 1;
        for (i = 1; i <= alto; i++) {
            System.out.println();
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void trianguloInvertido() {
        int alto = 5;
        int i = 1;
        int j = 1;
        for (i = 1; i <= alto; i++) {
            for (j = 1; j <= alto - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
