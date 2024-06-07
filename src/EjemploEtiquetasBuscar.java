public class EjemploEtiquetasBuscar {
    public static void main(String[] args) {
        encontrarPalabraOptimizado();
    }

    public static void encontrarCaracter() {
        System.out.println("=Encontrado un caracter con etiquetas=\n");
        String frase = "Pablito clavó un clavito en la calva de un calvito. En la calva de un calvito, un clavito clavó Pablito. Pablito clavó un clavito. ¿Qué clavito clavó Pablito?.";
        System.out.println(frase);
        // recorremos la frase
        int tamanio = frase.length();
        int contador = 0;
        for (int i = 0; i < tamanio; i++) {
            if (frase.charAt(i) != 'v') {
                continue;
            }
            contador++;
        }
        System.out.println("Encontrado = " + contador + " veces el caracter t ");
    }

    public static void encontrarPalabra() {
        System.out.println("=Encontrado una palabra con etiquetas=\n");
        String frase = "Pablito clavó un clavito en la calva de un calvito. En la calva de un calvito, un clavito clavó Pablito. Pablito clavó un clavito. ¿Qué clavito clavó Pablito?.";
        System.out.println(frase);
        String palabra = "clavito";
        int maxPalabra = palabra.length();
        // recorremos la frase
        int tamanio = frase.length();
        int contador = 0;
        bucle1: for (int i = 0; i < tamanio; i++) {
            int k = i;// variable auxiliar
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue bucle1;
                }
            }
            contador++;
        }
        System.out.println("Encontrado = " + contador + " veces la palabra " + palabra);
    }

    public static void encontrarPalabraOptimizado() {
        System.out.println("=Encontrado una palabra con etiquetas=\n");
        String frase = "Pablito calva clavó un clavito en la calva de un calvito. En la calva de un calvito, un clavito clavó Pablito. Pablito clavó un clavito. ¿Qué clavito clavó Pablito?.";
        System.out.println(frase);
        String palabra = "calva";
        int maxPalabra = palabra.length();
        // recorremos la frase
        int tamanio = frase.length() - maxPalabra;
        int contador = 0;
        bucle1: for (int i = 0; i <= tamanio;) {
            int k = i;// variable auxiliar
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue bucle1;
                }
            }
            contador++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + contador + " veces la palabra " + palabra);
    }
}
