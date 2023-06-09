package com.cesupa.estrutura_de_dados.projeto_segundo_bimestre;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner pegarInput = new Scanner(System.in);
        FactoryProduto factory = new FactoryProduto();
        StringBuilder menu = new StringBuilder();
        ListaProdutos lista = new ListaProdutos();
        menu.append("1- adicionar produto\n");
        menu.append("2- mostrar produtos em odernação crescente por preço\n");
        menu.append("3- mostrar produtos em odernação decrescente por preço\n");
        menu.append("4- mostrar produtos em odernação crescente por nome\n");
        menu.append("5- mostrar produtos em odernação decrescente por nome\n");
        menu.append("6- remover produto\n");
        menu.append("7- atualizar informações de um produto\n");
        menu.append("8 - sair do programa: ");
        boolean continuar = true;
        while(continuar){
            System.out.printf("%s", menu.toString());
            int escolha = pegarInput.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("Digite o nome do produto: ");
                    String nome = pegarInput.next();
                    System.out.printf("Digite a descrição do produto: ");
                    String descricao = pegarInput.next();
                    System.out.printf("Digite o preço do produto: ");
                    double preco = pegarInput.nextDouble();
                    System.out.printf("Digite a quantidade em estoque do produto: ");
                    int quantidade = pegarInput.nextInt();
                    lista.adicionarProduto(factory.createProduto(nome, descricao, preco, quantidade));
                    break;
                case 2:
                    lista.ordenacaoPreco();
                    System.out.println("Lista de produtos em ordem crescente por preço:");
                    System.out.printf("%s", lista.mostrarProdutos());
                    break;
                case 3:
                    lista.ordenacaoPrecoReversa();
                    System.out.println("Lista de produtos em ordem decrescente por preço:");
                    System.out.printf("%s", lista.mostrarProdutos());
                    break;
                case 4:
                    lista.ordenacaoNome();
                    System.out.println("Lista de produtos em ordem alfabética:");
                    System.out.printf("%s", lista.mostrarProdutos());
                    break;
                case 5:
                    lista.ordenacaoPrecoReversa();
                    System.out.println("Lista de produtos em ordem alfabética reversa:");
                    System.out.printf("%s", lista.mostrarProdutos());
                    break;
                case 6:
                    System.out.printf("Digite o nome do produto que você pretende remover do estoque: ");
                    String nomeRemover = pegarInput.next();
                    System.out.printf("Digite a descrição do produto que você pretende remover do estoque: ");
                    String descricaoRemover = pegarInput.next();
                    System.out.printf("Digite o nome do produto que você pretende remover do estoque: ");
                    double precoRemover = pegarInput.nextDouble();
                    System.out.printf("Digite o nome do produto que você pretende remover do estoque: ");
                    int quantidadeRemover = pegarInput.nextInt();
                    lista.removerProduto(nomeRemover, descricaoRemover, precoRemover, quantidadeRemover);
                    break;
                case 7:
                    System.out.printf("Digite o indice do produto que você deseja atualizar as informações:");
                    int indice = pegarInput.nextInt();
                    System.out.printf("Digite o novo nome do produto:");
                    String nomeNovo = pegarInput.next();
                    System.out.printf("Digite a nova descrição do produto:");
                    String descricaoNovo = pegarInput.next();
                    System.out.printf("Digite o novo preço do produto:");
                    double precoNovo = pegarInput.nextDouble();
                    System.out.printf("Digite a nova quantidade do produto:");
                    int quantidadeNovo = pegarInput.nextInt();
                    lista.atualizarProduto(indice, nomeNovo, descricaoNovo, precoNovo, quantidadeNovo);
                    break;
                case 8:
                    System.out.printf("FIM DO PROGRAMA");
                    pegarInput.close();
                    continuar = false;
                    break;
                default:
                    String erroInputEscolha = "ERRO, digite apenas números de 1 a 8";
                    System.out.println(erroInputEscolha);
                    break;
            }
        }
    }
}
