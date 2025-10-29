package ejercicio4;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad < 100) {
            System.out.println("No puede retirar, el saldo no puede ser menor a $100.");
        } else {
            super.retirar(cantidad);
        }
    }

    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros(300);
        cuenta.retirar(250);
        cuenta.retirar(150);
        cuenta.depositar(200);
        cuenta.retirar(150);
    }
}
