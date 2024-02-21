import java.util.ArrayList;
import java.util.List;

class Monitoreo {
    private double nivelRadiacion;
    private double temperatura;
    private double presion;

    public Monitoreo(double nivelRadiacion, double temperatura, double presion) {
        this.nivelRadiacion = nivelRadiacion;
        this.temperatura = temperatura;
        this.presion = presion;
    }

    public void verificarValoresExtremos() {
        if (nivelRadiacion > 100) {
            System.out.println("ALERTA: Nivel de radiación extremadamente alto. Se requieren medidas inmediatas.");
        }
        if (temperatura > 40) {
            System.out.println("ALERTA: Temperatura extremadamente alta. Se requieren medidas inmediatas.");
        }
        if (presion < 800) {
            System.out.println("ALERTA: Presión extremadamente baja. Se requieren medidas inmediatas.");
        }
    }

    public List<Integer> listarEventosRaros(int N) {
        List<Integer> eventosRaros = new ArrayList<>();
        int numero = 2; // Empezamos con el primer número primo

        while (eventosRaros.size() < N) {
            if (esPrimo(numero)) {
                eventosRaros.add(numero);
            }
            numero++;
        }

        return eventosRaros;
    }

    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> descomponerEnFactoresPrimos(int num) {
        List<Integer> factoresPrimos = new ArrayList<>();
        int divisor = 2;

        while (num > 1) {
            if (num % divisor == 0) {
                factoresPrimos.add(divisor);
                num /= divisor;
            } else {
                divisor++;
            }
        }

        return factoresPrimos;
    }
}

public class alertaymonitoreo {
    public static void main(String[] args) {
        Monitoreo monitoreo = new Monitoreo(110, 38, 780);
        monitoreo.verificarValoresExtremos();

        int N = 5; 
        List<Integer> eventosRaros = monitoreo.listarEventosRaros(N);
        System.out.println("Eventos raros (primeros " + N + " números primos): " + eventosRaros);

        int numero = 315;
        List<Integer> factoresPrimos = monitoreo.descomponerEnFactoresPrimos(numero);
        System.out.println("Factores primos de " + numero + ": " + factoresPrimos);
    }
}

