package ejercicio1_actividad6;

public class Coches2 implements Comparable<Coches2>{
    private int matricula;
    private String nombreCoche;


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

    public void ordenar(){
        
    }

   

    
}
