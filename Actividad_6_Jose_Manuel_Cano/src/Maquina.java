import java.time.LocalDate;

public class Maquina implements ocupable, utilizable {
    private int identificador;
    private String nombreMaquinas;
    private String fechaFabricacion;
    private static int contador;

    private boolean ocupado;

    public Maquina() {

        this.identificador = contador;

        this.nombreMaquinas = "";

        this.ocupado = false;
        contador++;

        this.fechaFabricacion = "4/09/2025";

    }

    public Maquina(String nombreMaquinas, String fechaFabricacion , boolean ocupado) {
        this.identificador = contador;
        this.nombreMaquinas = nombreMaquinas;
        this.fechaFabricacion = fechaFabricacion;
        this.ocupado = ocupado;
        contador++;
    }


    public boolean getOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
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

    @Override
    public boolean ocupar() {

        if(!this.ocupado){
            this.ocupado = true;
            return true;
        }

        return false;
        
    }

    @Override

    public boolean desocupar() {
           if(this.ocupado){
            this.ocupado = false;
            return true;
        }

        return false;
        
    }
    

   @Override

    public void utilizar() {
        System.out.println("USANDO LA MAQUINA MELON!!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "{" +
            " identificador='" + getIdentificador() + "'" +
            ", nombreMaquinas='" + getNombreMaquinas() + "'" +
            ", fechaFabricacion='" + getFechaFabricacion() + "'" +
            ", ocupado='" + getOcupado() + "'" +
            "}";
    }

    

}
