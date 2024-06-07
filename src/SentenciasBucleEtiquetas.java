public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        ejemploAninadadoDiasSemana();
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

    public static void ejemploAninadadoBreak() {
        bucle1: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == 2) {// omite el número dos el bucle iterabl con i
                    break bucle1;
                }
                System.out.println("i= " + i + " j= " + j);
            }
        }
    }

    public static void ejemploAninadadoDiasSemana() {
        bucle1: for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (i == 6 || i == 7) {// omite el número dos el bucle iterabl con i
                    System.out.println("Dia: " + i + " descando fin de semana");
                    continue bucle1;
                }
                System.out.println("Dia " + i + " trabajando " + j + " Horas");
            }
        }
    }
}
