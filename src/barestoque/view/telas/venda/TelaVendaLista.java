package barestoque.view.telas.venda;

import barestoque.view.Janela;

public class TelaVendaLista extends TelaVenda
{

    public TelaVendaLista (Janela pai)
    {
        super (pai);
        
        painelSuporte.add (new ListaVenda ());
    }
    
}
