package arreglos;

import java.util.Random;

public class Ejercicio4MayorMenor {

    public static void main(String[] args) {

        int[] numeros = generarNumeros(25);

        imprimirArreglo(numeros);

        int menor = encontrarMenor(numeros);
        int mayor = encontrarMayor(numeros);

        System.out.println("\nNúmero menor: " + menor);
        System.out.println("Número mayor: " + mayor);
    }

    // Genera números aleatorios entre -50 y 50
    public static int[] generarNumeros(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(101) - 50;
        }

        return numeros;
    }

    // Imprime el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        System.out.println("Números generados:");

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    // Encuentra el menor
    public static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0]; // asumimos que el primero es el menor

        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }

        return menor;
    }

    // Encuentra el mayor
    public static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0]; // asumimos que el primero es el mayor

        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }

        return mayor;
    }
}