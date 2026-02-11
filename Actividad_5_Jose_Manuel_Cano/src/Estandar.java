public class Estandar extends Subscripcion {
    private double precio;
    private int duracion;
    private int dispositivos_activos;
    private boolean parar_subscripcion;
    private double total_cobrado;
    private double[] historial_mensual;
    private double[] historial_entero;
    private String nombre_perfil;
    private int recargo;
    private int descuento = 0;

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

    public int getRecargo() {
        return this.recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }

    public int getDescuento() {
        return this.descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Estandar() {
        this.precio = 7.99;
        this.duracion = 0;
        this.dispositivos_activos = 2;
        this.parar_subscripcion = false;
        this.total_cobrado = 0;
        this.historial_mensual = new double[duracion];
        this.historial_entero = new double[duracion];
        this.nombre_perfil = "";
        this.recargo = 0;
        this.descuento = 5;
    }

    public Estandar(String nombrePerfil, int duracion, int dispositivosActuales) {
        this.duracion = duracion;
        this.historial_mensual = new double[duracion];
        this.historial_entero = new double[duracion];
        this.dispositivos_activos = dispositivosActuales;
        this.nombre_perfil = nombrePerfil;
        this.precio = 7.99;

    }

    @Override
    public boolean ControlarDispositivos() {

        if (this.dispositivos_activos > 2) {
            this.recargo = 2;
        } else {
            this.recargo = 0;
        }

        return true;
    }

    @Override
    public void InicializarHistorial() {

        for (int i = 0; i < historial_mensual.length; i++) {

            double precio_al_mes = this.precio;

            double precio_final = precio_al_mes;

            if (ControlarDispositivos()) {

                precio_final += recargo;

            }

            if (this.duracion >= 6) {
                precio_final *= 0.95;
            }

            if (parar_subscripcion) {
                precio_final = 0;
            }

            historial_mensual[i] = precio_final;
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
