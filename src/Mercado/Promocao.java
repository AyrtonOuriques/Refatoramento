package Mercado;

class Promocao
{
    static void colocar_promocao(int j)
    {
        System.out.print("\nDigite o a porcentagem de desconto:\n\n");
        System.out.print("\nPreco atual:"+ Main.produtos1.get(j).preco+"\n\n");
        Main.produtos1.get(j).novopreco= Main.produtos1.get(j).preco * (1.0-(0.01*Erros.erros2()));
        System.out.print("\nPromocao feita.\n\n");
    }
    static void remover_promocao(int j)
    {
        if (Main.produtos1.get(j).novopreco!=0)
        {
            Main.produtos1.get(j).novopreco=0;
            System.out.print("\nProduto modificado.\n\n");
        }
        else
        {
            System.out.print("\nProduto nao esta em promocao.\n\n");
        }
    }
}
