public class Operadores {

    /*
                                    Lógicos

            Os operadores lógicos representam o recurso que nos permite
            criar expressões lógicas maiores a partir da junção de duas
            ou mais expressões.

                - && Operador Lógico "E"
                - || Operador Lógico "OU"
            
      
     */


    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras...");
        }

        if (condicao1 || condicao2) {
            System.out.println("apenas uma das condições é verdadeira...");
        }

    }
}