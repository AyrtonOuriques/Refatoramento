package Mercado;
import java.util.Scanner;

import static Mercado.Listar_Produtos.listar_produtos;
import static Mercado.Main.gerencia;
import static Mercado.Produtos2.*;
import static Mercado.Promocao.colocar_promocao;
import static Mercado.Promocao.remover_promocao;

class Produtos
{
    int Quantidade;
    double preco;
    String nome;
    double novopreco=0.0;
    private static Scanner obj = new Scanner(System.in);
    static void gerenciar_produtos()
    {
            String ent="";
            int k;
            if (Main.produtos1.size()==0)
            {
                System.out.print("\nNenhum produto no estoque.Adicione um produto:\n\n");
                adicionar_produto();
            }
            else
            {
                System.out.print("\nEscolha uma opcao:\n\n" +
                        "1 Adicionar um novo produto\n" +
                        "\n" +
                        "2 Gerenciar produto existente\n"+
                        "\n" +
                        "3 Voltar\n\n");
                k=Erros.erros1();
                switch (k)
                {
                    case 1:
                    {
                        adicionar_produto();
                        break;
                    }
                    case 2:
                    {
                        listar_produtos();
                        System.out.print("\nDigite o nome do produto:\n\n");
                        ent=obj.nextLine().toLowerCase();
                        int j;
                        for(j=0;j<Main.i;j++)
                        {
                            while (Main.produtos1.get(j).nome.equalsIgnoreCase(ent))
                            {
                                System.out.print("\nEscolha uma opcao:\n\n" +
                                        "1 Adicionar mais do produto\n" +
                                        "\n" +
                                        "2 Remover estoque do produto\n" +
                                        "\n" +
                                        "3 Deletar produto\n" +
                                        "\n" +
                                        "4 Mudar preço do produto\n" +
                                        "\n" +
                                        "5 Colocar produto em promocao\n" +
                                        "\n" +
                                        "6 Remover produto da promocao\n" +
                                        "\n" +
                                        "7 Voltar\n" +
                                        "\n\n");
                                k=Erros.erros1();
                                switch (k)
                                {
                                    case 1:
                                    {
                                        adicionar_produto_existente(j);
                                        gerencia();
                                        break;
                                    }
                                    case 2:
                                    {
                                        remover_produto_existente(j);
                                        gerencia();
                                        break;
                                    }
                                    case 3:
                                    {
                                        deletar_produto(j);
                                        gerencia();
                                        break;
                                    }
                                    case 4:
                                    {
                                        mudar_preco_existente(j);
                                        gerencia();
                                        break;
                                    }
                                    case 5:
                                    {
                                        colocar_promocao(j);
                                        gerencia();
                                        break;
                                    }
                                    case 6:
                                    {
                                        remover_promocao(j);
                                        gerencia();
                                        break;
                                    }
                                    case 7:
                                    {
                                        gerencia();
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.print("\nOpcao invalida.\n\n");
                                        break;
                                    }
                                }
                            }
                        }
                        if (j==Main.i)
                        {
                            System.out.print("\nProduto nao encontrado.\n\n");
                        }
                        break;
                    }
                    case 3:
                    {
                        gerencia();
                        break;
                    }
                    default:
                    {
                        System.out.print("\nOpcao invalida.\n\n");
                        gerencia();
                        break;
                    }
                }
            }
    }
}

