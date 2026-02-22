import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;

public class gestoraCoches implements Iterable<Coches>{
    private final static Scanner sc = new Scanner(System.in);
    private Coches [] coches;
    private int MAXCOCHES;
    private int contador;


    public gestoraCoches() {
        this.MAXCOCHES = 20;
        this.coches = new Coches[MAXCOCHES];
        datosPruebas();
    }


    public void agregarCoches(){
        
        System.out.println("Introduce el nombre del coche ");
        String nombre_coche = sc.nextLine();

        System.out.println("Introduce la matricula del coche nuevo");

        int matricula = Integer.parseInt(sc.nextLine());

        Coches coche = new Coches(matricula, nombre_coche);

        coches[contador] = coche;
        contador++;

    }

    public void ordenar(){
        Arrays.sort(coches,0,contador);
    }


    public void datosPruebas(){
        Coches coche = new Coches(12345, "Seat");

        coches[contador] = coche;

        contador++;
    }

    public void listarCoches(){

       for(int i =0; i < contador; i++){
        System.out.println(coches[i]);
        System.out.println();
       }
        
    }


    public void agregarCochesExistentes(Coches coche){
        coches[contador] = coche;

        contador++;

    }


    @Override
    public Iterator<Coches> iterator() {
        return new Iterator<Coches>() {
            private int indice =0;

            @Override
            public boolean hasNext(){
                return indice < contador;
            }

            @Override
            public Coches next(){
                return coches[indice++];
            }
            
        };
    }

    

}
