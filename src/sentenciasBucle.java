public class sentenciasBucle {
    public static void main(String[] args) {

        System.out.println("Imprimir los elementos de un arreglo");
        String arregloNombres[] = {
                "Ana",
                "Luis",
                "Marcos" };
        for (int k = 0; k < arregloNombres.length; k++) {
            System.out.println(arregloNombres[k]);
        }
    }

    public static void sentenciasBucles() {
        // while
        /*
         * Es una estructura de iteracion precondicion, primero evalua la expresion
         * antes de ejecutar cualquier sentencia
         */
        boolean condicion = true;
        System.out.println("Sentencias de bucle en Java");
        System.out.println("Bucle while (mientras)");
        while (condicion) {
            // Bloque de código a ejecutar
        }
        /*
         * La condición del bucle se evalúa antes
         * de cada iteración. Si la condición es true,
         * se ejecuta el bloque de código.
         * Si la condición es false, el bucle termina.
         */

        // do while
        /*
         * Similar al while, excepto en que la expresion se evalua al final del bucle
         * se ejecuta al menos una vez
         */

         System.out.println("Bucle do-while (hacer mientras)");
        do {
            // Bloque de código a ejecutar
        } while (condicion);

        /*
         * La condición del bucle se evalúa después 
         * de cada iteración. Si la condición
         * es true, el bucle continúa. 
         * Si la condición es false, el bucle termina.
         */

        // for
        /*
         * Se utiliza cuando se conocen los limites del bucle
         * Partes:
         * inicio,final,incremento
         */

        for (int i = 0; i < 10; i++) {
            // expresiones
        }
        /*
         * System.out.println("Bucle for en Java");
         * for (inicializacion; condicion; actualizacion) {
         * // Bloque de código a ejecutar
         * }
         * 
         * La variable de control del bucle se inicializa
         * con el valor de inicializacion.
         * La condición del bucle se evalúa antes de cada iteración.
         * Si la condición es true, se ejecuta el bloque de código.
         * Si la condición es false, el bucle termina.
         * La variable de control se actualiza con el valor
         * de actualizacion después de cada iteración.
         */

        System.out.println("Imprimir los números del 1 al 10");
        for (int j = 1; j <= 10; j++) {
            // imprimos por consola
            System.out.println(j);
        }

        String arregloNombres[] = { "Ana", "Luis", "Marcos" };
        for (int k = 0; k < arregloNombres.length; k++) {
            System.out.println(k);
        }
    }

    public static void ejemploBucle() {
        System.out.println("Números del 1 al 10");
        int contador = 1;
        while (contador <= 10) {
            // mostramos por consola
            System.out.println(contador);
            contador++;// incrementamos
        }
    }
}
