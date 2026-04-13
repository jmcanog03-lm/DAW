import java.awt.Desktop;

import java.io.File;
import java.util.HashSet;

public abstract class Publicacion {
     protected String texto;
     protected String fechaPublicacion;
     protected HashSet<Etiquetas> etiquetasPublicacion;
     protected Usuario usuario;
     Desktop desktop = Desktop.getDesktop();
     protected int identificar;
     protected int contador;

    //Enum protected

    public Publicacion(String texto, String fechaPublicacion,Usuario usuario) {
        this.texto = texto;
        this.desktop = desktop;
        this.usuario = usuario;
        this.identificar = contador;
        contador++;
    }


    public Publicacion() {
        //TODO Auto-generated constructor stub
    }


    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Desktop getDesktop() {
        return this.desktop;
    }

    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }

    public void eliminarEtiqueta(Etiquetas etiqueta) {

        for (Etiquetas etiquetasEach : etiquetasPublicacion) {
            if (etiquetasEach == etiqueta) {
                etiquetasPublicacion.remove(etiquetasEach);
            }
        }

    

    @Override
    public String toString() {
        return "{" +
            " texto='" + getTexto() + "'" +
            ", fechaPublicacion='" + getFechaPublicacion() + "'" +
            ", desktop='" + getDesktop() + "'" +
            ", identificar='" + getIdentificar() + "'" +
            ", contador='" + getContador() + "'" +
            "}";
    }





}
