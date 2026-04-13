import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pokedex {
    HashMap <TiposPokemon,List<Pokemon>> MapeoPokemon;
    private static Scanner sc = new Scanner(System.in);

    public Pokedex (){
        this.MapeoPokemon = new HashMap<>();
    }


    public void registrarPokemon(Pokemon pokemon){
        if(!(MapeoPokemon.containsKey(pokemon.getTiposPokemon()))){
            MapeoPokemon.put(pokemon.getTiposPokemon(), new ArrayList<Pokemon>());
        }

        MapeoPokemon.get(pokemon.getTiposPokemon()).add(pokemon);

    }

    public void eliminarPokemon(Pokemon pokemon){
        List <Pokemon> pokemons = MapeoPokemon.get(pokemon.getTiposPokemon());

        for (int i = 0; i <pokemons.size() ; i++) {
            String nombre = sc.nextLine();

            if(nombre.equals(pokemon.getNombrePokemon())){
                MapeoPokemon.remove(pokemons);
            }
        }
    }

    public void OrdenarPokemon(){
        for (List<Pokemon> pokemons : MapeoPokemon.values()) {
            Collections.sort(pokemons);
        }
    }

    public void mostrarPokemon(){

        for(Map.Entry <TiposPokemon, List<Pokemon>> entry : MapeoPokemon.entrySet()){
            System.out.println(entry);
        }
    }

  
    public Pokemon[][] crearMatriz(){
           Pokemon [][] matrizPokemon;

           return matrizPokemon = new Pokemon[3][3];
    }


   
 
}
