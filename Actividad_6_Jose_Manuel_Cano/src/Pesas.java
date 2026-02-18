import java.time.LocalDate;

public class Pesas implements utilizable {
    private int identificador;
    private String nombreMaquinas;
    private LocalDate fechaFabricacion;
    private int contador;

    public Pesas() {

        this.identificador = contador;

        this.nombreMaquinas = "";

        this.contador = 0;

        contador++;

        this.fechaFabricacion = LocalDate.of(2025, 5, 4);

    }

    public Pesas(int identificador, String nombreMaquinas, LocalDate fechaFabricacion) {
        this.identificador = identificador;
        this.nombreMaquinas = nombreMaquinas;
        this.fechaFabricacion = fechaFabricacion;
        this.contador = 0;
        contador++;
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

    public LocalDate getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override

    public void utilizar() {

    }

}
