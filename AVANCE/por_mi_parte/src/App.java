import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario(1, "Carlos", "sol123");
        Usuario usuario2 = new Usuario(2, "Ana", "luna456");
        Usuario usuario3 = new Usuario(3, "Pedro", "roca789");
        Usuario usuario4 = new Usuario(4, "Lucia", "flor321");
        Usuario usuario5 = new Usuario(5, "Miguel", "rio654");
        Usuario usuario6 = new Usuario(6, "Sofia", "estrella987");
        Usuario usuario7 = new Usuario(7, "Javier", "viento147");
        Usuario usuario8 = new Usuario(8, "Elena", "mar258");
        Usuario usuario9 = new Usuario(9, "David", "arena369");
        Usuario usuario10 = new Usuario(10, "Marta", "nube159");
        Usuario usuario11 = new Usuario(11, "Raul", "fuego753");
        Usuario usuario12 = new Usuario(12, "Paula", "tierra852");
        Usuario usuario13 = new Usuario(13, "Sergio", "bosque951");
        Usuario usuario14 = new Usuario(14, "Laura", "cielo357");
        Usuario usuario15 = new Usuario(15, "Alberto", "trueno654");
        Usuario usuario16 = new Usuario(16, "Natalia", "hoja456");
        Usuario usuario17 = new Usuario(17, "Diego", "montana741");
        Usuario usuario18 = new Usuario(18, "Claudia", "sol987");
        Usuario usuario19 = new Usuario(19, "Ivan", "lago258");
        Usuario usuario20 = new Usuario(20, "Carmen", "brisa369");
        Usuario usuario21 = new Usuario(21, "Bruce", "12345");

        GestorUsuario gU = new GestorUsuario();
        GestorContenido gC = new GestorContenido();

        HashSet<Etiquetas> sEtiquetas1 = new HashSet<>();
        sEtiquetas1.add(Etiquetas.Accion);
        sEtiquetas1.add(Etiquetas.Autos);
        sEtiquetas1.add(Etiquetas.Carrera);
        sEtiquetas1.add(Etiquetas.Comedia);
        sEtiquetas1.add(Etiquetas.Ejercicio);

        HashSet<Etiquetas> sEtiquetas2 = new HashSet<>();
        sEtiquetas2.add(Etiquetas.Futbol);
        sEtiquetas2.add(Etiquetas.Carrera);
        sEtiquetas2.add(Etiquetas.Tecnologia);
        sEtiquetas2.add(Etiquetas.Autos);

        HashSet<Etiquetas> sEtiquetas3 = new HashSet<>();
        sEtiquetas3.add(Etiquetas.Terror);
        sEtiquetas3.add(Etiquetas.Tecnologia);
        sEtiquetas3.add(Etiquetas.Futbol);
        sEtiquetas3.add(Etiquetas.Comedia);
        sEtiquetas3.add(Etiquetas.Autos);

        gC.crearContenido("Hoy estoy aprendiendo Java y me está gustando mucho.", null, usuario1, sEtiquetas1, null);
        gC.crearContenido("Trabajando en mi proyecto de red social para clase.", null, usuario2, sEtiquetas1, null);
        gC.crearContenido("Las interfaces en Java ayudan a organizar mejor el código.", null, usuario3, sEtiquetas1,
                null);
        gC.crearContenido("Probando el sistema de publicaciones de la aplicación.", null, usuario4, sEtiquetas1, null);
        gC.crearContenido("Hoy avancé bastante en la parte de gestión de usuarios.", null, usuario5, sEtiquetas1, null);

        gC.crearContenido(null, "archivos/documento1.pdf", usuario6, sEtiquetas2, "Documento de requisitos");
        gC.crearContenido(null, "imagenes/proyecto.png", usuario7, sEtiquetas2, "Captura del proyecto");
        gC.crearContenido(null, "imagenes/diagrama.jpg", usuario8, sEtiquetas2, "Diagrama del sistema");
        gC.crearContenido(null, "archivos/manual_usuario.pdf", usuario9, sEtiquetas2, "Manual de usuario");
        gC.crearContenido(null, "imagenes/menu_app.png", usuario10, sEtiquetas2, "Imagen del menú principal");

        gC.crearContenido("Aquí comparto una imagen del avance del proyecto.", "imagenes/avance1.png", usuario11,
                sEtiquetas3, "Avance del proyecto");
        gC.crearContenido("Este es el diagrama UML que estoy usando.", "imagenes/uml.jpg", usuario12, sEtiquetas3,
                "Diagrama UML");
        gC.crearContenido("Subo una captura del código funcionando.", "imagenes/codigo_funcionando.png", usuario13,
                sEtiquetas3, "Código en ejecución");
        gC.crearContenido("Foto de mi entorno de desarrollo mientras programo.", "imagenes/setup.jpg", usuario14,
                sEtiquetas3, "Entorno de desarrollo");
        gC.crearContenido("Aquí dejo el documento con el análisis del sistema.", "archivos/analisis.pdf", usuario15,
                sEtiquetas3, "Documento de análisis");

        gU.registrar_Usuario(usuario1);
        gU.registrar_Usuario(usuario2);
        gU.registrar_Usuario(usuario3);
        gU.registrar_Usuario(usuario4);
        gU.registrar_Usuario(usuario5);
        gU.registrar_Usuario(usuario6);
        gU.registrar_Usuario(usuario7);
        gU.registrar_Usuario(usuario8);
        gU.registrar_Usuario(usuario9);
        gU.registrar_Usuario(usuario10);
        gU.registrar_Usuario(usuario11);
        gU.registrar_Usuario(usuario12);
        gU.registrar_Usuario(usuario13);
        gU.registrar_Usuario(usuario14);
        gU.registrar_Usuario(usuario15);
        gU.registrar_Usuario(usuario16);
        gU.registrar_Usuario(usuario17);
        gU.registrar_Usuario(usuario18);
        gU.registrar_Usuario(usuario19);
        gU.registrar_Usuario(usuario20);

        RedSocial rs = new RedSocial(usuario20, gU.coleccionUsuarios(), gC);

        System.out.println(rs.PublicacionesPortal());
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Abrir publicación, coloca su ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println(rs.abrirPublicacion(id));
        System.out.println("");
        System.out.println("Deseas seguir al usuario de esta publicación? ----- si / no");
        String decision = sc.nextLine();
        if (decision.equals("si")) {
            System.out.println(rs.ConfirmarSeguimientoUsuario(id));
        }
        System.out.println("Deseas seguir al usuario de esta publicación? ----- si / no");
        decision = sc.nextLine();
        if (decision.equals("si")) {
            System.out.println(rs.ConfirmarSeguimientoUsuario(id));
        }

    }
}
