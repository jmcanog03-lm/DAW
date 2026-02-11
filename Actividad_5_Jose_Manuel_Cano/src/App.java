import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Subscripcion[] subscripciones = new Subscripcion[3];

        Basico planBasico = new Basico("Jose", 3, 1);
        Estandar planEstandar = new Estandar("Alejandra", 7, 2);
        Premium planPremium = new Premium("Ana", 14, 3);
        subscripciones[2] = planPremium;
        subscripciones[0] = planBasico;
        subscripciones[1] = planEstandar;

        for (Subscripcion s : subscripciones) {

            if (s != null) {
                s.InicializarHistorial();
                s.CobroPlan();
            }

        }

        for (Subscripcion s : subscripciones) {
            if (s != null) {

                if (s instanceof Basico b) {
                    System.out.println("Usuario " + b.getNombre_perfil());
                    System.out.println("Tipo de Plan " + b.getClass().getSimpleName());
                    System.out.println("Meses Contratados " + b.getDuracion());
                    System.out.println("Dispositivos Conectados " + b.getDispositivos_activos());
                    System.out.println("Precio Final " + b.getTotal_cobrado());
                    System.out.println("Historial Mensual " + Arrays.toString(b.HistoriaMensual()));
                } else if (s instanceof Estandar es) {
                    System.out.println("Usuario " + es.getNombre_perfil());
                    System.out.println("Tipo de Plan " + es.getClass().getSimpleName());
                    System.out.println("Meses Contratados " + es.getDuracion());
                    System.out.println("Dispositivos Conectados " + es.getDispositivos_activos());
                    System.out.println("Precio Final " + es.getTotal_cobrado());
                    System.out.println("Pausa de la subscripcion " + es.PausarSubscripcion());
                    System.out.println("Historial Mensual " + Arrays.toString(es.HistoriaMensual()));
                } else if (s instanceof Premium pre) {
                    System.out.println("Usuario " + pre.getNombre_perfil());
                    System.out.println("Tipo de Plan " + pre.getClass().getSimpleName());
                    System.out.println("Meses Contratados " + pre.getDuracion());
                    System.out.println("Dispositivos Conectados " + pre.getDispositivos_activos());
                    System.out.println("Precio Final " + pre.getTotal_cobrado());
                    System.out.println("Historial Mensual " + Arrays.toString(pre.HistoriaMensual()));

                }

                // System.out.println("Usuario " + b.getNombre_perfil());
                // System.out.println("Tipo de Plan " + b.getClass().getSimpleName());
                // System.out.println("Meses Contratados " + b.getDuracion());
                // System.out.println("Dispositivos Conectados " + b.getDispositivos_activos());

            }

            System.out.println("------------------------------");

        }

    }
}
