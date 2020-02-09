# Refatoramento

Projeto de Software.

Código Original:https://github.com/AyrtonOuriques/projetoOO

1-Lazy Class

	A classe Pessoa foi excluída pois era inútil, a classe que a herdava recebeu suas variáveis.

2-Long Method

	O método gerenciar_produtos(); foi separado e colocado nas novas classes Produtos2 e Promocao.

3-Large Class

	A classe Produto foi diminuida e as funções listar_produtos(); e adicionar_produto(); foram colocadas nas classes Listar_Produtos e Produtos2 respectivamente.
