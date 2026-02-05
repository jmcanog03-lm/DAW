public class Gato extends Animal{
    private NivelDependencia nivel_dependencia;
    private TipoPelaje pelajegato;
    private ColorPelajeGato color_pelaje_gato;

    public Gato(){
        super();
        super.nombre = "Chene";
        super.tipo_alimentacion = "Pienso ";
        super.edad =12;
        this.nivel_dependencia = NivelDependencia.UNO;
        this.pelajegato = TipoPelaje.CORTO;
        this.color_pelaje_gato = ColorPelajeGato.NEGRO;

    }

    public Gato(String nombre, String tipo_alimentacion, int edad, NivelDependencia nivelDependencia, TipoPelaje pelaje, ColorPelajeGato colorPelajeGato){
        super.nombre = nombre;
        super.tipo_alimentacion = tipo_alimentacion;
        super.edad = edad;

        this.nivel_dependencia = nivelDependencia;
        this.pelajegato = pelaje;
        this.color_pelaje_gato = colorPelajeGato;
    }

    public String getNombre(){
        return super.nombre;
    }

    public String getTipoAlimentacion(){
        return super.tipo_alimentacion;
    }

    public int getEdad(){
        return super.edad;
    }

    public NivelDependencia getNivelDependencia(){
       return this.nivel_dependencia;
    }

    public TipoPelaje getPelaje(){
        return this.pelajegato;
    }

    public ColorPelajeGato getColorPelajeGato(){
        return this.color_pelaje_gato;
    }

    public void setNombre(String nombre){
        super.nombre = nombre;
    }

    public void setTipoAlimentacion(String tipo_alimentacion){
        super.tipo_alimentacion = tipo_alimentacion;
    }

    public void setEdad(int edad){
        super.edad = edad;
    }

    
    public void setNivelDependencia(NivelDependencia nivelDependencia){
       this.nivel_dependencia = nivelDependencia;
    }

      public void setPelaje(TipoPelaje pelaje){
        this.pelajegato = pelaje;
    }

       public void setColorPelajeGato(ColorPelajeGato color_pelaje){
        this.color_pelaje_gato = color_pelaje;
    }

    public void Maullar(){
        System.out.println("MIAU!!!!!!!!!!!!!!!!!!");
    }

     @Override
    public void hacerSonido(){
        Maullar();
    }

     @Override
    public String toString() {
        return "Nombre " + getNombre() + " Edad " + getEdad() + " TipoAlimentacion " + getTipo_alimentacion() + " Pelaje " + getPelaje()  + " Nivel de dependencia " + getNivelDependencia() + " Color del pelaje " + getColorPelajeGato();
    }





    






}
