public class CaixaEletronico {

    /*          Condicional Simples           */

    public static void main(String[] args) throws Exception {
        
            double saldo = 25.0;
            double valorSolicitado = 37.0;

            if (valorSolicitado < saldo) {
                saldo = saldo - valorSolicitado;
            }

            System.out.println(saldo);

    }
}
