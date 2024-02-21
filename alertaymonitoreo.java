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

