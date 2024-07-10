import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            /*if (valorDoce > mesada) {
                valorDoce = mesada;
            }*/

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carinho.");
            mesada = mesada - valorDoce;

            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");

        }


    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
