package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6LeerNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = leerNumeros();

        mostrarResultados(numeros);
    }

    // Leer números hasta que salga 10
    public static ArrayList<Integer> leerNumeros() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        int numero;

        do {
            numero = random.nextInt(21) - 10; // -10 a 10
            lista.add(numero);
        } while (numero != 10);

        return lista;
    }

    // Mostrar números, suma y promedio
    public static void mostrarResultados(ArrayList<Integer> lista) {
        int suma = 0;

        System.out.println("Números leídos:");

        for (int num : lista) {
            System.out.print(num + " ");
            suma += num;
        }

        double promedio = (double) suma / lista.size();

        System.out.println("\nSuma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}