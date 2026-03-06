package com.mapas;

import java.util.Map.Entry;

import javax.crypto.Mac;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> mapaElecciones = new HashMap<>();

        // Introducir los valores del HasMap

        mapaElecciones.put("PSOE", 150);
        mapaElecciones.put("VOX", 200);
        mapaElecciones.put("PODEMOS", 150);
        mapaElecciones.put("PACMA", 300);
        mapaElecciones.put("LIBERALES", 50);

        // Buscar el numero de votos de un partido introducido por teclado

        System.out.println("INTRODUCE EL NOMBRE DEL PARTIDO");
        String nombre = sc.nextLine();

        for (String clave : mapaElecciones.keySet()) {
            if (clave.equals(nombre)) {
                System.out.println();
                System.out.println(" Partido: " + clave + "\n Votos: " + mapaElecciones.get(clave));
            }

        }

        // Mostrar todos los partidos

        System.out.println("PARTIDOS POLITICOS");

        for (String clave : mapaElecciones.keySet()) {

            System.out.println();
            System.out.println(" Partido: " + clave);
            System.out.println();

        }

        // Mostrar todos los partidos juntos con los votos

        System.out.println("PARTIDOS CON SUS VOTOS");

        for (Entry<String, Integer> entry : mapaElecciones.entrySet()) {
            System.out.println();
            System.out.println(" Partido: " + entry.getKey() + "\n Votos del partido: " + entry.getValue());
        }


        int MAX = Integer.MIN_VALUE;
        String partido = "";

        for(Entry <String,Integer> entry: mapaElecciones.entrySet()){
            if(MAX < entry.getValue()){
                MAX = entry.getValue();
                partido = entry.getKey();
            }

            
        }

        System.out.println();
        System.err.println("PARTIDO GANADOR: " + partido + "\n Con los votos: " + MAX);

    }

    // Mostrar el ganador de las elecciones

    
}




