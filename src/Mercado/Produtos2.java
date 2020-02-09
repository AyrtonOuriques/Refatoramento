package Mercado;

import java.util.Scanner;

class Produtos2
{
    private static Scanner obj = new Scanner(System.in);
    static void adicionar_produto_existente(int j)
    {
        System.out.print("\nDigite a quantidade para adicionar do produto:\n\n");
        System.out.print("\nQuantidade disponivel:"+ Main.produtos1.get(j).Quantidade+"\n\n");
        Main.produtos1.get(j).Quantidade= Main.produtos1.get(j).Quantidade + Erros.erros1();
        System.out.print("\nProduto adicionado.\n\n");
    }
    static void remover_produto_existente(int j)
    {
        System.out.print("\nDigite a quantidade do produto a ser removida:\n\n");
        System.out.print("\nQuantidade disponivel:"+ Main.produtos1.get(j).Quantidade+"\n\n");
        Main.produtos1.get(j).Quantidade= Main.produtos1.get(j).Quantidade - Erros.erros1();
        if(Main.produtos1.get(j).Quantidade<0)
        {
            Main.produtos1.get(j).Quantidade=0;
        }
        System.out.print("\nProduto removido.\n\n");
    }
    static void deletar_produto(int j)
    {
        Main.produtos1.remove(j);
        Main.i--;
        System.out.print("\nProduto removido.\n\n");
    }
    static void mudar_preco_existente(int j)
    {
        System.out.print("\nDigite o novo preco:\n\n");
        System.out.print("\nPreco atual:"+ Main.produtos1.get(j).preco+"\n\n");
        Main.produtos1.get(j).preco=Erros.erros2();
        System.out.print("\nProduto modificado.\n\n");
    }
    static void adicionar_produto()
    {
        Produtos objeto= new Produtos();
        System.out.print("\nDigite o nome do produto:\n\n");
        Main.produtos1.add(objeto);
        Main.produtos1.get(Main.i).nome=obj.nextLine().toLowerCase();
        System.out.print("\nDigite a quantidade do produto:\n\n");
        Main.produtos1.get(Main.i).Quantidade=Erros.erros1();
        System.out.print("\nDigite o preco do produto:\n\n");
        Main.produtos1.get(Main.i).preco=Erros.erros2();
        Main.i++;
        System.out.print("\nProduto adicionado.\n\n");
    }
}
