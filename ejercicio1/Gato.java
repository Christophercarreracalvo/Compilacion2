package ejercicio1;

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: Miau Miau!");
    }

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();
    }
}
