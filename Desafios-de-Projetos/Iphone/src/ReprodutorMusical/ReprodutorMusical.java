package ReprodutorMusical;

public interface ReprodutorMusical {
	
	public default void tocar() {
		// TODO Auto-generated method stub
		System.out.println("música tocando...");
	}

	
	public default void pausar() {
		// TODO Auto-generated method stub
		System.out.println("música pausada...");
	}

	
	public default String selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		return "música selecionada: " + musica;
	}
}
