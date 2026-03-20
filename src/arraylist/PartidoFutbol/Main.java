
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    private static final String ficheroPartidos = "PartidoLiga.txt";

    public static void main(String[] args) {
        System.out.println("Crear un ArrayList de objetos de ficheroPartidos");
        ArrayList<PartidoFutbol> partidosJugados = new ArrayList<>();

        File ficheroTrabajar = new File(ficheroPartidos);
        Scanner leerLinea = null;

        System.out.println("Leemos las líneas de cada partido del fichero");
        try {
            leerLinea = new Scanner(ficheroTrabajar);
            while (leerLinea.hasNext()) {
                String lineaDatoPartido = leerLinea.nextLine();
                String[] cortarString = lineaDatoPartido.split("::");

                PartidoFutbol partido = new PartidoFutbol();

                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolLocal(Integer.parseInt(cortarString[2]));
                partido.setGolVisitante(Integer.parseInt(cortarString[3]));

                partidosJugados.add(partido);
            }
        } catch (Exception e) {
            System.out.println("No se logra leer el archivo txt");
        }

        System.out.println("Número de partidos jugados: " + partidosJugados.size());

        imprimirPartidos(partidosJugados);

        mostrarGanadorVisitante(partidosJugados);

        contarVictoriasBarcelona(partidosJugados);

        eliminarNoEmpates(partidosJugados);

        contarVictoriasLocal(partidosJugados);
    }

    // 🔹 Imprimir partidos
    public static void imprimirPartidos(ArrayList<PartidoFutbol> lista) {
        System.out.println("\nLista de partidos:");

        for (PartidoFutbol partido : lista) {
            System.out.println(partido.getEquipoLocal() + " " +
                    partido.getGolLocal() + " - " +
                    partido.getGolVisitante() + " " +
                    partido.getEquipoVisitante());
        }
    }

    // 🔹 1. Mostrar donde ganó el visitante
    public static void mostrarGanadorVisitante(ArrayList<PartidoFutbol> lista) {
        System.out.println("\nPartidos donde ganó el visitante:");

        for (PartidoFutbol partido : lista) {
            if (partido.getGolVisitante() > partido.getGolLocal()) {
                System.out.println(partido.getEquipoLocal() + " " +
                        partido.getGolLocal() + " - " +
                        partido.getGolVisitante() + " " +
                        partido.getEquipoVisitante());
            }
        }
    }

    // 🔹 2. Contar victorias del Barcelona
    public static void contarVictoriasBarcelona(ArrayList<PartidoFutbol> lista) {
        int contador = 0;

        for (PartidoFutbol partido : lista) {
            if (partido.getEquipoLocal().equals("Barcelona") &&
                    partido.getGolLocal() > partido.getGolVisitante()) {
                contador++;
            } else if (partido.getEquipoVisitante().equals("Barcelona") &&
                    partido.getGolVisitante() > partido.getGolLocal()) {
                contador++;
            }
        }

        System.out.println("\nVictorias del Barcelona: " + contador);
    }

    // 🔹 3. Eliminar los que no son empate
    public static void eliminarNoEmpates(ArrayList<PartidoFutbol> lista) {
        Iterator<PartidoFutbol> it = lista.iterator();

        while (it.hasNext()) {
            PartidoFutbol partido = it.next();

            if (partido.getGolLocal() != partido.getGolVisitante()) {
                it.remove();
            }
        }

        System.out.println("\nPartidos restantes (solo empates):");
        imprimirPartidos(lista);
    }

    // 🔹 4. Contar victorias del local
    public static void contarVictoriasLocal(ArrayList<PartidoFutbol> lista) {
        int contador = 0;

        for (PartidoFutbol partido : lista) {
            if (partido.getGolLocal() > partido.getGolVisitante()) {
                contador++;
            }
        }

        System.out.println("\nPartidos ganados por el local: " + contador);
    }
}