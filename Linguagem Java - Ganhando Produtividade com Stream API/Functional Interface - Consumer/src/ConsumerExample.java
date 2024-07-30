import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
	 	Representa uma operação que aceita um argumento do
	 	tipo T e não retorna nenhum resultado.
	 	
	 	É utilizada principalmente para realizar ações, ou efeitos
	 	colaterais nos elementos do Stream sem modificar, ou
	 	retonar um valor.
*/

public class ConsumerExample {

	public static void main(String[] args) {
		
		// Criar uma lista de numeros inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		// Usar o Consumer com expressão Lambda para imprimir números pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		};
		
		// Usar o Consumer para imprimir números pares no Stream
		numeros.stream().forEach(imprimirNumeroPar);
		
	}
		
}
