import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	//atributo
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = null;
		for (Contato c : contatoSet) {
			if (c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Gustavo Vieira", 19223213);
		agendaContatos.adicionarContato("Gustavo Vi", 11111113);
		agendaContatos.adicionarContato("Gustavo Vi", 12323213);
		agendaContatos.adicionarContato("Gustavo Souza", 15223213);
		agendaContatos.adicionarContato("Rafael Medina", 19223213);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.pesquisarPorNome("Gustavo");
		
	}	
	
	
}
