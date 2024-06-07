public class SentenciaForArreglo {
    public static void main(String[] args) {
        System.out.println("SentenciaForArreglo.main()");
        buscarArreglo();
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
            if (nombres[i].toLowerCase().contains("Juan".toLowerCase())
                    || nombres[i].toLowerCase().contains("Maria".toLowerCase())) {
                continue;// omite el valor de juan
            }
            System.out.println(i + " " + nombres[i]);
        }
    }

    public static void buscarArreglo() {
        String nombres[] = { "Maria", "Pedro", "Juan", "Pedro", "Walter", "Juanito", "Carlos" };
        int longitud = nombres.length;
        String buscar = "Juan";
        boolean encontrado = false;
        for (int i = 0; i < longitud; i++) {
            System.out.println(i+" "+nombres[i]);
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(buscar + " " + "encontrado");
        } else {
            System.out.println(buscar + " " + "no encontrado");
        }
    }
}
