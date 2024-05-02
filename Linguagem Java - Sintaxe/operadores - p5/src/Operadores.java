public class Operadores {

    /*
                                    Ternário
            O operador de condição ternária é uma forma resumida para
            definir uma condição e escolher por um dentre dois valores.
            Você deve pensar numa condição ternária como se fosse uma
            condição IF normal, porém, de uma forma em que toda a
            sua estrutura estará escrita numa única linha.

            O operador ternário é representado pelos símbolos ?: 
            utilizados na estrutura de sintaxe.

      
     */


    public static void main(String[] args) {
        
        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

    }
}