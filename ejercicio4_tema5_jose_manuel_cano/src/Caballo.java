public class Caballo extends Animal {
    private float altura;
    private int velocidadMaxima;
    private int distancia;

    public Caballo() {
        super();
        super.nombre = "";
        super.tipo_alimentacion = "";
        super.edad = 0;
        this.altura = 0;
        this.velocidadMaxima = 0;
    }

    public Caballo(String nombre, String tipo_alimentacion, int edad, int altura, int velocidadMaxima) {
        super.nombre = nombre;
        super.tipo_alimentacion = tipo_alimentacion;
        super.edad = edad;
        this.altura = altura;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return super.nombre;
    }

    public String getTipoAlimentacion() {
        return super.tipo_alimentacion;
    }

    public int getEdad() {
        return super.edad;
    }

    public float getAltura() {
        return this.altura;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    public void setTipoAlimentacion(String tipo_alimentacion) {
        super.tipo_alimentacion = tipo_alimentacion;
    }

    public void setEdad(int edad) {
        super.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void relinchar() {
        System.out.println("gijaaaaaaaa");
    }

    public int correr(int distancia) {
        int tiempo = distancia / velocidadMaxima;
        return tiempo;
    }

     @Override
    public void hacerSonido(){
        relinchar();
    }

     @Override
    public String toString() {
        return "Nombre " + getNombre() + " Edad " + getEdad() + " TipoAlimentacion " + getTipo_alimentacion() + " Altura " + getAltura() + " Velocidad en Máxima " + getVelocidadMaxima();
    }


}
