package ejercicio2;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5, 3);
        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Perímetro del rectángulo: " + r.calcularPerimetro());
    }
}
