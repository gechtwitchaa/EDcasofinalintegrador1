import java.util.Arrays;

class PlanificadorTareas {
    private String[] miembrosTripulacion;
    private int[][] tareasDiarias;

    public PlanificadorTareas(String[] miembrosTripulacion, int[][] tareasDiarias) {
        this.miembrosTripulacion = miembrosTripulacion;
        this.tareasDiarias = tareasDiarias;
    }

    public void visualizarTablaTareas() {
        System.out.println("Tabla de tareas diarias:");
        for (int i = 0; i < miembrosTripulacion.length; i++) {
            System.out.println(miembrosTripulacion[i] + ": " + Arrays.toString(tareasDiarias[i]));
        }
    }

    public void calcularCargaTrabajoOptima() {
        System.out.println("\nCarga de trabajo óptima para cada miembro:");
        for (int i = 0; i < miembrosTripulacion.length; i++) {
            int[] tareas = tareasDiarias[i];
            int productoEscalar = 0;
            for (int tarea : tareas) {
                productoEscalar += tarea;
            }
            System.out.println(miembrosTripulacion[i] + ": " + productoEscalar);
        }
    }
}

public class planificadordetareas {
    public static void main(String[] args) {
        String[] miembros = {"Miembro 1", "Miembro 2", "Miembro 3"};
        int[][] tareas = {
                {2, 4, 6, 8},
                {1, 3, 5, 7},
                {9, 10, 11, 12}
        };

        PlanificadorTareas planificador = new PlanificadorTareas(miembros, tareas);
        planificador.visualizarTablaTareas();
        planificador.calcularCargaTrabajoOptima();
    }
}
