package com.cesupa.estrutura_de_dados.projeto_segundo_bimestre;

import java.util.Comparator;
// https://www.youtube.com/watch?v=wViUmn3YFoE
public class NumericComparator implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
       if(p1.getPreco() < p2.getPreco()){
            return -1;
        }
        else if(p1.getPreco() > p2.getPreco()){
            return 1;
        }
        return 0;
    }
}
