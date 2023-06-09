package com.cesupa.estrutura_de_dados.projeto_segundo_bimestre;

import java.util.Comparator;
// https://www.youtube.com/watch?v=wViUmn3YFoE
public class AlfabeticComparator implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
    
}
