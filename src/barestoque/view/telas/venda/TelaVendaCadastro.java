package barestoque.view.telas.venda;

import barestoque.view.Janela;

public class TelaVendaCadastro extends TelaVenda
{

    public TelaVendaCadastro(Janela pai) 
    {
        super(pai);
        
        painelSuporte.add(new CadastroVenda());
        
        montarTela();
    }
    
}
