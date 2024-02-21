public class cronometrocosmico {

    private static final double TIEMPO_PLANETA = 1.5;


    public static void calcularTiempo(double tiempoTierra) {
        double tiempoNuevoPlaneta = tiempoTierra / TIEMPO_PLANETA;


        double segundos = tiempoNuevoPlaneta % 60;
        double minutos = (tiempoNuevoPlaneta / 60) % 60;
        double horas = (tiempoNuevoPlaneta / (60 * 60)) % 24;
        double dias = (tiempoNuevoPlaneta / (60 * 60 * 24)) % 365;
        double años = tiempoNuevoPlaneta / (60 * 60 * 24 * 365);

        System.out.println("Tiempo en el nuevo planeta:");
        System.out.println("Años: " + años);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }

    public static void mayoresValoresRepresentables() {
        System.out.println("Mayores valores representables en el nuevo planeta:");

        System.out.println("Enteros:");
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);

        System.out.println("Punto flotante:");
        System.out.println("Float: " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE);
    }

    public static void main(String[] args) {

        double tiempoTierra = 3600 * 24 * 365 * 30; // 30 años en segundos
        calcularTiempo(tiempoTierra);

        mayoresValoresRepresentables();
    }
}

