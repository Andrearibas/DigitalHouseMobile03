package br.digitalhouse.exercicios;

public class Conta {
    private Integer numeroConta;
    private float saldo;
    private Cliente titular;

    public Conta(Integer novoNumeroConta, float novoSaldo, Cliente novoTitular){
      numeroConta = novoNumeroConta;
      saldo = novoSaldo;
      titular = novoTitular;
    }


    public void deposito(float quantiaDinheiro){
        System.out.println("Deposito no valor de R$ "+quantiaDinheiro+" efetuado com sucesso!");
        saldo = saldo + quantiaDinheiro;
        System.out.println("O novo saldo é R$ "+saldo);

    }

    public void sacar (float quantiaDinheiro){
        if (quantiaDinheiro<=saldo){
            System.out.println("Saque efetuado no valor R$ "+quantiaDinheiro);
            saldo = saldo - quantiaDinheiro;
            System.out.println("O novo saldo é R$ "+saldo);
        }else {
            System.out.println(titular.getNome()+" "+titular.getSobrenome()+", tentou sacar o valor R$  "+quantiaDinheiro);
            System.out.println("Saldo insuficiente: R$ "+saldo);
        }

    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
