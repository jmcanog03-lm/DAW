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

    public void agregarJugador(String nombreJugador, int edad, int dorsal, String altura, String nombreEquipo,
            String posicion, int puntosTotales) {

        Jugador jugador = new Jugador(nombreJugador, edad, false, dorsal, dorsal, puntosTotales, nombreEquipo, posicion);

        lista.add(jugador);
    }

    public void eliminarJugador(int identificador) {

        Jugador jugador = lista.remove(identificador);

    }

    public void buscarPorDorsal(int dorsal) {

        for (int i = 0; i < lista.size(); i++) {

            Jugador jugador = lista.get(i);

            if (jugador.getDorsal() == dorsal) {
                System.out.println(lista.get(i));
            }
        }
    }

    public void buscarPorEquipo(String nombreEquipo) {

        extracted(nombreEquipo);

    }

    private void extracted(String nombreEquipo) {
        for (int i = 0; i < lista.size(); i++) {

            Jugador jugador = lista.get(i);

            if (jugador.getNombreEquipo().equals(nombreEquipo)) {
                System.out.println(lista.get(i));
            }

        }
    }

    public void mostrarTodosLosJugadores() {
        for (int i = 0; i < lista.size(); i++) {
            Jugador jugador = lista.get(i);
            System.out.println(lista.get(i));
        }

    }

    public void modificarNombreJugador(Jugador jugador , int identificador){


        for (int i = 0; i < lista.size(); i++) {

            jugador = lista.get(i);

            if (jugador.getIdentificador() == identificador) {
                jugador = lista.remove(i);
            }

        }

    }

}