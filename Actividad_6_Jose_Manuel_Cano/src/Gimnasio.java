import java.util.Scanner;

public class Gimnasio {
    private final static Scanner sc = new Scanner(System.in);
    private Maquina[] maquinas;
    private Maquina[] maquinaEncontrada;
    private int contador;
    private int tamano;

    public Gimnasio() {
        this.tamano = 100;
        this.maquinas = new Maquina[tamano];
        this.maquinaEncontrada = new Maquina[tamano];
        datosPrueba();

    }

    private void datosPrueba() {
        Maquina maquina1 = new Maquina("Brazo", "12/05/2024", false);
        maquinas[0] = maquina1;
        contador++;
    }

    public void Menu() {

        boolean salida = true;

        while (salida) {

            System.out.println("BIENVENIDO AL MENÚ");

            System.out.println("------------------");

            System.out.println("1. BUSCAR MATERIALES POR IDENTIFICADOR O NOMBRE DE LA MAQUINA");
            System.out.println("2. AGREGAR MAQUINA");
            System.out.println("3. LISTAR MATERIALES");
            System.out.println("4. CAMBIAR ESTADO MAQUINA");
            System.out.println("5. SALIR");

            System.out.println("------------------");
            System.out.println();

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    buscarMateriales();
                    break;

                case 2:
                    agregarMaquinas();
                    break;

                case 3:
                    listarMaquinas();
                    break;

                case 4:
                    cambiarEstadoMaquina();
                    break;

                case 5:
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

    public void agregarMaquinas() {
        System.out.println("Introduce el nombre de la maquina");
        String nombre = sc.nextLine();

        System.out.println("Introduce la fecha de fabricacion");

        String fechaFabricacion = sc.nextLine();

        Maquina maquina = new Maquina(nombre, fechaFabricacion, false);

        if (contador < tamano) {
            maquinas[contador] = maquina;

            contador++;
        } else {
            System.out.println("Array lleno");
        }

    }

    public void buscarMaquinaPorNombre() {
        int j = 0;

        System.out.println("Introduce el nombre de la maquina a buscar");

        String identificador = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (maquinas[i].getNombreMaquinas().equals(identificador)) {
                this.maquinaEncontrada[j] = maquinas[i];
                j++;
            }
        }

        for (Maquina m : this.maquinaEncontrada) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion());
            }
        }

    }

    public void buscarMaquinaPorID() {

        int j = 0;

        System.out.println("Introduce el identificador de la maquina que quieres encontrar");

        int identificador = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < contador; i++) {
            if (maquinas[i].getIdentificador() == identificador) {

                this.maquinaEncontrada[j] = maquinas[i];
                j++;
            }
        }

        for (Maquina m : this.maquinaEncontrada) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion());
            }
        }
    }

    public void listarMaquinas() {
        for (Maquina m : maquinas) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion());
            }
        }
    }

    public void cambiarEstadoMaquina() {
        buscarMaquinaPorNombre();

        System.out.println("Quieres desocupar o ocupar una maquina");

        String opcion = sc.nextLine();

        switch (opcion) {
            case "ocupado":
                for (int i = 0; i < maquinaEncontrada.length; i++) {
                    if (maquinaEncontrada[i] != null)
                        maquinaEncontrada[i].ocupar();

                }

                break;

            case "desocupar":
                for (int i = 0; i < maquinaEncontrada.length; i++) {
                    if (maquinaEncontrada[i] != null)
                        maquinaEncontrada[i].desocupar();

                }
                break;

            default:
                break;
        }

    }

    

}
