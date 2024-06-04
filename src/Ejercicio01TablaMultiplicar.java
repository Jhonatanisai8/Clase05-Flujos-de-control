import java.util.Scanner;
public class Ejercicio01TablaMultiplicar {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        System.out.print("Ingrese el número: ");
        numero = leer.nextInt();

        //en cada iteración multiplicamos el numero ingresado por la variable i
        for (int i = 0; i <= 12; i++) {
            System.out.println(numero + " X " + i + " = " +(numero * i ));
        }
    }
}
