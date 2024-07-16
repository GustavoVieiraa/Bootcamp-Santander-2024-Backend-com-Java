package AparelhoTelefonico;

public class telefoneSistema implements AparelhoTelefonico {

	@Override
	public String ligar(String numero) {
		// TODO Auto-generated method stub
		return "ligando para: " + numero;
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ligação atendida.");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("gravando correio de voz.");
	}

}
