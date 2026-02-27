/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author tarde
 */

public class Ejercicio1_actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashSet<Coches2> hashSet = new HashSet<>();
        hashSet.add(new Coches2(12132312, "seat"));
        hashSet.add(new Coches2(1212222, "Peugot"));

        System.out.println("Los elementos de la coleccion son");

        for (Coches2 coche : hashSet) {
            System.out.println(coche);
        }
        
        System.out.println();

        //Necesita de la clase Equals para poder funcionar bien asignando el mismo hashcode a todos los que sean iguales y al devolver
        // True ya no se agregara.
        System.out.println("Añadiendo elemento duplicado");

        hashSet.add(new Coches2(1212222, "Peugot"));
        for (Coches2 coche : hashSet) {
            System.out.println(coche);
        }

        System.out.println();

        System.out.println("---------------------------------------------");

        TreeSet<Coches2> treeSet = new TreeSet<>();

        treeSet.add(new Coches2(12566778, "Honda"));
        treeSet.add(new Coches2(11212889, "Suzuka"));

        // La solución es implementar la clase comparable ya que como tiene que ordenar
        // necesita comparar los numeros
        for (Coches2 coche2 : treeSet) {
            System.out.println(coche2);
        }

    }


    // Fuente: https://www.reddit.com/r/javahelp/comments/4j2iqj/hashset_containing_duplicates/?tl=es-419


}
