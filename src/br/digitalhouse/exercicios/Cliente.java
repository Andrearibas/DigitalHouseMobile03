package br.digitalhouse.exercicios;

public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente(String novoNome, String novoSobrenome){
        nome = novoNome;
        sobrenome = novoSobrenome;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
