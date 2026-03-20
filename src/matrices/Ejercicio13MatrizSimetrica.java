package matrices;

import java.util.Random;

public class Ejercicio13MatrizSimetrica {

    public static void main(String[] args) {

        int n = 4;

        int[][] matriz = generarMatriz(n);

        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("\nLa matriz es simétrica");
        } else {
            System.out.println("\nLa matriz NO es simétrica");
        }

        imprimirEsquinas(matriz);
    }

    // Generar matriz
    public static int[][] generarMatriz(int n) {
        Random random = new Random();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        return matriz;
    }

    // Imprimir matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Verificar simetría
    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Imprimir esquinas
    public static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;

        System.out.println("\nEsquinas de la matriz:");

        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][n - 1]);
    }
}
