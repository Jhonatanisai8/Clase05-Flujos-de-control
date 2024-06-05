import java.util.Scanner;
public class Ejercicio04CuadradoAsteristicos {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        //variables
        int longitud;
        //pedimos la longitud
        System.out.print("Ingrese la longitud de los lados: ");
        longitud = leer.nextInt();

        for (int i = 1; i <= longitud; i++) {
            for (int j = 1; j <= longitud; j++) {
                System.out.print(" * ");
            }
            //damos  un salto de linea
            System.out.println();
        }
    }
}
