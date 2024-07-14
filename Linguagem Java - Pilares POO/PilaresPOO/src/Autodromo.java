
public class Autodromo {

	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		jeep.setChassi("342131231");
		jeep.ligar();
		
		
		Moto ninja250 = new Moto();
		ninja250.setChassi("21312313");
		ninja250.ligar();
		
		
		Veiculo coringa = ninja250;
		
		coringa.ligar();
		
	}
	
	
}
