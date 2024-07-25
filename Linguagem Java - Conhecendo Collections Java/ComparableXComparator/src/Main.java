import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		@SuppressWarnings("serial")
		ArrayList<Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("Java - Guia do Programador", "Peter Jandl", 2020));
				add(new Livro("Kotlin em ação", "Dmitry Jemerov", 2017));
				add(new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", 2023));
			}
		};
		
		System.out.println("Livros após a ordenação natural (Título): ");
		Collections.sort(livros);
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " +
							livro.getAutor() + " - " +
							livro.getAno());
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Livros após a ordenação por ano: ");
		Collections.sort(livros, new CompararAno());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
							livro.getTitulo() + " - " +
							livro.getAutor());
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Livros após a ordenação por autor: ");
		Collections.sort(livros, new CompararAutor());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
							livro.getTitulo() + " - " +
							livro.getAutor());
		}
	}
}
