public class Jugador {
    private String nombreJugador;
    private int edad;
    private boolean lesionado;
    private int dorsal;
    private int altura;
    private int puntosTotal;
    private String nombreEquipo;
    private String posicion ;
    private static int contador;
    private int identificador;


    public Jugador(){
        this.nombreJugador = "";
        this.edad = 0;
        this.lesionado = false;
        this.altura = 0;
        this.dorsal = 0;
        this.puntosTotal =0;
        this.nombreEquipo = "";
        this.posicion ="";
        this.identificador = contador;
        this.contador++;
    }


    public Jugador(String nombreJugador, int edad, boolean lesionado, int dorsal, int altura, int puntosTotal, String nombreEquipo, String posicion) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.lesionado = lesionado;
        this.dorsal = dorsal;
        this.altura = altura;
        this.puntosTotal = puntosTotal;
        this.nombreEquipo = nombreEquipo;
        this.posicion = posicion;
        this.identificador = contador;
        this.contador++;
    }



    public String getNombreJugador() {
        return this.nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isLesionado() {
        return this.lesionado;
    }

    public boolean getLesionado() {
        return this.lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPuntosTotal() {
        return this.puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    

    @Override
    public String toString() {
        return "{" +
            " nombreJugador='" + getNombreJugador() + "'" +
            ", edad='" + getEdad() + "'" +
            ", lesionado='" + isLesionado() + "'" +
            ", dorsal='" + getDorsal() + "'" +
            ", altura='" + getAltura() + "'" +
            ", puntosTotal='" + getPuntosTotal() + "'" +
            ", nombreEquipo='" + getNombreEquipo() + "'" +
            ", posicion='" + getPosicion() + "'" +
            ", identificador='" + getIdentificador() + "'" +
            "}";
    }



}
