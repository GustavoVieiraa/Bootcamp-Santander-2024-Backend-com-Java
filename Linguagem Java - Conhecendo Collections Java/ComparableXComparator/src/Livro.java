import java.lang.Comparable;
import java.util.Comparator;

class Livro implements Comparable<Livro>{
	private String titulo;
	private String autor;
	private int ano;
	
	public Livro(String ti, String au, int an) {
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}
	
	@Override
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAno() {
		return ano;
	}
}

// Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
	public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());	
	}
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
	public int compare(Livro l1, Livro l2) {
		if (l1.getAno() < l2.getAno())
				return -1;
		if (l1.getAno() > l2.getAno())
				return 1;
		else
				return 0;
	}
}

// Classe para comparar Livro por ano, autor ou titulo
class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int ano = Integer.compare(l1.getAno(), l2.getAno());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}

 