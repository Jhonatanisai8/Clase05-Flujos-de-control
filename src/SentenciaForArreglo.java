public class SentenciaForArreglo {
    public static void main(String[] args) {
        System.out.println("SentenciaForArreglo.main()");
        iterandoArreglos();
    }

    public static void iterandoArreglos() {
        System.out.println("iterandoArreglos()");
        String nombres[] = { "Maria", "Pedro", "Juan", "Pedro", "Walter", "Juanito", "Carlos" };
        int longitud = nombres.length;
        for (int i = 0; i < longitud; i++) {
            if (nombres[i].equalsIgnoreCase("juan")) {
                continue;//omite el valor de juan
            }
            System.out.println(i+" "+nombres[i]);
        }
    }

  
}
