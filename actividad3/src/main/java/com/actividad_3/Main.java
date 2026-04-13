package com.actividad_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static String path = "src/main/java/com/actividad_3/chat-toxico-lol.txt";
    static String path2 = "src/main/java/com/actividad_3/baneos.txt";
    static HashSet<String> palabrasBaneadas ;
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        palabrasBaneadas.add("pelotudo");
        palabrasBaneadas.add("boludo");
        palabrasBaneadas.add("muerte");
        palabrasBaneadas.add("forros");

    }

    public static void banearPalabras(){
        try (
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter bw = new BufferedWriter(new FileWriter(path2))
        ){
            
            String linea;

            while ((linea = br.readLine()) != null) {
                String palabras [] = linea.split(" ");
                String lineanueva = "";
                
                for (int i = 0; i < palabrasBaneadas.size(); i++) {
                    if(palabrasBaneadas.contains(palabras)){
                        //String palabraCensurada = ch
                     for (int j = 0; j < palabras.length; j++) {

                        char ch = linea.charAt(j);
                        //String.valueOf(ch);
                        String palabraCensurada = String.valueOf(ch);
                        //https://github.com/Serra-albarregas/Java2526/blob/main/src/UT7/Ejemplos/EjLeerFichero.java

                        if(j == 0){
                            lineanueva+=ch;
                            
                        }


                        
                     }


                        
                    }
                }

            }


            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }





}