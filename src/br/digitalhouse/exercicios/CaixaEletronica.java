package br.digitalhouse.exercicios;

public class CaixaEletronica {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Andrea","Ribas");
        Cliente cliente2 = new Cliente("Gilliard","Silva");


        Conta conta1 = new Conta(12345,150.0f,cliente1);
        Conta conta2 = new Conta(54321,520.50f,cliente2);


        conta1.deposito(500f);
        System.out.println("**********************");
        conta1.sacar(300f);

        System.out.println("**********************");
        conta2.deposito(50f);
        System.out.println("**********************");
        conta2.sacar(1200.25f);

    }
}
