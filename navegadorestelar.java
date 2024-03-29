import java.util.Arrays; // Importa la clase java.util.Arrays

public class navegadorestelar {
    private int[][] terreno;
    private int[][] construcciones;

    public navegadorestelar(int[][] terreno, int[][] construcciones) {
        this.terreno = terreno;
        this.construcciones = construcciones;
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] terreno = {
                {1, 0, 1},
                {0, 1, 1},
                {1, 1, 0}
        };

        int[][] construcciones = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        navegadorestelar navegador = new navegadorestelar(terreno, construcciones);

        int[][] resultado = multiplicarMatrices(terreno, construcciones);

        for (int[] fila : resultado) {
            System.out.println(Arrays.toString(fila));
        }
    }
}

