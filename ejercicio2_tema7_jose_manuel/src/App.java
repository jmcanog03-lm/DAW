import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ejercicio1();

    }

    public static void ejercicio1() {
        String path = "src/Restaurants_facil.csv";
        // FileReader fr;
        // BufferedReader br = null;

        int acumulador;
        int i = 0;
        int contador = 0;
        int numeros =0;
        int vocales =0;
        int consonantes =0;
        

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // fr = new FileReader(path);
            // br = new BufferedReader(br);

            String linea;
            String  consonanlista[];
            consonanlista = new String[]{"B","C","D","F","G","H","J","K","L","M","N","Ñ","P","Q","R","S","T","V","W","X","Y","Z","b","c","d","f","g","h","j","k","l","m","n","ñ","p","q","r","s","t","v","w","x","y","z",};
            

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                for (int j = 0; j < linea.length(); j++) {
                    char ch = (linea.charAt(j));

                    if (Character.isLetter(ch)) {
                        contador++;
                    }
                }

                for (int j = 0; j < linea.length(); j++) {
                    char ch = (linea.charAt(j));

                    if (Character.isDigit(ch)) {
                        numeros++;
                    }
                    
                }

                for (int j = 0; j < linea.length(); j++) {
                    char ch = (linea.charAt(j));

                    if(ch == 'A' || ch == 'a'){
                        vocales++;
                    }

                     if(ch == 'E' || ch == 'e'){
                        vocales++;
                    }

                     if(ch == 'I' || ch == 'i'){
                        vocales++;
                    }

                     if(ch == 'O' || ch == 'o'){
                        vocales++;
                    }

                     if(ch == 'U' || ch == 'u'){
                        vocales++;
                    }

                    for (int k = 0; k < consonanlista.length; k++) {
                            
                        for (int k2 = 0; k2 < linea.length(); k2++) {
                             char cha = (linea.charAt(k2));
                            
                             

                        }
                        
                       
                    }

                    
                    

                    
                }

            

            }

            System.out.println(contador);
            System.out.println(numeros);
            System.out.println(vocales);
            System.out.println(consonantes);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
