public class EjemploEtiquetasBuscar {
    public static void main(String[] args) {
        encontrarCaracter();
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
        System.out.println("Encontrado = "+contador+" veces el caracter t ");
    }
}
