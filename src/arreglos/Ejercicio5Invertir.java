package arreglos;

import java.util.Random;

public class Ejercicio5Invertir {

    public static void main(String[] args) {

        int[] numeros = generarNumeros(20);
        int[] invertidos = invertirArreglo(numeros);

        imprimirArreglo("Números originales:", numeros);
        imprimirArreglo("Números invertidos:", invertidos);
    }

    // Genera números aleatorios entre 1 y 999
    public static int[] generarNumeros(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(999) + 1;
        }

        return numeros;
    }

    // Invierte cada número del arreglo
    public static int[] invertirArreglo(int[] numeros) {
        int[] invertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]);
        }

        return invertidos;
    }

    // Método para invertir un número
    public static int invertirNumero(int numero) {
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return invertido;
    }

    // Imprimir arreglo
    public static void imprimirArreglo(String mensaje, int[] arreglo) {
        System.out.println("\n" + mensaje);

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}