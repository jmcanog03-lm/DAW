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

    public Dado(int nCaras,int modificador, ListaCaraDados caraDados){
        this.nCaras = nCaras;
        this.modificador = modificador;
        this.caradados = caraDados;
        this.identificador = identificador;
    }

    public int  setIdentificador(){
        return this.identificador;
    }
}
