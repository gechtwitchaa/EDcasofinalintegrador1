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

   