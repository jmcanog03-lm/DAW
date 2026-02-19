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
        Pesas pesa1 = new Pesas("Pesa1", "09082021", 5);
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
            System.out.println("2. AGREGAR UNA MAQUINA O UNA PESA");
            System.out.println("3. LISTAR TODOS LOS MATERIALES");
            System.out.println("4. CAMBIAR ESTADO DE UNA MAQUINA");
            System.out.println("5. SUMULAR USO DE UNA MAQUINA O UNA PESA");
            System.out.println("6. SALIR");

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
                    listarMateriales();
                    break;

                case 4:
                    cambiarEstadoMaquina();
                    break;

                case 5:
                    simularUso();
                    break;

                case 6:
                    salida = false;

                default:
                    System.out.println("Elige bien el numero");
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

            case 3:
                buscarPesasPorNombre();
                break;

            case 4:
                buscarPesasPorID();
                break;

            default:
                break;
        }
    }

    public void agregarMaquinasPesas() {

        System.out.println("Elige 1 si quieres agregar una maquina o 2 si quieres agregar una pesa");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                agregarM();
                break;

            case 2:
                agregarP();
                break;

            default:
                break;
        }

    }

    public void agregarM() {
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

    public void agregarP() {
        System.out.println("Introduce el nombre de la pesa");
        String nombre = sc.nextLine();

        System.out.println("Introduce la fecha de fabricacion");

        String fechaFabricacion = sc.nextLine();

        System.out.println("Introduce el peso que tiene la pesa");

        int peso = Integer.parseInt(sc.nextLine());

        Pesas pesa = new Pesas(nombre, fechaFabricacion, peso);

        if (contador < tamano) {
            pesas[contador] = pesa;

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
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion() + "\n Estado  "
                        + m.getOcupado());
                        System.out.println();
            }
            
        }

        System.out.println();

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
                System.out.println("Identificador de la pesa: " + p.getIdentificador() + "\n Nombre de la maquina "
                        + p.getNombrePesa() + "\n Fecha de fabricacion " + p.getFechaFabricacion()  + "\n Peso " + p.getPeso() );
                        System.out.println();
            }
        }

        System.out.println();

    }

    public void buscarPesasPorID() {
        int j = 0;

        System.out.println("Introduce el id de la pesa a buscar");

        int identificador = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < contador; i++) {
            if (pesas[i].getIdentificador() == identificador) {

                this.pesasEncontradas[j] = pesas[i];
                j++;
            }
        }

        for (Pesas p : this.pesasEncontradas) {
            if (p != null) {
                System.out.println("Identificador de la pesa: " + p.getIdentificador() + "\n Nombre de la maquina "
                        + p.getNombrePesa() + "\n Fecha de fabricacion " + p.getFechaFabricacion() + "\n Peso " + p.getPeso());
                        System.out.println();
            }
        }

        System.out.println();
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
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion() + "\n Estado  "
                        + m.getOcupado());
                        System.out.println();
            }
        }

        System.out.println();
    }

    public void listarMateriales() {
        for (Maquina m : maquinas) {
            if (m != null) {
                System.out.println("Identificador de la maquina: " + m.getIdentificador() + "\n Nombre de la maquina "
                        + m.getNombreMaquinas() + "\n Fecha de fabricacion " + m.getFechaFabricacion() + "\n Estado  "
                        + m.getOcupado());
                        System.out.println();
            }
        }

        System.out.println();

        for (Pesas p : this.pesas) {
            if (p != null) {
                System.out.println("Identificador de la pesa: " + p.getIdentificador() + "\n Nombre de la maquina "
                        + p.getNombrePesa() + "\n Fecha de fabricacion " + p.getFechaFabricacion()  + "\n Peso " + p.getPeso());
                System.out.println();
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

    public void simularUso(){
        System.out.println("Elige 1 si quieres simular el uso de maquina o 2 si quieres simular el uso de una pesa");
          int opcion = Integer.parseInt(sc.nextLine());
          int j =0;

          switch (opcion) {
            case 1:

                for (int i = 0; i < maquinas.length; i++) {
                    if (maquinas[i] != null)
                        maquinas[i].utilizar();
                }
                break;

            case 2:

                for (int i = 0; i < pesas.length; i++) {
                    if (pesas[i] != null)
                        pesas[i].utilizar();
                }
          
            default:
                break;
          }
        
    }

}
