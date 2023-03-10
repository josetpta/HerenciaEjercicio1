public class Conserje extends Empleado {

    public void MostrarMensaje()
    {
        System.out.println("Estoy haciendo fotocopias");
    }

    @Override
    public int getVacaciones() {
        return super.getVacaciones() + 5;
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public int getHoras() {
        return super.getHoras();
    }

    @Override
    public String getMesVacaciones() {
        return "Septiembre";
    }


}
