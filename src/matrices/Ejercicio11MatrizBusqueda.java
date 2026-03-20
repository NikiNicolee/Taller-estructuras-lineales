package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11MatrizBusqueda {

    public static void main(String[] args) {

        int filas = 4;
        int columnas = 5;

        int[][] matriz = generarMatriz(filas, columnas);

        imprimirMatriz(matriz);

        int numeroBuscado = leerNumero();

        buscarNumero(matriz, numeroBuscado);
    }

    // Generar matriz con números aleatorios (1 a 50)
    public static int[][] generarMatriz(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
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

    // Leer número
    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el número a buscar: ");
        return sc.nextInt();
    }

    // Buscar número
    public static void buscarNumero(int[][] matriz, int numero) {

        boolean encontrado = false;

        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numero) {
                    System.out.println("\nNúmero encontrado en posición: [" + i + "][" + j + "]");
                    encontrado = true;
                    break; // salir del for interno
                }
            }
        }

        if (!encontrado) {
            System.out.println("\nEl número no se encuentra en la matriz.");
        }
    }
}