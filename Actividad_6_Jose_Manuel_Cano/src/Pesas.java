import java.time.LocalDate;

public class Pesas implements utilizable {
    private int identificador;
    private String nombrePesa;
    private String fechaFabricacion;
    private static int contador;
    private int peso;

    public Pesas() {

        this.identificador = contador;

        this.nombrePesa = "";

        contador++;

        this.peso =0;

        this.fechaFabricacion = "05092021";

    }

    public Pesas( String nombrePesa, String fechaFabricacion ,  int peso) {
        this.identificador = contador;
        this.nombrePesa = nombrePesa;
        this.fechaFabricacion = fechaFabricacion;
        this.peso = peso;
        contador++;
    }


    public void setNombrePesa(String nombrePesa) {
        this.nombrePesa = nombrePesa;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombrePesa() {
        return this.nombrePesa;
    }

    public void setNombreMaquinas(String nombrePesa) {
        this.nombrePesa = nombrePesa;
    }

    public String getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override

    public void utilizar() {
        System.out.println("USANDO LA PESA MELON!!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "{" +
            " identificador='" + getIdentificador() + "'" +
            ", nombreMaquinas='" + getNombrePesa() + "'" +
            ", fechaFabricacion='" + getFechaFabricacion() + "'" +
            "}";
    }

    

}
