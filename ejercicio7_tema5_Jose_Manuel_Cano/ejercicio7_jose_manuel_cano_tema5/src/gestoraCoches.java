import java.util.Arrays;
import java.util.Scanner;

public class gestoraCoches {
    private final static Scanner sc = new Scanner(System.in);
    private Coches [] coches;
    private int MAXCOCHES;


    public gestoraCoches() {
        this.MAXCOCHES = 20;
        this.coches = new Coches[MAXCOCHES];
    }


    public void agregarCoches(){
        int j =0;
        System.out.println("Introduce el nombre del coche ");
        String nombre_coche = sc.nextLine();

        System.out.println("Introduce la matricula del coche nuevo");

        int matricula = Integer.parseInt(sc.nextLine());

        Coches coche = new Coches(matricula, nombre_coche);

        for(int i =0; i < MAXCOCHES; i++){
            coches[j] = coche;
            j++;
        }

    }

    public void ordenar(){
        Arrays.sort(coches);
    }

    

}
