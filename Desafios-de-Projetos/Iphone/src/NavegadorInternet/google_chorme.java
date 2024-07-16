package NavegadorInternet;

public class google_chorme implements NavegadorInternet {

	@Override
	public String exibirPagina(String url) {
		// TODO Auto-generated method stub
		
		return "Sua Página: " + url;
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("nova aba adicionada!");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("sua página foi atualizada!");
	}

}
