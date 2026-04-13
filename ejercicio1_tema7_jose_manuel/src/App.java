import java.io.File;
import java.util.Scanner;
public class App {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Pon fichero si quieres crear un archivo o directorio si quieres crear una carpeta");
        crearFicheros();
        System.out.println("Pon fichero si quieres eliminar un archivo o directorio si quieres eliminar una carpeta");
        eliminarFicheros();

        mostrarTodo("src");
        System.out.println("Introduce la ruta absoluta");
        buscarFicheroDirectorio();
    }

    public static void mostrarTodo(String ruta){
        File files_ruta = new File(ruta);
        File[] files = files_ruta.listFiles();

        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
    public static void crearFicheros() {

        File fichero = new File("src/hola.txt");
        File directorio = new File("src/directorio");

        String decision = sc.nextLine();

        if (!fichero.exists()) {

            switch (decision) {
                case "fichero":
                    try {
                        fichero.createNewFile();
                        System.out.println("Ruta absoluta del archivo" + fichero.getAbsolutePath());
                    } catch (Exception e) {
                        System.out.println("Error a la hora de crear el fichero");
                    }
                    break;

                case "directorio":
                    try {
                        directorio.mkdir();
                        System.out.println("Ruta absoluta del directorio" + directorio.getAbsolutePath());
                    } catch (Exception e) {
                        System.out.println("Error a la hora de crear el directorio");
                    }
                    break;

                default:
                    break;
            }

        }

    }

    public static void eliminarFicheros() {

        File fichero = new File("src/hola.txt");
        File directorio = new File("src/directorio");

        String decision = sc.nextLine();

        if (fichero.exists()) {
            switch (decision) {
                case "fichero":
                    try {
                        fichero.delete();
                        System.out.println("Ruta absoluta del archivo " + fichero.getAbsolutePath());
                    } catch (Exception e) {
                        System.out.println("Error a la hora de borrar el fichero");
                    }
                    break;

                case "directorio":
                  eliminarDirectorio(directorio);
                    break;
                default:
                    break;
            }

        }

    }

    public static void eliminarDirectorio(File directorio){
        File [] ficheros = directorio.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            
            if(ficheros[i].isDirectory()){
                eliminarDirectorio(ficheros[i]);
            }else{
                ficheros[i].delete();
            }
        }

        directorio.delete();
        
    }

    public static void buscarFicheroDirectorio(){

        String ruta_ab = sc.nextLine();

        File fichero = new File(ruta_ab);
        
        if(fichero.exists() && !fichero.isDirectory()){
            System.out.println("El nombre del fichero es: " + fichero.getName());
            System.out.println("El tamaño del fichero es: " + fichero.length());
            System.out.println("Se puede escribir ? " + fichero.canWrite());
            System.out.println("Se puede leer ? " + fichero.canRead());
        }

        if(fichero.isDirectory()){
            
            for (int i = 0; i < fichero.listFiles().length; i++) {

                System.out.println(fichero.listFiles()[i]);
            }
        }

    }

}
