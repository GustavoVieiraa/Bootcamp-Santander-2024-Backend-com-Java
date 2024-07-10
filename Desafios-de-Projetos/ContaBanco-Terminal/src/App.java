import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner myObjScanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = myObjScanner.nextLine();

        System.out.println("Número conta: ");
        Integer numConta = myObjScanner.nextInt();

        System.out.println("Nome: ");
        String nomeCliente = myObjScanner.next();
        
        System.out.println("Saldo: ");
        Double saldo = myObjScanner.nextDouble();


        Conta conta = new Conta(numConta, agencia, nomeCliente, saldo);

        System.out.println(conta.toString());


    }
}
