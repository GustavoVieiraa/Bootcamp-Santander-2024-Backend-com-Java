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
			agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
}
