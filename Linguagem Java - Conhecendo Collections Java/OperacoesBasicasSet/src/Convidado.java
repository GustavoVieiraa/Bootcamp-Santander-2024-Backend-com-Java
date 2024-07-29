
public class Convidado {
	//atributos
	
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite) {
		super();
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoConvite() {
		return codigoConvite;
	}
	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
}
