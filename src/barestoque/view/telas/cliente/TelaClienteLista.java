package barestoque.view.telas.cliente;

import barestoque.view.Janela;

public class TelaClienteLista extends TelaCliente
{ 

    public TelaClienteLista(Janela pai) {
        super(pai);
        
        painelSuporte.add(new ListaCliente());
        
        montarTela();
                         
    }
    
    
}
