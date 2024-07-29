import java.util.HashSet;
import java.util.Set;

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
	
	
	
}
