package barestoque.view.telas.produto;

import barestoque.view.Janela;

public class TelaProdutoLista extends TelaProduto
{

    public TelaProdutoLista(Janela pai)
    {
        super(pai);
        
        painelSuporte.add (new ListaProduto());
    }
    
}
