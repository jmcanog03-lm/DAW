import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("Introduce el numero de caras del dado");
        int caras = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el modificador");
        int mod = Integer.parseInt(sc.nextLine());

        Dado dado = new Dado();
        dado.setnCaras(caras);
        dado.setModificador(mod);

       

        System.out.println("Tirada normal " + dado.tirarDado());
        System.out.println("Tirada con modificador " + dado.tirarDadoMod());
        System.out.println("Tirar con ventaja " + dado.tirarConVentaja());
        System.out.println("Es hora de hacer trampas " + dado.hacerTrampa());
    }
}
