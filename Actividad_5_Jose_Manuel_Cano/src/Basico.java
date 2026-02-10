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

            for (int i = 0; i < historial_mensual.length; i++) {
                if (historial_mensual[i] != 0) {
                    historial_mensual[i] = 0;
                    parar_subscripcion = true;
                    return true;
                }

            }

        }

        return false;
    }

}