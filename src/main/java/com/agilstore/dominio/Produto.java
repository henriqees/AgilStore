package com.agilstore.dominio;

public class Produto {

    private String nomeProduto;
    private String categoria;
    private int quantidade;
    private double preco;
    private int id;

    public Produto (String nomeProduto, String categoria, int quantidade, double preco, int id){
        this.nomeProduto=nomeProduto;
        this.categoria=categoria;
        this.quantidade=quantidade;
        this.preco=preco;
        this.id=id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }
}
