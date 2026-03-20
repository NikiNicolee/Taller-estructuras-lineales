package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio8Frecuencias {

    public static void main(String[] args) {

        ArrayList<Integer> lista = generarNumeros();

        int[] frecuencias = contarFrecuencias(lista);

        imprimirFrecuencias(frecuencias);

        mostrarMasFrecuente(frecuencias);
    }

    // Generar 100 números entre 1 y 20
    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            lista.add(random.nextInt(20) + 1);
        }

        return lista;
    }

    // Contar frecuencias
    public static int[] contarFrecuencias(ArrayList<Integer> lista) {
        int[] frecuencias = new int[21]; // índice 1 a 20

        for (int num : lista) {
            frecuencias[num]++;
        }

        return frecuencias;
    }

    // Imprimir tabla
    public static void imprimirFrecuencias(int[] frecuencias) {
        System.out.println("Número | Frecuencia");

        for (int i = 1; i < frecuencias.length; i++) {
            System.out.println(i + "       | " + frecuencias[i]);
        }
    }

    // Encontrar el número más frecuente
    public static void mostrarMasFrecuente(int[] frecuencias) {
        int maxFrecuencia = 0;
        int numeroMasFrecuente = 0;

        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numeroMasFrecuente = i;
            }
        }

        System.out.println("\nNúmero más frecuente: " + numeroMasFrecuente);
        System.out.println("Veces que aparece: " + maxFrecuencia);
    }
} 