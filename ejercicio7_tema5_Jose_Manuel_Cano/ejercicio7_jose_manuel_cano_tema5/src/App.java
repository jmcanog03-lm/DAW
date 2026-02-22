public class App {
    public static void main(String[] args) throws Exception {
        gestoraCoches gestoradecoches = new gestoraCoches();

        Coches coche1 = new Coches(12334, "Peugot");
        Coches coche2 = coche1.clone();

        gestoradecoches.agregarCochesExistentes(coche1);
        gestoradecoches.agregarCochesExistentes(coche2);

        System.out.println("Antes de modificar los coches");

        System.out.println("coche 1" + coche1);
        System.out.println("coche 2" + coche2);

        coche2.setNombre("BMW");

        System.out.println("\nDespues de modificar el clon");
        System.out.println("coche 1" + coche1);
        System.out.println("coche 2" + coche2);

        System.out.println("Ver si son el mismo objeto");

        System.out.println(coche1 == coche2);

        System.out.println("\nConjunto de elementos sin ordenar");

        gestoradecoches.listarCoches();


        System.out.println("\nConjuntos de elementos ordenados");
        gestoradecoches.ordenar();
        gestoradecoches.listarCoches();


        System.out.println("\nBucle for each");

        for (Coches coches : gestoradecoches) {
            System.out.println(coches);
            
        }

        


    }
}
