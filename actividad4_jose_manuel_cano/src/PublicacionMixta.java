import java.awt.Desktop;

public class PublicacionMixta extends Publicacion {
    
    public PublicacionMixta(){
        super();
        super.texto = "";
        super.desktop = Desktop.getDesktop();
    }
}
