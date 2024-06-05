public class Ejercicio05TrianguloAsteristicos {
    public static void main(String[] args) {
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

/*
 *
 * *
 * * *
 * 
 */
