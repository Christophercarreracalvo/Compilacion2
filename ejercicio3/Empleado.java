package ejercicio3;

public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    protected static final int HORAS_TRABAJADAS_DIA = 8;
    protected static final double PAGO_HORA = 10.0;

    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    public void trabajar() {
        System.out.println(nombre + " " + apellidos + " está trabajando.");
    }

    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * PAGO_HORA * 5 * 4;
    }
}
