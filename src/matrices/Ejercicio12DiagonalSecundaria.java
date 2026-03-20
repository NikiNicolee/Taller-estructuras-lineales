package matrices;


import java.util.Random;

public class Ejercicio12DiagonalSecundaria {

    public static void main(String[] args) {

        int n = 4;

        int[][] matriz = generarMatriz(n);

        imprimirMatriz(matriz);

        int suma = sumarDiagonalSecundaria(matriz);

        System.out.println("\nSuma de la diagonal secundaria: " + suma);
    }

    // Generar matriz n x n con valores entre -50 y 50
    public static int[][] generarMatriz(int n) {
        Random random = new Random();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(101) - 50;
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

    // Sumar diagonal secundaria
    public static int sumarDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }

        return suma;
    }
} 
