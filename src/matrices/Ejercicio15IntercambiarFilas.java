package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15IntercambiarFilas {

    public static void main(String[] args) {

        int filas = leerNumero("Ingrese número de filas: ");
        int columnas = leerNumero("Ingrese número de columnas: ");

        int[][] matriz = generarMatriz(filas, columnas);

        imprimirMatriz("Matriz original:", matriz);

        intercambiarFilas(matriz);

        imprimirMatriz("Matriz después de intercambiar:", matriz);
    }

    // Leer número
    public static int leerNumero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }

    // Generar matriz
    public static int[][] generarMatriz(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }

        return matriz;
    }

    // Intercambiar fila 0 con fila 1
    public static void intercambiarFilas(int[][] matriz) {

        if (matriz.length < 2) {
            System.out.println("No hay suficientes filas para intercambiar.");
            return;
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int temp = matriz[0][j];
            matriz[0][j] = matriz[1][j];
            matriz[1][j] = temp;
        }
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