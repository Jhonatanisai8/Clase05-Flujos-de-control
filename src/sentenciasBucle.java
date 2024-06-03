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
        System.out.println("Bucle for en Java");
        for (inicializacion; condicion; actualizacion) {
            // Bloque de código a ejecutar
        }
        /*
         * La variable de control del bucle se inicializa
         *  con el valor de inicializacion.
         * La condición del bucle se evalúa antes de cada iteración. 
         * Si la condición es true, se ejecuta el bloque de código.
         *  Si la condición es false, el bucle termina.
         * La variable de control se actualiza con el valor
         * de actualizacion después de cada iteración.
         */

    }
}
