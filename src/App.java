public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo");
        ejemplos();
    }

    public static void sentenciaCondicionales() {
        System.out.println("Condicionales en Java");
        boolean condicion = true;
        int exprecion = 1;

        if (condicion) {
            // expreciones a seguir
        } else if (condicion) {
            // expresiones a seguir
        } else {
            // expreciones a seguir
        }
        System.out.println("Condicionales en Java");
        switch (exprecion) {
            case 1:
                // expresiones
                break;
            case 2:
                // expresiones
                break;
            case 3:
                // expresiones
                break;
            default: // cuando ningun0 de los casos se cumple
                // expresiones
                break;
        }
    }

    public static void ejemplos() {
        float promedio = 6.5f;
        System.out.println(promedio);
        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio");
        } else {
            System.out.println("Necesitas esforzarte un poco mas");
        }
    }
}
