
public class App {

	public static void main(String[] args) {
		
		Cliente gustavo = new Cliente();
		Cliente sophya = new Cliente();
		sophya.setNome("Sophya");
		gustavo.setNome("Gustavo");
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(sophya);
		
		cc.depositar(100);
		cc.transferir(poupanca, 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
	
}
