import java.util.Scanner;

public class Gimnasio {
    private final static Scanner sc = new Scanner(System.in);
    private Maquina[] maquinas;
    private Pesas[] pesas;
    private Maquina[] maquinaEncontrada;
    private Pesas[] pesasEncontradas;
   
    private int contador;
    private int tamano;

    public Gimnasio() {
        this.tamano = 100;
        this.maquinas = new Maquina[tamano];
        this.maquinaEncontrada = new Maquina[tamano];
        this.pesas = new Pesas[tamano];
        this.pesasEncontradas = new Pesas[tamano];
        datosPrueba();

    }

    private void datosPrueba() {
        Maquina maquina1 = new Maquina("Brazo", "12/05/2024", false);
        Pesas pesa1 = new Pesas("Pesa1", "09082021");
        maquinas[0] = maquina1;
        pesas[0] = pesa1;
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
                    agregarMaquinasPesas();
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

            System.out.println();
        }
    }

    public void buscarMateriales() {

        System.out.println(
                "Introduce 1 si quieres buscar la maquina por id  y 2  por nombre de la maquina o 3 para buscar pesas por nombre y 4 para buscar pesas por id");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                buscarMaquinaPorID();
               

                break;

            case 2:

             buscarMaquinaPorNombre();
                
                break;

            default:
                break;
        }
    }

    public void agregarMaquinasPesas() {
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
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion() + " Estado  " + m.getOcupado());
            }
        }

    }


    
    public void buscarPesasPorNombre() {
        int j = 0;

        System.out.println("Introduce el nombre de la pesa a buscar");

        String identificador = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (pesas[i].getNombrePesa().equals(identificador)) {
                this.pesasEncontradas[j] = pesas[i];
                j++;
            }
        }

        for (Pesas p : this.pesasEncontradas) {
            if (p != null) {
                System.out.println("Identificador de la maquina: " + p.getIdentificador() + "\n Nombre de la maquina "
                        + p.getNombrePesa() + "\n Fecha de fabricacion " + p.getFechaFabricacion());
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
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion() + " Estado  " + m.getOcupado());
            }
        }
    }

    public void listarMaquinas() {
        for (Maquina m : maquinas) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion() + " Estado  " + m.getOcupado());
            }
        }
    }

    public void cambiarEstadoMaquina() {
        buscarMaquinaPorNombre();

        System.out.println("Quieres desocupar o ocupar una maquina");

        String opcion = sc.nextLine();

        switch (opcion) {
            case "ocupar":
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
