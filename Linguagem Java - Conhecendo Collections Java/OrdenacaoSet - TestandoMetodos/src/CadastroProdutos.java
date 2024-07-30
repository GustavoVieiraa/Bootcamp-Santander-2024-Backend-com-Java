import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	//atributos
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		super();
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
		
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoSet.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	
	public static void main(String[] args) {
		
		CadastroProdutos cadastroProduto = new CadastroProdutos();
		
		cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
		cadastroProduto.adicionarProduto(2L, "Produto 0", 20d, 10);
		cadastroProduto.adicionarProduto(5L, "Produto 3", 10d, 2);
		cadastroProduto.adicionarProduto(9L, "Produto 9", 2d, 2);
		
		System.out.println(cadastroProduto.produtoSet);
		
		System.out.println(cadastroProduto.exibirProdutosPorNome());
		
	}
	
}
