package br.fastfood.model;

public class Burger implements ItemCombo {
    private String nome;
    private double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}


