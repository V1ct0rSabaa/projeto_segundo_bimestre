package com.cesupa.estrutura_de_dados.projeto_segundo_bimestre;

public class FactoryProduto {
    public Produto createProduto(String name, String description, double price, int quantity){
        return new Produto(name, description, price, quantity);
    }
}
