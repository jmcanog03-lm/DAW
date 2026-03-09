import java.util.ArrayList;
import java.util.Random;

public class Lista {
    private int numero;
    private String nombre;

    private ArrayList<Integer> listaejercicio1;

    public Lista() {
        listaejercicio1 = new ArrayList<>();
    }

    public Lista(int numero, int String) {
        this.numero = numero;
        this.nombre = nombre;
        listaejercicio1 = new ArrayList<>();
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setString(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" +
                " numero='" + getNumero() + "'" +
                ", String='" + getNombre() + "'" +
                "}";
    }

    public void ejercicio1() {
        Random ran = new Random();
        this.numero = 10;

        for (int i = 0; i < this.numero; i++) {
            int numeros_aleatorios = ran.nextInt(11);
            listaejercicio1.add(numeros_aleatorios);
            System.out.println(listaejercicio1.get(i));
        }

        System.out.println("Segunda lista ya estan eliminados los pares");
        for (int i = listaejercicio1.size() - 1; i >= 0; i--) {

            if (listaejercicio1.get(i) % 2 == 0) {
                listaejercicio1.remove(i);
            }

        }

        for (Integer integer : listaejercicio1) {
            System.out.println(integer);
        }

    }

    public void ejercicio2() {
        Random ran = new Random();
        this.numero = 10;

        for (int i = 0; i < this.numero; i++) {
            int numeros_aleatorios = ran.nextInt(11);
            listaejercicio1.add(numeros_aleatorios);
            System.out.println(listaejercicio1.get(i));
        }

        int suma = 0;

        System.out.println("Lista final");

        for (int i = listaejercicio1.size() - 1; i >= 0; i--) {

            int numero_actual = listaejercicio1.get(i);
            int numero_anterior = listaejercicio1.get(listaejercicio1.size() -2);

            suma = numero_actual + numero_anterior;

           listaejercicio1.add(listaejercicio1.size()-2 + listaejercicio1.size()-1);
            listaejercicio1.remove(i);

            for (Integer integer : listaejercicio1) {
                System.out.println(integer);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Lista lista = new Lista();

        // lista.ejercicio1();
        lista.ejercicio2();

    }

}
