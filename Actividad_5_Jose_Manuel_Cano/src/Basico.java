import java.util.Arrays;

public class Basico extends Subscripcion {

    private double precio;
    private int duracion;
    private int dispositivos_activos;
    private boolean parar_subscripcion;
    private double total_cobrado;
    private double[] historial_mensual;
    private double[] historial_entero;

    private String nombre_perfil;

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDispositivos_activos() {
        return this.dispositivos_activos;
    }

    public void setDispositivos_activos(int dispositivos_activos) {
        this.dispositivos_activos = dispositivos_activos;
    }

    public boolean isParar_subscripcion() {
        return this.parar_subscripcion;
    }

    public void setParar_subscripcion(boolean parar_subscripcion) {
        this.parar_subscripcion = parar_subscripcion;
    }

    public double getTotal_cobrado() {
        return this.total_cobrado;
    }

    public void setTotal_cobrado(double total_cobrado) {
        this.total_cobrado = total_cobrado;
    }

    public double[] getHistorial_mensual() {
        return this.historial_mensual;
    }

    public void setHistorial_mensual(double[] historial_mensual) {
        this.historial_mensual = historial_mensual;
    }

    public double[] getHistorial_entero() {
        return this.historial_entero;
    }

    public void setHistorial_entero(double[] historial_entero) {
        this.historial_entero = historial_entero;
    }

    public String getNombre_perfil() {
        return this.nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public Basico() {
        this.precio = 4.99;
        this.duracion = 0;
        this.dispositivos_activos = 1;
        this.parar_subscripcion = false;
        this.total_cobrado = 0;
        this.historial_mensual = new double[duracion];
        this.historial_entero = new double[duracion];
        this.nombre_perfil = "";
    }

    public Basico(String nombrePerfil, int duracion, int dispositivosActuales) {
        this.duracion = duracion;
        this.historial_mensual = new double[duracion];
        this.historial_entero = new double[duracion];
        this.dispositivos_activos = dispositivosActuales;
        this.nombre_perfil = nombrePerfil;
        this.precio = 4.99;
    }

    @Override
    public boolean ControlarDispositivos() {

        if (this.dispositivos_activos > 1) {
            this.parar_subscripcion = true;
            return false;

        }
        this.parar_subscripcion = false;
        return true;
    }

    @Override
    public void InicializarHistorial(){
         for (int i = 0; i < historial_mensual.length; i++){
           historial_mensual[i] = precio;
         }
    }

    @Override
    public void CobroPlan() {

        double total = 0;

        for (int i = 0; i < duracion; i++) {
            if (historial_mensual[i] != 0) {
                total += historial_mensual[i];
                

            }

        }

        total_cobrado = total;

    }

    @Override
    public double[] HistoriaMensual() {

        for (int i = 0; i < duracion; i++) {
            historial_entero[i] = historial_mensual[i];
        }

        return historial_entero;
    }

   @Override
    public boolean PausarSubscripcion() {

        if (duracion >= 6 && parar_subscripcion == false) {

            int i = historial_mensual.length -1;

            if (historial_mensual[i] > 0) {
                historial_mensual[i] = 0;
                parar_subscripcion = true;
                return true;
            }

        }

        return false;
    }

}