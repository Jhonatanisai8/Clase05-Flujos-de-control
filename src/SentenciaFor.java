public class SentenciaFor {
    public static void main(String[] args) {
        otroFormaDiferenteFor();
    }

    public static void otroFormaDiferenteFor() {
        System.out.println("==OTRA FORMA DE IMPLEMENTACIÓN DEL BUBLE FOR==");
        int i = 0;
        for (;;) {
            if (i > 5) {
                break;
            }
            i++;
            System.out.println(i);
        }
    }
}
