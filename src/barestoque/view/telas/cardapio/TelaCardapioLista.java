package barestoque.view.telas.cardapio;

import barestoque.view.Janela;

public class TelaCardapioLista extends TelaCardapio
{

    public TelaCardapioLista(Janela pai) 
    {
        super(pai);
        
        painelSuporte.add(new ListaCardapio());
        
        montarTela();
    }
    
}
