import java.time.LocalDate;

public class Pesas implements utilizable {
    private int identificador;
    private String nombrePesa;
    private String fechaFabricacion;
    private static int contador;

    public Pesas() {

        this.identificador = contador;

        this.nombrePesa = "";

        contador++;

        this.fechaFabricacion = "05092021";

    }

    public Pesas( String nombrePesa, String fechaFabricacion) {
        this.identificador = contador;
        this.nombrePesa = nombrePesa;
        this.fechaFabricacion = fechaFabricacion;
        contador++;
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
        System.out.println("USANDO MELON!!!!!!!!!!");
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
