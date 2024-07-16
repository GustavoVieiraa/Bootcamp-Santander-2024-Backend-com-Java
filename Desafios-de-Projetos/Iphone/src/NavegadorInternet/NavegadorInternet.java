package NavegadorInternet;

public interface NavegadorInternet {
	
	
	public default String exibirPagina(String url) {
		// TODO Auto-generated method stub
		return "Sua Página: " + url;
	}

	
	public default void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("nova aba adicionada!");
	}

	
	public default void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("sua página foi atualizada!");
	}
}
