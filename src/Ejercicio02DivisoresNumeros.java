import java.util.Scanner;
public class Ejercicio02DivisoresNumeros {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        int numero,contador = 0;
        //pedimos el número al usuario
        System.out.print("Ingresa el número: ");
        numero = leer.nextInt();
        //verificamos a traves de un bucle for
        for (int i = 1; i <= 100; i++) {
            if ((numero%i) == 0) {//que el residuo sea 0
                System.out.println("Tiene como divisor a: "+i);
                contador++;
            }
        }
        //mostramos la cantidad de divisores que tiene
        System.out.println("Total de Divisores: "+contador);
    }
}