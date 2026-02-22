import java.util.Iterator;
public class Coches implements Comparable<Coches>, Cloneable{
    private int matricula;
    private String nombre;

    public Coches(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }


    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int compareTo(Coches o) {
        // TODO Auto-generated method stub
        int comparacion = Integer.compare(this.getMatricula(), o.getMatricula());

        if(comparacion ==0) return this.getNombre().compareTo(o.getNombre());

        return comparacion;
      
    }

    public Coches clone(){
        Coches clon  = new Coches(this.matricula, this.nombre);
        return clon;
    }

    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }






}
