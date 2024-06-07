
public class SentenciaWhile {
    public static void main(String[] args) {
        otroEjemploWhile();     
    }

    public static void sentenciaWhile() {
        System.out.println("Sentencia WHILE");
        // nuestro contador
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
    }

    public static void otroEjemploWhile(){
        int i = 0;
        boolean prueba = true;
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println(" "+i);
            i++;
        }
    }
}