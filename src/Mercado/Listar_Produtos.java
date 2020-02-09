package Mercado;

import static Mercado.Main.gerencia;

class Listar_Produtos
{
    static void listar_produtos()
    {
        int j;
        if(Main.produtos1.size()==0)
        {
            System.out.print("\nNenhum produto no estoque.\n\n");
            gerencia();
        }
        else
        {
            for(j=0;j<Main.i;j++)
            {
                System.out.print("\nProduto: " + Main.produtos1.get(j).nome+
                        "\nQuantidade: " + Main.produtos1.get(j).Quantidade +
                        "\n");
                if (Main.produtos1.get(j).novopreco!=0)
                {
                    System.out.print("Em promocao!" +
                            "\n"+ "De "+ Main.produtos1.get(j).preco+ " Por " + Main.produtos1.get(j).novopreco+"\n");
                }
                else
                {
                    System.out.print("Preco: " + Main.produtos1.get(j).preco+"\n");
                }
            }
        }
    }
}
