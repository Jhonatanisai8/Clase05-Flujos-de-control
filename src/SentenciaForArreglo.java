public class SentenciaForArreglo {
    public static void main(String[] args) {
        System.out.println("SentenciaForArreglo.main()");
        usoContainsAlIterarArreglo();
    }

    public static void iterandoArreglos() {
        System.out.println("iterandoArreglos()");
        String nombres[] = { "Maria", "Pedro", "Juan", "Pedro", "Walter", "Juanito", "Carlos" };
        int longitud = nombres.length;
        for (int i = 0; i < longitud; i++) {
            if (nombres[i].equalsIgnoreCase("juan")) {
                continue;// omite el valor de juan
            }
            System.out.println(i + " " + nombres[i]);
        }
    }

    public static void usoContainsAlIterarArreglo() {
        System.out.println("usoContainsAlIterarArreglo()");
        String nombres[] = { "Maria", "Pedro", "Juan", "Pedro", "Walter", "Juanito", "Carlos" };
        int longitud = nombres.length;
        for (int i = 0; i < longitud; i++) {
            if (nombres[i].contains("Juan")
                    || nombres[i].contains("Maria")) {
                continue;// omite el valor de juan
            }
            System.out.println(i + " " + nombres[i]);
        }
    }
}
