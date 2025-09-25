package BorientacaoObjetos.Aintroducao.entities;

public class Banco {
    private int numConta;
    private String titularConta;
    private double saldo;
    private static final double TAXA_SAQUE = 5.0;

    public Banco(int numConta, String titularConta, double valorDeposito) {
        this(numConta, titularConta);
        depositar(valorDeposito);
    }

    public Banco(int numConta, String titularConta) {
        this.numConta = numConta;
        this.titularConta = titularConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getTitularConta() {
        return this.titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor + TAXA_SAQUE;
    }
}
