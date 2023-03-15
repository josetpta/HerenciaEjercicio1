public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Empleado empleado1 = new Empleado();
        System.out.println("El empleado 1, su información es:");
        System.out.println("Salario: " + empleado1.getSalario());
        System.out.println("Mes de vacaciones:" + empleado1.getMesVacaciones());
        System.out.println("Horas que trabaja:" + empleado1.getHoras());
        System.out.println("Días de vacaciones: " + empleado1.getVacaciones());

        Empleado abogado = new Abogado();
        System.out.println("El abogado, su información es:");
        System.out.println("Salario: " + abogado.getSalario());
        System.out.println("Mes de vacaciones:" + abogado.getMesVacaciones());
        System.out.println("Horas que trabaja:" + abogado.getHoras());
        System.out.println("Días de vacaciones: " + abogado.getVacaciones());

        Secretario secretario = new Secretario();
        System.out.println("El secretario, su información es:");
        System.out.println("Salario: " + secretario.getSalario());
        System.out.println("Mes de vacaciones:" + secretario.getMesVacaciones());
        System.out.println("Horas que trabaja:" + secretario.getHoras());
        System.out.println("Días de vacaciones: " + secretario.getVacaciones());

        secretario.Entrar();

    }
}