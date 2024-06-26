
public class SentenciaWhile {
    public static void main(String[] args) {
        otroEjemploDoWhile();
    }

    public static void sentenciaWhile() {
        System.out.println("Sentencia WHILE");
        // nuestro contador
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void otroEjemploWhile() {
        int i = 0;
        boolean prueba = true;
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println(" " + i);
            i++;
        }
    }

    public static void sentenciaDoWhile() {
        System.out.println("Sentencia Do-While");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void otroEjemploDoWhile(){
        boolean prueba = true;
        int i = 0;
        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i: "+i);
            i++;
        } while (prueba);
    }

}