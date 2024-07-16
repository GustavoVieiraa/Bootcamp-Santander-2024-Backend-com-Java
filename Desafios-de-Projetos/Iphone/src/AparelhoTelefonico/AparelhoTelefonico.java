package AparelhoTelefonico;

public interface AparelhoTelefonico {
	
	public default String ligar(String numero) {
		return "ligando para: " + numero;
	}

	
	public default void atender() {
		// TODO Auto-generated method stub
		System.out.println("ligação atendida.");
	}

	
	public default void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("gravando correio de voz.");
	}
}
