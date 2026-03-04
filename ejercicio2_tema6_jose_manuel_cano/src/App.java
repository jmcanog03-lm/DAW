import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GestoraJugadores gestora = new GestoraJugadores();
        Jugador jugador = new Jugador();
        Scanner sc = new Scanner(System.in);

        boolean salida = true;

        while (salida) {

            System.out.println();
            System.out.println("BIENVENIDO AL MENÚ");
            System.out.println("-------------------");

            System.out.println("1. BUSCAR JUGADOR POR DORSAL");
            System.out.println("2. AÑADIR UN NUEVO JUGADOR AL EQUIPO");
            System.out.println("3. ELIMINAR UN JUGADOR DEL EQUIPO");
            System.out.println("4. BUSCAR POR NOMBRE DE EQUIPO");
            System.out.println("5. MOSTRAR TODOS LOS JUGADORES");

            System.out.println();

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:

                    System.out.println("Introduce el dorsal a buscar");
                    int dorsal = Integer.parseInt(sc.nextLine());

                    gestora.buscarPorDorsal(dorsal);

                    break;

                case 2:
                    System.out.println("Introduce el nombre del jugador nuevo del equipo");
                    String nombreJugador = sc.nextLine();

                    System.out.println("Introduce la edad del jugador");
                    int edad = Integer.parseInt(sc.nextLine());

                    System.out.println("Introduce el dorsal del jugador");

                    int dorsal1 = Integer.parseInt(sc.nextLine());

                    System.out.println("Introduce la altura del jugador");
                    String altura = sc.nextLine();

                    System.out.println("Añade el nombre del equipo al que pertenece");
                    String nombreEquipo = sc.nextLine();

                    System.out.println("Introduce la posicion en la que juega el jugador");
                    String posicion = sc.nextLine();

                    System.out.println("Introduce los puntos que mete el jugador");
                    int puntos = Integer.parseInt(sc.nextLine());

                    gestora.agregarJugador(nombreJugador, edad, dorsal1, altura, nombreEquipo, posicion, puntos);

                    break;

                case 3:

                    System.out.println("Introduce el identificador del jugador que quieres eliminar");
                    int identificador = Integer.parseInt(sc.nextLine());
                    gestora.eliminarJugador(identificador);
                    break;

                case 4:

                    System.out.println(
                            "Introduce el nombre del equipo para mostrar todos los jugadores que hay dentro de el");
                    String nombredelEquipo = sc.nextLine();
                    gestora.buscarPorEquipo(nombredelEquipo);
                    break;

                case 5:
                    gestora.mostrarTodosLosJugadores();
                    break;

                

                default:
                    break;
            }
        }

    }
}
