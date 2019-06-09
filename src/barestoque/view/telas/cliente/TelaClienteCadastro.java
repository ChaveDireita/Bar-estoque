package barestoque.view.telas.cliente;

import barestoque.view.Janela;

public class TelaClienteCadastro extends TelaCliente
{

    public TelaClienteCadastro(Janela pai) 
    {
        super(pai);
        
        painelSuporte.add (new CadastroCliente());
        
        montarTela();
    }
    
}
