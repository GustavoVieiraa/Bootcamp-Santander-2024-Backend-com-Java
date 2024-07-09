public class Conta {

    // variavel visível para toda a classe
    double saldo = 10.0;

    public void sacar(Double valor) {

        // variavel local de método 
        double novoSaldo = saldo - valor;
    }
     
}

