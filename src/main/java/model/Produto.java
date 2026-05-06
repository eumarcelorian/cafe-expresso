package model;

public class Produto {
    private String nome;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}