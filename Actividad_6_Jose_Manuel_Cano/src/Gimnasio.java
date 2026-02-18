import java.util.Scanner;

public class Gimnasio {
    private final static Scanner sc = new Scanner(System.in);
    private Maquina[] maquinas;
    private int contador;

    private int tamano;

    public Gimnasio() {
        this.tamano = 100;
        this.maquinas = new Maquina[tamano];
        datosPrueba();

    }

    private void datosPrueba() {
        Maquina maquina1 = new Maquina("Brazo", "12/05/2024");
        maquinas[0] = maquina1;
        contador++;
    }

    public void Menu() {

        boolean salida = true;

        while (salida) {

            System.out.println("BIENVENIDO AL MENU PON 1 PARA CONTINUAR O 2 PARA SALIR ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:

                    buscarMateriales();

                    break;

                case 2:
                    salida = false;

                default:
                    break;
            }
        }
    }

    public void buscarMateriales() {

        System.out.println(
                "Introduce 1 si quieres buscar la maquina por el nombre o 2 si lo quieres buscar por identificador");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:

                buscarMaquinaPorNombre();

                break;

            case 2:
                buscarMaquinaPorID();
                break;

            default:
                break;
        }
    }

    public void buscarMaquinaPorNombre() {
        Maquina[] maquinaEncontrada;

        int j = 0;
        maquinaEncontrada = new Maquina[contador];

        System.out.println("Introduce el nombre de la maquina a buscar");

        String identificador = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (maquinas[i].getNombreMaquinas().equals(identificador)) {
                maquinaEncontrada[j] = maquinas[i];
                j++;
            }
        }

        for (Maquina m : maquinaEncontrada) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion());
            }
        }

    }

    public void buscarMaquinaPorID() {
        Maquina[] maquinaEncontrada;
        int j = 0;

        maquinaEncontrada = new Maquina[contador];

        System.out.println("Introduce el identificador de la maquina que quieres encontrar");

        int identificador = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < contador; i++) {
            if (maquinas[i].getIdentificador() == identificador) {

                maquinaEncontrada[j] = maquinas[i];
                j++;
            }
        }

        for (Maquina m : maquinaEncontrada) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion());
            }
        }
    }

}
