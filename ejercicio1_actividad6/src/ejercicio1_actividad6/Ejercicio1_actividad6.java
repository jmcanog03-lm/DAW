/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_actividad6;

import java.util.HashSet;
import java.util.TreeSet;

public class Ejercicio1_actividad6 {

    public static void main(String[] args) {

        HashSet<Coches> hashSet = new HashSet<>();
        hashSet.add(new Coches(12132312, "seat"));
        hashSet.add(new Coches(1212222, "Peugot"));

        System.out.println("Los elementos de la coleccion son");

        extracted(hashSet);

        System.out.println("Añadiendo elemento duplicado");

        System.out.println("---------------------------------------------");

        TreeSet<Coches2> treeSet = new TreeSet<>();

        treeSet.add(new Coches2(12566778, "Honda"));
        treeSet.add(new Coches2(11212889, "Suzuka"));

        // La solución es implementar la clase comparable ya que como tiene que ordenar
        // necesita comparar los numeros
        extracted2(treeSet);

    }

    private static void extracted2(TreeSet<Coches2> treeSet) {
        for (Coches2 coche2 : treeSet) {
            System.out.println(coche2);
        }
    }

    private static void extracted(HashSet<Coches> hashSet) {
        for (Coches coche : hashSet) {
            System.out.println(coche);
        }
    }

}
