package ejercicio3;

public class EmpleadoRH extends Empleado {

    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);
    }

    public Empleado contratarEmpleado(String nombre, String apellidos, String puesto) {
        System.out.println("Empleado contratado: " + nombre + " " + apellidos + ", Puesto: " + puesto);
        return new Empleado(nombre, apellidos, puesto);
    }

    public static void main(String[] args) {
        EmpleadoRH rh = new EmpleadoRH("Carlos", "Pérez", "Recursos Humanos");
        Empleado nuevo = rh.contratarEmpleado("Ana", "López", "Ventas");
        nuevo.trabajar();
        System.out.println("Salario mensual: $" + nuevo.calcularSalario());
    }
}
