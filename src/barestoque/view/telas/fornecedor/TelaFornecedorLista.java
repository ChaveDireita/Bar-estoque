package barestoque.view.telas.fornecedor;

import barestoque.view.Janela;

public class TelaFornecedorLista extends TelaFornecedor
{ 
    public TelaFornecedorLista(Janela pai) 
    {
        super(pai);
        
        painelSuporte.add(new ListaFornecedor());
    }
    
}
