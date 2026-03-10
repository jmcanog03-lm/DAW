import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Lista {
    private int numero;
    private String nombre;
    private static Scanner sc = new Scanner(System.in);

    private ArrayList<Integer> listaejercicio1;
    ArrayList<String> nombres;

    public Lista() {
        listaejercicio1 = new ArrayList<>();
        nombres = new ArrayList<>();
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

        for (int i = listaejercicio1.size() - 1; i > 0; i--) {

            int numero_actual = listaejercicio1.get(listaejercicio1.size() - 1);
            int numero_anterior = listaejercicio1.get(listaejercicio1.size() - 2);

            suma = numero_actual + numero_anterior;

            listaejercicio1.set(listaejercicio1.size() - 2, suma);

            listaejercicio1.remove(listaejercicio1.size() - 1);

            for (Integer integer : listaejercicio1) {
                System.out.println(integer);
            }
            System.out.println();
        }

    }

    public void ejercicio3() {
        Random ran = new Random();
        this.numero = 100;

        for (int i = listaejercicio1.size(); i < this.numero; i++) {
            int numeros_aleatorios = ran.nextInt(100) + 1;
            // listaejercicio1.contains(numeros_aleatorios);
            if (listaejercicio1.contains(numeros_aleatorios)) {

                listaejercicio1.remove(Integer.valueOf(numeros_aleatorios));
            } else {
                listaejercicio1.add(numeros_aleatorios);
            }
        }

        for (Integer integer : listaejercicio1) {
            System.out.println(integer);
        }

    }

    public void ejercicio4() {
        Random ran = new Random();
        int personas = ran.nextInt(5);
        ArrayList<String> grupos = new ArrayList<>();

        nombres.add("Juan");

        nombres.add("María");

        nombres.add("Carlos");

        nombres.add("Ana");

        nombres.add("Pedro");

        nombres.add("Laura");

        nombres.add("Luis");

        nombres.add("Sofía");

        nombres.add("Javier");

        nombres.add("Elena");

        nombres.add("Diego");

        nombres.add("Paula");

        nombres.add("Alejandro");

        nombres.add("Lucía");

        nombres.add("Miguel");

        nombres.add("Carmen");

        nombres.add("Pablo");

        nombres.add("Rosa");

        nombres.add("Roberto");

        nombres.add("Isabel");

        nombres.add("Daniel");

        nombres.add("Teresa");

        nombres.add("Jorge");

        nombres.add("Beatriz");

        nombres.add("Fernando");

        nombres.add("Raquel");

        nombres.add("José");

        nombres.add("Patricia");

        nombres.add("David");

        nombres.add("Eva");

        Collections.shuffle(nombres);

        for (int i = 0; i < nombres.size(); i++) {
            if (grupos.size() < 5) {

                grupos.add(nombres.get(i));

            }

            if (grupos.size() == 5) {
                System.out.println();
                for (String string : grupos) {
                    System.out.println(string);
                }
                grupos = new ArrayList<>();
            }
        }

    }

    public void ejercicio5() {

        String salida = "final";

        ArrayList<String> colecctionpalabras = new ArrayList<>();

        System.out.println(
                "Introduce una palabra que no se final para continuar si  no quieres seguir pon final");
        String palabra = sc.nextLine();

        if(palabra.equals(salida)){
            System.out.println("no se ejecuta nada");
        }else{
            colecctionpalabras.add(palabra);
        }
        

        while (!palabra.equals(salida)) {

            System.out.println("Introduce una palabra");
            palabra = sc.nextLine();

            if (colecctionpalabras.contains(palabra)) {
                System.out.println("se detecto palabra repetida introdudce otra");
            } else if (!palabra.equals(salida)) {
                colecctionpalabras.add(palabra);
            }

        }

        for (String string : colecctionpalabras) {
            System.out.println(string);
        }

    }

    //public static void main(String[] args) {
        //Lista lista = new Lista();

        // lista.ejercicio1();
        //lista.ejercicio5();

    //}

}
