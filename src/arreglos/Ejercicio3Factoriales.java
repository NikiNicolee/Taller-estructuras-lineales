package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Factoriales {

    public static void main(String[] args) {
        int n = leerCantidad();
        
        int[] numeros = generarNumerosAleatorios(n);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirArreglo("Números originales:", numeros);
        imprimirArreglo("Factoriales:", factoriales);
    }

    // Leer cantidad de números
    public static int leerCantidad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        return sc.nextInt();
    }

    // Generar números aleatorios
    public static int[] generarNumerosAleatorios(int n) {
        Random random = new Random();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(10) + 1; // entre 1 y 10
        }

        return numeros;
    }

    // Calcular factoriales
    public static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        return factoriales;
    }

    // Método para calcular factorial
    public static long calcularFactorial(int numero) {
        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // Método para imprimir arreglos
    public static void imprimirArreglo(String mensaje, int[] arreglo) {
        System.out.println("\n" + mensaje);
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void imprimirArreglo(String mensaje, long[] arreglo) {
        System.out.println("\n" + mensaje);
        for (long num : arreglo) {
            System.out.print(num + " ");
        }
    }
}