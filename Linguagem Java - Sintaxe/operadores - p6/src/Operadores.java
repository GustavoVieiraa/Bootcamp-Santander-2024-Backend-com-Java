public class Operadores {

    /*
                                    Relacionais

            Os operadores relacionais avaliam a relação entre duas váriaveis
            ou expressões. Neste caso, mais precisamente, definem se o operando
            à esquerda é igual, diferente, menor, menor ou igual, maior ou igual
            ou igual ao da direita, retornando um valor booleano como resultado.
            
      
     */


    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

    }
}