import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestoraJugadores {

    List<Jugador> lista;

    private final static Scanner sc = new Scanner(System.in);

    public GestoraJugadores() {
        this.lista = new ArrayList<>();
        datosPruebas();
    }

    public void datosPruebas() {
        Jugador jugador1 = new Jugador("Lebron", 2, false, 20, 171, 3, "Lakers", "Ala-Pivot");
        Jugador jugador2 = new Jugador("Curry", 2, false, 10, 165, 3, "Lakers", "Base");
        lista.add(jugador1);
        lista.add(jugador2);
    }

    public void agregarJugador(String nombreJugador, int edad, int dorsal, int altura, String nombreEquipo,
            String posicion, int puntosTotales) {

        Jugador jugador = new Jugador(nombreJugador, edad, false, dorsal, altura, puntosTotales, nombreEquipo,
                posicion);

        lista.add(jugador);
    }

    public void eliminarJugador(int identificador) {

        for (int i = 0; i < lista.size(); i++) {

            Jugador jugador = lista.get(i);

            if (jugador.getIdentificador() == identificador) {

                lista.remove(i);
                System.out.println("Jugador Eliminado Correctamente");

            }

        }
    }

    public void buscarPorDorsal(int dorsal) {

        for (int i = 0; i < lista.size(); i++) {

            Jugador jugador = lista.get(i);

            if (jugador.getDorsal() == dorsal) {
                System.out.println("Jugadores encontrados");
                System.out.println();
                System.out.println(lista.get(i));
            }
        }
    }

    public void buscarPorEquipo(String nombreEquipo) {

        for (int i = 0; i < lista.size(); i++) {

            Jugador jugador = lista.get(i);

            if (jugador.getNombreEquipo().equals(nombreEquipo)) {

                System.out.println("Jugadores que forman parte del equipo a buscar");
                System.out.println(lista.get(i));

                System.out.println();
            }

        }

    }

    public void mostrarTodosLosJugadores() {
        for (int i = 0; i < lista.size(); i++) {
            Jugador jugador = lista.get(i);
            System.out.println(lista.get(i));
        }

    }

    public void modificarJugador(int identificador, String nombreJugador, int edad, int dorsal, int altura,
            String nombreEquipo,
            String posicion, int puntosTotales) {

        for (int i = 0; i < lista.size(); i++) {

            Jugador jugador = lista.get(i);

            if (jugador.getIdentificador() == identificador) {

                Jugador jugadorNuevo = new Jugador(nombreJugador, edad, false, dorsal, altura, puntosTotales,
                        nombreEquipo, posicion);

                lista.set(i, jugadorNuevo);

                System.out.println("El jugador seleccionado se ha actualizado correctamente");

            }

        }

    }

}