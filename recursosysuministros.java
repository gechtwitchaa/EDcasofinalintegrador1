import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RecursoConsumido {
    private double cantidad;

    public RecursoConsumido(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
}

class ConsumoRecursos {
    private List<RecursoConsumido> registros;

    public ConsumoRecursos() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(RecursoConsumido registro) {
        registros.add(registro);
    }

    public double calcularTotal() {
        double total = 0;
        for (RecursoConsumido registro : registros) {
            total += registro.getCantidad();
        }
        return total;
    }

    public double calcularMedia() {
        if (registros.isEmpty()) {
            return 0;
        }
        return calcularTotal() / registros.size();
    }

    public double calcularMinimo() {
        if (registros.isEmpty()) {
            return 0;
        }
        return Collections.min(registros, (a, b) -> Double.compare(a.getCantidad(), b.getCantidad())).getCantidad();
    }

    public double calcularMaximo() {
        if (registros.isEmpty()) {
            return 0;
        }
        return Collections.max(registros, (a, b) -> Double.compare(a.getCantidad(), b.getCantidad())).getCantidad();
    }
}

public class recursosysuministros {
    public static void main(String[] args) {
        ConsumoRecursos consumoRecursos = new ConsumoRecursos();


        consumoRecursos.agregarRegistro(new RecursoConsumido(10));
        consumoRecursos.agregarRegistro(new RecursoConsumido(20));
        consumoRecursos.agregarRegistro(new RecursoConsumido(15));

       
        System.out.println("Total consumido: " + consumoRecursos.calcularTotal());
        System.out.println("Media de consumo: " + consumoRecursos.calcularMedia());
        System.out.println("Mínimo consumido: " + consumoRecursos.calcularMinimo());
        System.out.println("Máximo consumido: " + consumoRecursos.calcularMaximo());
    }
}
