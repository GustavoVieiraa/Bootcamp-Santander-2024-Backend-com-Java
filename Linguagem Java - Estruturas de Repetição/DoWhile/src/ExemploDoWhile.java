import java.util.Random;
import java.util.random.*;

public class ExemploDoWhile {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while(tocando());
        
        System.out.println("Alô !!!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }

}
