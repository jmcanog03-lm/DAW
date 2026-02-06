public class Perro extends Animal {
    private String  raza;
    private Tamano tamano;
    private NivelEnergia nivelEnergia;
    private TipoPelaje pelaje;

    public Perro() {
        super();
        super.nombre = "";
        super.tipo_alimentacion = "";
        super.edad = 0;
        this.tamano = Tamano.PEQUEÑO;
        this.raza = "";
        this.pelaje = TipoPelaje.LARGO;
        this.nivelEnergia = NivelEnergia.CINCO;
    }

    public Perro(String nombre, TipoPelaje pelaje, String raza, int edad, String tipo_alimentacion, Tamano tamano,
            NivelEnergia nivelEnergia) {
        super.nombre = nombre;
        super.tipo_alimentacion = tipo_alimentacion;
        super.edad = edad;
        this.pelaje = pelaje;
        this.nivelEnergia = nivelEnergia;
        this.raza = raza;
        this.tamano = tamano;
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

    public TipoPelaje getPelaje() {
        return this.pelaje;
    }

    public String getRaza() {
        return this.raza;
    }

    public Tamano getTamano() {
        return this.tamano;
    }

    public NivelEnergia getNivelEnergia() {
        return this.nivelEnergia;
    }

    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    public void setPelaje(TipoPelaje pelaje) {
        this.pelaje = pelaje;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public void setEdad(int edad) {
        super.edad = edad;
    }

    public void setTipoAlimentacion(String tipo_alimentacion) {
        super.tipo_alimentacion = tipo_alimentacion;
    }

    public void setNivelEnergia(NivelEnergia nivelenergia) {
        this.nivelEnergia = nivelenergia;
    }

    public void ladrar() {
        switch (tamano) {
            case PEQUEÑO:
                System.out.println("guau");
                break;

            case MEDIANO:
                System.out.println("guau guau");
                break;

            case GRANDE:
                System.out.println("GUAAAAAU GUAAAUU!!!!!!!!!");
                break;

            default:
                System.out.println("El tamaño del perro debe ser o mediano o pequeño o grande");
                break;
        }
    }

    @Override
    public String toString() {
        return "Nombre " + getNombre() + " Edad " + getEdad() + " TipoAlimentacion " + getTipo_alimentacion() + " Pelaje " + getPelaje() + " Tamaño " + getTamano() + " Nivel de Energia " + getNivelEnergia() + " Raza " + getRaza();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }

        if(!(obj instanceof Perro)){
            return false;
        }

        Perro  perro = (Perro) obj;

        return this.nombre.equals(perro.getNombre()) && this.tipo_alimentacion.equals(perro.getTipoAlimentacion()) && this.edad == perro.getEdad() && this.pelaje.equals(perro.getPelaje()) && this.nivelEnergia == perro.getNivelEnergia() && this.raza.equals(perro.getRaza()) && this.tamano == perro.getTamano();

    }

    @Override
    public void hacerSonido(){
        ladrar();
    }

}
