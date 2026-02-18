public interface ocupable extends utilizable {

    public boolean ocupar();

    public boolean desocupar();

    @Override
    public void utilizar();
    
} 