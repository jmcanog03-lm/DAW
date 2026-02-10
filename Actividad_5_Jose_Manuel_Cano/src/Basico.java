public class Basico extends Subscripcion{

    private double precio;
    private int duracion;
    private int dispositivos_activos;
    private boolean parar_subscripcion;
    private double total_cobrado ;
    private double [] historial_mensual;

    public Basico(){
        this.precio = 4.99;
        this.duracion = 0;
        this.dispositivos_activos = 0;
        this.parar_subscripcion = false;
        this.total_cobrado =0;
        this.historial_mensual = new double[duracion];
    }

    public Basico(int duracion){
        this.duracion = duracion;
        
    }


    @Override
    public boolean ControlarDispositivos(){
        if(this.dispositivos_activos > 1){
            this.parar_subscripcion = true;
            return false;
            
        }
        this.parar_subscripcion = false;
        return true;
    }

    @Override
    public void CobroPlan(){

        double total = this.duracion * this.precio;
        this.total_cobrado = total;
    }

    @Override
    public double[] HistoriaMensual(){
        for(int i =0; i < duracion; i++){
            historial_mensual[i] = precio;
        }

        return historial_mensual;
    }


}