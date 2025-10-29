package ejercicio4;

public class Cuenta {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
