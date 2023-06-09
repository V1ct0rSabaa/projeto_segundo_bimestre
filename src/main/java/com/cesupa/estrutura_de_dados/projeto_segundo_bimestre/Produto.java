package com.cesupa.estrutura_de_dados.projeto_segundo_bimestre;

public class Produto implements Comparable<Produto>{
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    // construtor
    public Produto(String nome, String descricao, double preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        StringBuilder texto_final = new StringBuilder();
        texto_final.append("nome: " + nome);
        texto_final.append(" - preco: " + String.valueOf(preco));
        texto_final.append(" - quantidade em estoque: " + String.valueOf(quantidade));
        texto_final.append("\ndescricao: " + descricao);
        return texto_final.toString();
    }
    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdescricao() {
        return descricao.toString();
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantity) {
        this.quantidade = quantity;
    }

    @Override
    public int compareTo(Produto p1){
        return this.getNome().compareToIgnoreCase(p1.getNome());
    }
}
