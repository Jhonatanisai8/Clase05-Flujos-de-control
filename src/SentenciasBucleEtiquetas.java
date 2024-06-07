public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        ejemploAninadado();
    }

    public static void ejemploAninadado() {

        bucle1: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == 2) {// omite el número dos el bucle iterabl con i
                    continue bucle1;
                }
                System.out.println("i= " + i + " j= " + j);
            }
        }
    }

    public static void ejemplofor() {
        for (int j = 0; j < 10; j++) {
            if (j == 2) {// omite el número dos
                continue;
            }
            System.out.println(j);
        }
    }
}
