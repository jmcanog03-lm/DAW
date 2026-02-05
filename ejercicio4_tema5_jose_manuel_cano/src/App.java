public class App {
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("Coco", TipoPelaje.CORTO, "yorksike", 12, "pienso", Tamano.GRANDE, NivelEnergia.SIETE);

        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza " + perro1.getRaza());
        System.out.println("Pelaje " + perro1.getPelaje());
    }
}
