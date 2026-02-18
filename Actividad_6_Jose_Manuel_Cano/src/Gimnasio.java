import java.util.Scanner;

public class Gimnasio {

    private final static Scanner sc = new Scanner(System.in);
    private Maquina[] maquinas;

    private int tamano;

    public Gimnasio() {
        this.tamano = 100;
        this.maquinas = new Maquina[tamano];
        datosPrueba();
        
    }

    private void datosPrueba() {
        Maquina maquina1 = new Maquina("Brazo", "12/05/2024");
        maquinas[0] = maquina1;
    }

    public Maquina[] buscarMateriales(){

        Maquina [] maquinaEncontrada ;

        maquinaEncontrada = new Maquina[tamano];


        System.out.println("Introduce el identificador de la maquina a buscar");

         int identificador = Integer.parseInt(sc.nextLine());

        for(int i =0; i < tamano; i++){
            if(maquinas[i].getIdentificador() == identificador ){

                maquinaEncontrada[i] = maquinas[i];
            }
        }

        System.out.println("La maquina encontrada con ese nombre es: ");

        return maquinaEncontrada;

    }

    public void Menu(){
        
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

}
