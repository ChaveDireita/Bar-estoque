package barestoque.view.telas.compra;

import barestoque.view.Janela;

public class TelaCompraLista extends TelaCompra
{ 

    public TelaCompraLista(Janela pai) {
        super(pai);
        
        painelSuporte.add(new ListaCompra());
        
        montarTela();
    }

    
    
    
}

