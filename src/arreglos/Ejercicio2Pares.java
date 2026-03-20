package arreglos;

public class Ejercicio2Pares {

    public static void main(String[] args) {
        int[] pares = generarPares(100);

        imprimirEnUnaLinea(pares);
        imprimirEnDiezLineas(pares);
    }

    public static int[] generarPares(int cantidad) {
        int[] pares = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            pares[i] = (i + 1) * 2;
        }

        return pares;
    }

    public static void imprimirEnUnaLinea(int[] arreglo) {
        System.out.println("\nPares en una sola línea:");

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void imprimirEnDiezLineas(int[] arreglo) {
        System.out.println("\n\nPares en 10 líneas:");

        for (int i = 0; i < arreglo.length; i++) {

            if (i % 10 == 0) {
                System.out.print("\nLínea " + (i / 10 + 1) + ": ");
            }

            System.out.print(arreglo[i] + " ");
        }
    }
}