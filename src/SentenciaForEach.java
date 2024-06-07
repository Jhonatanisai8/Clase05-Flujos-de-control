public class SentenciaForEach {
    public static void main(String[] args) {
        ejemploForeach();
        ejemploForeachString();
    }

    public static void ejemploForeach() {
        System.out.println("=Sentencia  =");
        int numerosImpares[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
        for (int num : numerosImpares) {
            System.out.println(num);
        }
    }

    public static void ejemploForeachString() {
        System.out.println("Sentencia for each con Arreglo de tipo String");
        String nombres[] = { "Alberto", "Pedro", "Juan" };
        for (String string : nombres) {
            System.out.println(string);
        }
    }
}
