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
