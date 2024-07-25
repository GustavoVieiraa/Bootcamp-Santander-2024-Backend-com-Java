import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	//atributo
	private List<Tarefa> listaDeTarefas;

	public ListaTarefa() {
		this.listaDeTarefas = new ArrayList<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		listaDeTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> listaDeTarefasParaRemover = new ArrayList<>();
		for (Tarefa t : listaDeTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				listaDeTarefasParaRemover.add(t);
			}
		}
		listaDeTarefas.removeAll(listaDeTarefasParaRemover);
	}
	
	
	public int obterNumeroTotalTarefas() {
		return listaDeTarefas.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaDeTarefas);
	}
	
}
