
public class Main {

	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1995);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2005);
		catalogoLivros.adicionarLivro("Livro 11", "Autor 2", 2002);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2007);
		catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2010);
		catalogoLivros.adicionarLivro("Livro 6", "Autor 6", 2001);
		catalogoLivros.adicionarLivro("Livro 7", "Autor 7", 2009);
		
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 7"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1995, 2002));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 6"));
		
	}
	
}
