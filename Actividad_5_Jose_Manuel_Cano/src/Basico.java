public class Basico extends Subscripcion{

    public Basico(){
        super();
        super.precio = 4.99;
        super.nombre = "";
        super.dispositivos =1;
        super.duracion =0;
    }

  

    @Override
    public void controlar_dispositivos(){
        if(super.dispositivos > 1){
            System.out.println("bloqueate");

        }
    }


}