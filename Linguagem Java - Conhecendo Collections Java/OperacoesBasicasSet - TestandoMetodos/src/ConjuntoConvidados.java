import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class ConjuntoConvidados {

	//atributo
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		super();
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvidado) {
		convidadoSet.add(new Convidado(nome, codigoConvidado));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()
				+ " convidado(s) dentro do Set convidados");
		
		conjuntoConvidados.adicionarConvidado("nomeConvidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("nomeConvidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("nomeConvidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("nomeConvidado 4", 1237);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()
				+ " convidados(s) dentro do Set convidados");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()
		+ " convidados(s) dentro do Set convidados");
	
		conjuntoConvidados.exibirConvidados();
	}
	
}
