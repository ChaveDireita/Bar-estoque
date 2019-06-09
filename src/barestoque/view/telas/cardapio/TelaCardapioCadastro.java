package barestoque.view.telas.cardapio;

import barestoque.view.Janela;

public class TelaCardapioCadastro extends TelaCardapio
{

    public TelaCardapioCadastro(Janela pai)
    {
        super(pai);
        
        painelSuporte.add(new CadastroCardapio());
        
        montarTela();
    }
    
}
