public class App {
    public static void main(String[] args) throws Exception {
        Pokedex gestor = new Pokedex();

        Pokemon pokemon = new Pokemon("Tepig", 21, 120, 300, false, TiposPokemon.FUEGO);
        Pokemon pokemon2 = new Pokemon("Snivy", 12, 110, 300, false, TiposPokemon.PLANTA);

        gestor.registrarPokemon(pokemon);
        gestor.registrarPokemon(pokemon2);

        gestor.OrdenarPokemon();

        pokemon.agregarEtiquetaEspecial(EtiquetasEspecialesPokemon.ALOLA);
        pokemon.agregarEtiquetaEspecial(EtiquetasEspecialesPokemon.LEGENDARIO);

         gestor.mostrarPokemon();

         System.out.println("Introduce el pokemon a eliminar");
        gestor.eliminarPokemon(pokemon2);
         gestor.mostrarPokemon();
       

     





    }
}
