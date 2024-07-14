
public class SistemaCadastro {

	public static void main(String[] args) {
		
		Pessoa gustavo = new Pessoa("531.232.421-53", "Gustavo");
		
		gustavo.setEndereço("Rua da Agua");
		
		System.out.println(gustavo.getNome() + " - " + gustavo.getCpf());
		
	}
	
}
