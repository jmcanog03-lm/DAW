public class App {
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("Coco", TipoPelaje.CORTO, "yorksike", 12, "pienso", Tamano.GRANDE, NivelEnergia.SIETE);

        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza " + perro1.getRaza());
        System.out.println("Pelaje " + perro1.getPelaje());
        System.out.println("Tamaño" + perro1.getTamano());

        Gato gato1 = new Gato("Garfield", "Lasaña", 4, NivelDependencia.UNO, TipoPelaje.CORTO, ColorPelajeGato.BLANCO);

        Caballo caballo1 = new Caballo("Chene", "Paja", 6, 5, 8);

        System.out.println(caballo1.correr(12));
        gato1.Maullar();
        System.out.println();

        Animal[] animales = new Animal[3];

        animales[0] = perro1;
        animales[1] = gato1;
        animales[2] = caballo1;

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].toString());
            animales[i].hacerSonido();
        }
      

    }
}
