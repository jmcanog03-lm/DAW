import java.awt.Desktop;

import java.io.File;

public abstract class Publicacion {
     protected String texto;
     //hash
     //protected Img imagen;
     //protected Usuario usuario;
     Desktop desktop = Desktop.getDesktop();

    //Enum protected

    public Publicacion(String texto, Desktop desktop) {
        this.texto = texto;
        this.desktop = desktop;
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



}
