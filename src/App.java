public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Condicionales en java");
        //ejemplos();
        ejemplosCondicionalesCombinadas();
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

    public static void ejemplosCondicionalesCombinadas() {
        float promedio = 4.5f;
        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzaste mas!");
        } else if (promedio >= 4.0) {
            System.out.println("Insufiente, necesitas esforzaste mas!");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Tu promedio es:  " + promedio);
    }
}
