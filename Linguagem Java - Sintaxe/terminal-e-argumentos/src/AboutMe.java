import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura:");
        Double alt = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.println("Olá, me chama " + nome + " " + sobrenome);
        System.out.println("Tenho " +  idade + " anos");
        System.out.println("Minha altura é " + alt + " cm");
    }
}