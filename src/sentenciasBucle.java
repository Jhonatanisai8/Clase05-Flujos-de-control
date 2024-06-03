public class sentenciasBucle {
    public static void main(String[] args) {

    }

    public static void sentenciasBucles() {
        // while
        /*
         * Es una estructura de iteracion precondicion, primero evalua la expresion
         * antes de ejecutar cualquier sentencia
         */
        boolean condicion = true;
        System.out.println("Sentencias de bucle en Java");
        while (condicion) {
            // mientras se cumpla la condicion se ejecuta el codigo en esta parte
        }

        // do while
        /*
         * Similar al while, excepto en que la expresion se evalua al final del bucle
         * se ejecuta al menos una vez
         */

        do {
            // ejecuta las expresiones al menos una vez
        } while (condicion);

        // for
        /*
         * Se utiliza cuando se conocen los limites del bucle
         * Partes:
         * inicio,final,incremento
         */

        for (int i = 0; i < 10; i++) {
            // expresiones
        }
    }
}
