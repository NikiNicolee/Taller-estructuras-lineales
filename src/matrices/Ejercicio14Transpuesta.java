package matrices;

public class Ejercicio14Transpuesta {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        imprimirMatriz("Matriz original:", matriz);

        int[][] transpuesta = obtenerTranspuesta(matriz);

        imprimirMatriz("Matriz transpuesta:", transpuesta);
    }

    // Obtener transpuesta
    public static int[][] obtenerTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    // Imprimir matriz
    public static void imprimirMatriz(String mensaje, int[][] matriz) {
        System.out.println("\n" + mensaje);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}