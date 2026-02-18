import java.time.LocalDate;

public class Maquina implements ocupable, utilizable {
    private int identificador;
    private String nombreMaquinas;
    private String fechaFabricacion;
    private int contador;

    private boolean ocupado;
    
    public Maquina() {

    this.identificador = contador;

    this.nombreMaquinas = "";

    this.contador =0;

    contador++;

    this.fechaFabricacion = "4/09/2025";


    }

    public Maquina(String nombreMaquinas, String fechaFabricacion) {
        this.identificador = contador;
        this.nombreMaquinas = nombreMaquinas;
        this.fechaFabricacion = fechaFabricacion;
        this.contador = 0;
        contador ++;
    }


    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreMaquinas() {
        return this.nombreMaquinas;
    }

    public void setNombreMaquinas(String nombreMaquinas) {
        this.nombreMaquinas = nombreMaquinas;
    }

    public String getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public boolean ocupar(){

        ocupado = true;

        return ocupado;
    }

    @Override

    public boolean desocupar(){
        ocupado = false;
       return ocupado;
    }

    @Override

    public void utilizar(){}


}
