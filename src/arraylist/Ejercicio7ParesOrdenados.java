package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7ParesOrdenados {

    public static void main(String[] args) {

        ArrayList<Integer> lista = generarPares();

        imprimirLista("Lista inicial:", lista);

        insertarNumeroOrdenado(lista);

        imprimirLista("Después de insertar:", lista);

        eliminarNumero(lista);

        imprimirLista("Después de eliminar:", lista);
    }

    // Genera los primeros 20 números pares
    public static ArrayList<Integer> generarPares() {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            lista.add(i * 2);
        }

        return lista;
    }

    // Insertar número en orden
    public static void insertarNumeroOrdenado(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un número a insertar: ");
        int numero = sc.nextInt();

        int i = 0;

        while (i < lista.size() && lista.get(i) < numero) {
            i++;
        }

        lista.add(i, numero); // inserta en la posición correcta
    }

    // Eliminar número
    public static void eliminarNumero(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un número a eliminar: ");
        int numero = sc.nextInt();

        if (lista.contains(numero)) {
            lista.remove(Integer.valueOf(numero));
            System.out.println("Número eliminado.");
        } else {
            System.out.println("El número no está en la lista.");
        }
    }

    // Imprimir lista
    public static void imprimirLista(String mensaje, ArrayList<Integer> lista) {
        System.out.println("\n" + mensaje);

        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}