import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	//atributos
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		super();
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));	
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = 0.0;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public static void main(String[] args) {
		
		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.exibirProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 10, 15.0);
		estoque.adicionarProduto(2L, "Produto B", 5, 45.0);
		estoque.adicionarProduto(4L, "Produto C", 2, 25.0);
		estoque.adicionarProduto(6L, "Produto D", 7, 5.0);
		
		estoque.exibirProdutos();
		
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
		System.out.println("Obter valor mais caro: " + estoque.obterProdutoMaisCaro());
		
	}
	
}
