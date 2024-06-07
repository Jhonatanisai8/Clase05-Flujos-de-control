public class SentenciaFor {
    public static void main(String[] args) {
        forDecremento();        
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

    public static void forDecremento() {
        System.out.println("=Bucle for en forma de decremento=");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
