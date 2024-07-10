import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class ExemploTryCatch {
    public static void main(String[] args) throws Exception {
        
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // print dados do usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho idade " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
            scanner.close();

        }
        catch (InputMismatchException ex) {
            System.out.println("Esses campos devem ser númericos | " + ex.getMessage());
        }
        
    }

}
