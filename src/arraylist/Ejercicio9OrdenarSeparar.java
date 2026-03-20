package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9OrdenarSeparar {

    public static void main(String[] args) {

        ArrayList<Integer> lista = generarNumeros();

        imprimirLista("Lista original:", lista);

        ordenarAscendente(lista);
        imprimirLista("Orden ascendente:", lista);

        ordenarDescendente(lista);
        imprimirLista("Orden descendente:", lista);

        ArrayList<Integer> pares = obtenerPares(lista);
        ArrayList<Integer> impares = obtenerImpares(lista);

        imprimirLista("Números pares:", pares);
        imprimirLista("Números impares:", impares);
    }

    // Generar números
    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(100) + 1);
        }

        return lista;
    }

    // Orden ascendente
    public static void ordenarAscendente(ArrayList<Integer> lista) {
        Collections.sort(lista);
    }

    // Orden descendente
    public static void ordenarDescendente(ArrayList<Integer> lista) {
        Collections.reverse(lista);
    }

    // Obtener pares
    public static ArrayList<Integer> obtenerPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        return pares;
    }

    // Obtener impares
    public static ArrayList<Integer> obtenerImpares(ArrayList<Integer> lista) {
        ArrayList<Integer> impares = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 != 0) {
                impares.add(num);
            }
        }

        return impares;
    }

    // Imprimir lista
    public static void imprimirLista(String mensaje, ArrayList<Integer> lista) {
        System.out.println("\n" + mensaje);

        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}