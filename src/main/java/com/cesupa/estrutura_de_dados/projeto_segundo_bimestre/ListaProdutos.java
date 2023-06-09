package com.cesupa.estrutura_de_dados.projeto_segundo_bimestre;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaProdutos {
    private List<Produto> lista = new LinkedList<Produto>();
    private FactoryProduto factory = new FactoryProduto();
    NumericComparator comparatorNumerico = new NumericComparator();
    AlfabeticComparator comparatorAlfabetico = new AlfabeticComparator();

    public String mostrarProdutos(){
        StringBuilder texto = new StringBuilder();
        for(Produto p1: this.lista){ texto.append(p1.toString() + "\n");}
        return texto.toString();
    }

    public void adicionarProduto(Produto produto){
        this.lista.add(produto);
    }

    public void atualizarProduto(int index, String nome, String descricao, double preco, int quantidade){
        lista.set(index, factory.createProduto(nome, descricao, preco, quantidade));
    }

    public void removerProduto(String nome, String descricao, double preco, int quantidade){
        lista.remove(factory.createProduto(nome, descricao, preco, quantidade));
    }

    public void ordenacaoPreco(){
        Collections.sort(lista, comparatorNumerico);
        Collections.reverse(lista);
    }

    public void ordenacaoPrecoReversa(){
        Collections.sort(lista, comparatorNumerico);
        Collections.reverse(lista);
    }

    public void ordenacaoNome(){
        Collections.sort(lista, comparatorAlfabetico);
        Collections.reverse(lista);
    }

    public void ordenacaoNomeReversa(){
        Collections.sort(lista, comparatorAlfabetico);
        Collections.reverse(lista);
    }
    public int binarySearch(Produto p1){
        return Collections.binarySearch(lista, p1,comparatorAlfabetico);
    }
}
