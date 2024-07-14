/*
 *	Classe de modelo (model): classes que representem estrutura de dominio
 *	da aplicação, exemplo: Cliente, Pedido, Nota fiscal, etc. 
 * 
 * 	Classe de serviço (service): classes que contém regras de negócios e 
 *  validação de nosso sistema.
 *  
 *  Classe de repositório (repository): classes que contém uma integração
 *  com banco de dados.
 *  
 *  Classe de controle (controller): classes que possuem a finalidade de
 *  disponibilizar alguma comunicação externa à nossa aplicação, tipo
 *  http, web ou webservices.
 *  
 *  Classe utilitária (util): classe que contém recursos comuns à toda nossa
 *  aplicação. 
 * */


public class Student {
		
	String name;
	int age;
	Color color;
	Sex sex;
	

	public static void main(String[] args) {
		
		System.out.println("Hello!");
		
	}
	
	
	void eating(Food food) {
		
	}
	
	void drinking() {
		
	}
	
	void running() {
		
	}

}