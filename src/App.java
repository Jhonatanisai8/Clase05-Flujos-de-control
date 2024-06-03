public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Condicionales en java");
        // ejemplos();
       // ejemplosCondicionalesCombinadas();
       ejemploAñoBisiesto();
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

    public static void ejemploAñoBisiesto() {
        int mes = 2;
        int numeroDias = 0;
        int anio = 2016;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if ((anio % 400 == 0) || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29;
                System.out.println("Año Bisiesto");
            } else {
                numeroDias = 28;
                System.out.println("Año no bisiesto");
            }
        }

        System.out.println("Dias: "+numeroDias);
        System.out.println("Año: "+anio);
    }
}
