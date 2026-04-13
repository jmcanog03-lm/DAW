import java.util.ArrayList;
import java.util.Objects;

public class Pokemon implements Comparable<Pokemon> , Combatible {
    private String nombrePokemon;
    private int nivel;
    private int ataque;
    private int cantidadsalud;
    private boolean debilitado;
    private TiposPokemon tipo;

    private ArrayList<EtiquetasEspecialesPokemon> etiquetases;

    public Pokemon() {
        this.nombrePokemon = "";
        this.nivel = 0;
        this.ataque = 0;
        this.cantidadsalud = 0;
        this.etiquetases = new ArrayList<>();

    }

    public Pokemon(String nombrePokemon, int nivel, int ataque, int cantidadsalud, boolean debilitado,
            TiposPokemon tipo) {
        this.nombrePokemon = nombrePokemon;
        this.nivel = nivel;
        this.ataque = ataque;
        this.cantidadsalud = cantidadsalud;
        this.debilitado = debilitado;
        this.tipo = tipo;
        this.etiquetases = new ArrayList<>();
    }

    @Override
    public void recibirDaño(Pokemon pokemon) {
        if (pokemon.getTiposPokemon().equals("FUEGO") && pokemon.getDebilitado() == false) {
            if (pokemon.getTiposPokemon() == TiposPokemon.PLANTA && pokemon.getDebilitado() == false) {
                int daño = pokemon.getCantidadsalud() - 20;
                pokemon.setCantidadsalud(daño);
            }
        }
    }

    public String getNombrePokemon() {
        return this.nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCantidadsalud() {
        return this.cantidadsalud;
    }

    public void setCantidadsalud(int cantidadsalud) {
        this.cantidadsalud = cantidadsalud;
    }

    public boolean isDebilitado() {
        return this.debilitado;
    }

    public boolean getDebilitado() {
        return this.debilitado;
    }

    public void setDebilitado(boolean debilitado) {
        this.debilitado = debilitado;
    }

    public TiposPokemon getTiposPokemon() {
        return this.tipo;
    }

    public void setTiposPokemon(TiposPokemon tipo) {
        this.tipo = tipo;
    }

    public ArrayList<EtiquetasEspecialesPokemon> getEtiquetases() {
        return this.etiquetases;
    }

    public void setEtiquetases(ArrayList<EtiquetasEspecialesPokemon> etiquetases) {
        this.etiquetases = etiquetases;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Pokemon)) {
            return false;
        }

        Pokemon pokemon = (Pokemon) obj;

        return this.nivel == pokemon.nivel && Objects.equals(this.nombrePokemon, pokemon.nombrePokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nivel, this.nombrePokemon);
    }

    @Override
    public int compareTo(Pokemon o) {
        int comparacion = Integer.compare(this.nivel, o.nivel);
        return comparacion;
    }


    public void agregarEtiquetaEspecial(EtiquetasEspecialesPokemon etiqueta){
        etiquetases.add(etiqueta);
    }

    @Override
    public String toString() {
        return "{" +
            " nombrePokemon='" + getNombrePokemon() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", ataque='" + getAtaque() + "'" +
            ", cantidadsalud='" + getCantidadsalud() + "'" +
            ", debilitado='" + isDebilitado() + "'" +
            ", tipo='" + getTiposPokemon() + "'" +
            ", etiquetases='" + getEtiquetases() + "'" +
            "}";
    }


}
