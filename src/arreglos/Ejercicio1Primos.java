package arreglos;

public class Ejercicio1Primos {

    public static void main(String[] args) {
        int[] numerosPrimos = obtenerPrimos();
        imprimirPrimos(numerosPrimos);
    }

    public static int[] obtenerPrimos() {
        return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    }

    public static void imprimirPrimos(int[] primos) {
        for (int numero : primos) {
            System.out.println(numero);
        }
    }
}