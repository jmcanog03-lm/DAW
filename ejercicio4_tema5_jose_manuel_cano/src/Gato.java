public class Gato extends Animal{
    private NivelDependencia nivel_dependencia;
    private TipoPelaje pelajegato;
    private ColorPelajeGato color_pelaje_gato;

    public Gato(){
        super();
        super.nombre = "";
        super.tipo_alimentacion = " ";
        super.edad =0;

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


    






}
