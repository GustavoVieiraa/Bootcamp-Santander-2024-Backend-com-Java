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
	
	public static void main(String[] args) {
		
		ListaTarefa lista = new ListaTarefa();
		System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
		
		lista.adicionarTarefa("Tarefa 1");
		lista.adicionarTarefa("Tarefa 2");
		lista.adicionarTarefa("Tarefa 3");
		lista.adicionarTarefa("Tarefa 3");
		System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
		
		lista.removerTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
		
		lista.obterDescricoesTarefas();
		
	}
	
}
