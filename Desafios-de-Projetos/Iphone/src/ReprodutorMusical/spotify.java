package ReprodutorMusical;

public class spotify implements ReprodutorMusical {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("música tocando...");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("música pausada...");
	}

	@Override
	public String selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		return "música selecionada: " + musica;
	}

}
