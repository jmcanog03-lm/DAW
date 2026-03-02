

public class Coches2 implements Comparable<Coches2>{

/**
 *
 * @author JoseManuel
 * @version 1.0
 * @since 1.0
 */


    private int matricula;
    private String nombreCoche;

    

    /**
     * 
     * @param matricula atributo asociado a la matricula que sirve para identificar a un coche
     * @param nombreCoche atributo que sirve para darle un nombre al objeto Coche2
     */


    public Coches2(int matricula, String nombreCoche) {
        this.matricula = matricula;
        this.nombreCoche = nombreCoche;
    }



    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombreCoche() {
        return this.nombreCoche;
    }

    public void setNombreCoche(String nombreCoche) {
        this.nombreCoche = nombreCoche;
    }


     @Override
    public int compareTo(Coches2 o) {
        // TODO Auto-generated method stub
        int comparacion = Integer.compare(this.getMatricula(), o.getMatricula());

        if(comparacion ==0) return this.getNombreCoche().compareTo(o.getNombreCoche());

        return comparacion;
      
    }



    /**
     * @return esto devuelve la información del objeto cuando recorramos un array sin esto dara error
     */
    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", nombreCoche='" + getNombreCoche() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object obj){
        //Si es el mismo objeto se devuelve true
        if(this == obj) return true;

        // Aseguro que se evalua un objeto de la clase Coche2
        if( obj == null || getClass() != obj.getClass()) return false;
        

        //Casteo para que evaluar que si son iguales devuelva true
        Coches2 coches = (Coches2) obj;
        return this.matricula == coches.matricula;
    }

    

    // Hace que el equals funcione bien con el hashcode y evitar que se rompa el equals haciendo que los objetos Coche2 con la misma matricula tendran el mismo hash asi los identificara
    // y no se rompera el equals
    @Override
    public int hashCode(){
        return Integer.hashCode(matricula);
    }



   

    
}
