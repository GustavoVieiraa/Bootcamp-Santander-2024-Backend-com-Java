import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
	//atributo
	private List<Livro> listaLivro;

	public CatalagoLivros() {
		this.listaLivro = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int AnoPublicacao) {
		listaLivro.add(new Livro(titulo, autor, AnoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!listaLivro.isEmpty()) {
			for (Livro l : listaLivro) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!listaLivro.isEmpty()) {
			for (Livro l : listaLivro) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
 	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if (!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getTitulo().equals(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
		
	}
	
}
