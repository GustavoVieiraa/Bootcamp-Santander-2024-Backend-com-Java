public class Conta {

    Integer numConta;
    String Agencia;
    String NomeCliente;
    Double Saldo;

    public Conta() {}

    public Conta(Integer numConta, String agencia, String NomeCliente, Double Saldo) {
        this.numConta = numConta;
        this.Agencia = agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Olá, "+NomeCliente+", obrigado por criar uma conta em nosso banco, "+
        "sua agência é "+Agencia+", conta "+numConta+" e seu saldo "+Saldo+" já está "+
        "disponível para saque.";
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

}
