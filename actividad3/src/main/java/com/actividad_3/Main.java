package com.actividad_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static String path = "src/main/java/com/actividad_3/chat-toxico-lol.txt";
    static String path2 = "src/main/java/com/actividad_3/baneos.txt";
    static HashSet<String> palabrasBaneadas = new HashSet<>();
    static HashMap <String,Integer> conteojugadores = new HashMap<>();
    static HashSet <String> jugadoresBaneados = new HashSet<>();
    static Scanner sc = new Scanner(System.in);
    static int contador;
    public static void main(String[] args) {
        palabrasBaneadas.add("pelotudo");
        palabrasBaneadas.add("boludo");
        palabrasBaneadas.add("muerte");
        palabrasBaneadas.add("forros");
        banearPalabras();
        leerArchivo();

    }

    public static void banearPalabras() {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
                BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                //linea = linea.replace(",", " , ").replace("." , " . ").replace("!", "").replace("?", "")
                //.replace(";", "").replace(":", "");

                //Quitar espacios generados por el replace y con el split donde haya un espacio divide
                String palabras[] = linea.trim().split("\\s+");
                
                String lineanueva = "";
                String jugador = "";

                if(palabras.length >1){
                    jugador = palabras[1];
                }


                for (int i = 0; i < palabras.length; i++) {
                    String original = palabras[i];
                    String palabraLimpia = original.toLowerCase().replaceAll("[.,!?:;]", "");
                    

                    if (palabrasBaneadas.contains(palabraLimpia)) {
                        // String palabraCensurada = ch
                        String asteriscos = "";
                        // String.valueOf(ch);
                   
                        

                        if(conteojugadores.containsKey(jugador)){
                            conteojugadores.put(jugador, conteojugadores.get(jugador) +1);
                        }else{
                            conteojugadores.put(jugador, 1);
                        }

                        if(conteojugadores.get(jugador)  > 5){

                            if(!jugadoresBaneados.contains(jugador)){
                                jugadoresBaneados.add(jugador);
                                System.out.println("Jugador: " + jugador + " ha sido baneado");
                            }

                        }

                        // https://github.com/Serra-albarregas/Java2526/blob/main/src/UT7/Ejemplos/EjLeerFichero.java
                        char primeraletra = palabras[i].charAt(0);
                        char ultimaletra = palabras[i].charAt(palabras[i].length() - 1);

                        for (int j = 0; j < palabras[i].length() - 2; j++) {
                            asteriscos += "*";
                        }

                        lineanueva += " " + primeraletra + asteriscos + ultimaletra;

                    } else {
                        lineanueva += original + " ";
                    }

                }

                bw.write(lineanueva);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(path2))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}