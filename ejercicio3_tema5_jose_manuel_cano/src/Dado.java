import java.util.Random;

public class Dado {
    private int identificador;
    private Random r = new Random();
    private int nCaras;
    private int modificador;
    private ListaCaraDados caradados;

    public Dado() {
        this.identificador = identificador;
        this.nCaras = 6;
        this.caradados = caradados;
        this.modificador = 0;
    }

    public Dado(int nCaras, int modificador, ListaCaraDados caraDados) {
        this.nCaras = nCaras;
        this.modificador = modificador;
        this.caradados = caraDados;
        this.identificador = identificador;
    }

    public int getnCaras() {
        return this.nCaras;
    }

    public int modificador() {
        return this.modificador;
    }

    public void setnCaras(int nCaras) {
        this.nCaras = nCaras;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }

    public int tirarDado() {
        int numeroaleatorio = r.nextInt(nCaras) + 1;
        return numeroaleatorio;
    }

    public int tirarDadoMod() {
        int acumulador = tirarDado();
        int resultado = modificador + acumulador;
        return resultado;
    }

    public int tirarDados(int cantidadDados) {
        int sumartiradas = 0;
        for (int i = 0; i < cantidadDados; i++) {
            int resultado = tirarDado();
            sumartiradas += resultado;
        }

        return sumartiradas;
    }

    public int tirarDadosMod(int cantidadDados) {
        int resultado = 0;
        for (int i = 0; i < cantidadDados; i++) {
            int tirada = tirarDadoMod();
            resultado += tirada;
        }

        return resultado;

    }

    public int tirarConVentaja() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();

        int mayor = 0;

        if (dado1 > dado2) {
            mayor = dado1;
            return mayor;
        } else {
            mayor = dado2;
            return mayor;
        }
    }

}
