import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		super();
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Gustavo", 255839);
		agendaContatos.adicionarContato("Gustavo Vieira", 239123);
		agendaContatos.adicionarContato("Gustavo DIO", 255555);
		agendaContatos.adicionarContato("Gustavo Souza", 938271);
		agendaContatos.adicionarContato("Maria Silva", 212938);
		agendaContatos.adicionarContato("Gustavo", 255839);
		
		agendaContatos.exibirContatos();
			
		agendaContatos.removerContato("Maria Silva");
		
		agendaContatos.exibirContatos();
		
		System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Gustavo DIO"));
		
	}
	
}
