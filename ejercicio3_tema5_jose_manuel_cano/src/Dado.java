import java.util.Random;
public class Dado {
    private int identificador;
    private Random r = new Random();
    private int nCaras;
    private int modificador;
    private ListaCaraDados caradados;
    private static int contar;

    public Dado() {
        contar++;
        this.identificador = contar;
        this.nCaras = 6;
        this.caradados = caradados;
        this.modificador = 0;
       
    }

    public Dado(int nCaras, int modificador, ListaCaraDados caraDados) {
        this.nCaras = nCaras;
        this.modificador = modificador;
        this.caradados = caraDados;
        contar++;
        this.identificador=contar;
    }

    public int getnCaras() {
        return this.nCaras;
    }

    public int modificador() {
        return this.modificador;
    }

    public void setnCaras(int nCaras) {
        if(esCaraValida(nCaras)){
            this.nCaras = nCaras;
        }else{
            this.nCaras = 6;
        }
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

    public int tirarConVentajaMod() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        int resultado = 0;

        int mayor = 0;

        if (dado1 > dado2) {
            mayor = dado1;

        } else {
            mayor = dado2;
        }

        return mayor + modificador;
    }

    public int tirarConDesventaja() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        int resultado = 0;

        int menor = 0;

        if (dado1 < dado2) {
            menor = dado1;
            return menor;

        } else {
            menor = dado2;
            return menor;
        }

    }

    public int tirarConDesventajaMod() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        int resultado = 0;
        int menor = 0;

        if (dado1 < dado2) {
            menor = dado1;

        } else {
            menor = dado2;

        }

        return menor + modificador;
    }

    // numeroaleatorio hasta nCaras*2

    public int hacerTrampa() {
        int tirada = tirarDado();
        int max = nCaras;
        int sumarFijo = r.nextInt(1, 2);
        int resultado = 0;
        resultado = sumarFijo + tirada;
        if (resultado > nCaras) {
            resultado = nCaras;
        }

        return resultado;

    }


    public int hacerTramaMod(){
         int tirada = tirarDado();
        int max = nCaras;
        int sumarFijo = r.nextInt(1, 2);
        int resultado = 0;
        resultado = sumarFijo + tirada;
        if (resultado > nCaras) {
            resultado = nCaras;
        }

        return resultado + modificador;

    }

    private boolean esCaraValida(int caras){
        return caras == 4 || caras ==6 || caras == 8 || caras == 10 || caras == 12 || caras == 20 || caras == 100;
    }

}
