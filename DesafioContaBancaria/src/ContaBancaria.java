public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String toString() {
        return "Olá " + this.nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.";
    }
}
