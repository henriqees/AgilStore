package com.agilstore;

import com.agilstore.dominio.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorDoTeclado = new Scanner(System.in);
        String nomeProduto;
        String categoria;
        int quantidade;
        double preco;
        int id;
        List <Produto> listaDeProdutos = new ArrayList<>();
        int opcaoMenu=0;
        int idParaSerAtualizado;
        String campoParaSerAtualizado;

        do{
        System.out.println("-----------------------------------------------------------");
        System.out.println("Bem vindo ao AgilStore!");
        System.out.println("Espero que você esteja bem!");
        System.out.println("Para podermos te ajudar escolha uma opção do nosso menu:");
        System.out.println("1.  Adicionar Produto");
        System.out.println("2.  Listar Produtos");
        System.out.println("3.  Atualizar Produto");
        System.out.println("4. Excluir Produto");
        System.out.println("5. Buscar Produto");
        System.out.println("9. Sair do app");

            System.out.println("------------------------------------------------------------");
        opcaoMenu = leitorDoTeclado.nextInt();

        switch (opcaoMenu) {
            case 1:

                System.out.println("Digite o nome do produto: ");
                nomeProduto = leitorDoTeclado.next();
                System.out.println("Digite a categoria: ");
                categoria = leitorDoTeclado.next();
                System.out.println("Digite a quantidade desejada: ");
                quantidade = leitorDoTeclado.nextInt();
                System.out.println(" Digite o preço do produto: ");
                preco = leitorDoTeclado.nextDouble();
                System.out.println("Digite o Id: ");
                id = leitorDoTeclado.nextInt();
                Produto produto1 = new Produto(nomeProduto, categoria, quantidade, preco, id);
                listaDeProdutos.add(produto1);
                break;
            case 2:
                if (listaDeProdutos.size()==0) {
                    System.out.println("Não existem produtos cadastrados!");
                } else {
                    for (Produto produto : listaDeProdutos) {
                        System.out.println(produto);
                    }
                }
                break;
            case 3:
                if (listaDeProdutos.size()==0) {
                    System.out.println("Não existem produtos cadastrados!");
                }else{
                System.out.println("Qual id do produto você deseja atualizar? ");
               idParaSerAtualizado = leitorDoTeclado.nextInt();

                    for (Produto produto : listaDeProdutos) {
                        if (produto.getId() == idParaSerAtualizado) {
                            System.out.println("Qual campo você deseja atualizar?");
                            System.out.println("Voce deve informar um dos seguintes campos: Nome, Categoria, Quantidade, Preço");

                            campoParaSerAtualizado = leitorDoTeclado.next();
                            if (campoParaSerAtualizado.equals("Nome")) {
                                System.out.println("Digite o nome a ser atualizado: ");
                                produto.setNomeProduto(leitorDoTeclado.next());
                            } else if (campoParaSerAtualizado.equals("Categoria")) {
                                System.out.println("Digite a categoria a ser atualizada: ");
                                produto.setCategoria(leitorDoTeclado.next());
                            } else if (campoParaSerAtualizado.equals("Quantidade")) {
                                System.out.println("Digite a quantidade a ser atualizada: ");
                                produto.setQuantidade(Integer.parseInt(leitorDoTeclado.next()));
                            } else if (campoParaSerAtualizado.equals("Preço")) {
                                System.out.println("Digite o preço a ser atualizado: ");
                                produto.setPreco(Integer.parseInt(leitorDoTeclado.next()));
                            }
                        } else {
                            System.out.println("ID não encontrado");
                        }
                    }
                }
                break;
            case 4:
                if (listaDeProdutos.size()==0) {
                    System.out.println("Não existem produtos cadastrados!");
                } else {
                    System.out.println("Digite o id do Produto que você deseja remover: ");
                    idParaSerAtualizado = leitorDoTeclado.nextInt();
                    for (Produto produto : listaDeProdutos) {
                        if (produto.getId() == idParaSerAtualizado) {
                            listaDeProdutos.remove(produto);
                        } else {
                            System.out.println("Id não existe!");
                        }
                    }
                }
                break;
            case 5:
                if (listaDeProdutos.size()==0) {
                    System.out.println("Não existem produtos cadastrados!");
                }else {
                    System.out.println("Digite o Id do produto que você deseja buscar");
                    idParaSerAtualizado = leitorDoTeclado.nextInt();
                    for (Produto produto : listaDeProdutos) {
                        if (produto.getId() == idParaSerAtualizado) {
                            System.out.println(listaDeProdutos);
                        } else {
                            System.out.println("Id não encontrado!");
                        }
                    }
                }
                break;
        }
        }
        while (opcaoMenu != 9);


    }
}