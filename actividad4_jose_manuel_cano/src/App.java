import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        final Scanner sc = new Scanner(System.in);

        boolean salida = true;

        while (salida) {

            System.out.println();
            System.out.println("MENU DE LA APLICACION");
            System.out.println("---------------------");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Salir del menu");
            System.out.println();
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    lista.ejercicio1();
                    break;

                case 2:
                    lista.ejercicio2();
                    break;

                case 3:
                    lista.ejercicio3();
                    break;

                case 4:
                    lista.ejercicio4();
                    break;

                case 5:
                    lista.ejercicio5();
                    break;

                case 6:
                    salida = false;
                    break;

                default:
                    System.out.println("Elige uyna opcion valida");
                    break;
            }
        }
    }
}
