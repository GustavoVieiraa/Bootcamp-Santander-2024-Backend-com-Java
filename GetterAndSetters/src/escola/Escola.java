package escola;

public class Escola {

	public static void main(String[] args) {
		Aluno Gustavo = new Aluno();
		Gustavo.setIdade(21); 
		Gustavo.setNome("Gustavo");
		
		System.out.println("O Aluno " + Gustavo.getNome() + " tem " + 
		Gustavo.getIdade() + " anos.");
		
	}
	
}
