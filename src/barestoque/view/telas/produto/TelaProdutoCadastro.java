package barestoque.view.telas.produto;

import barestoque.view.Janela;

public class TelaProdutoCadastro extends TelaProduto
{

    public TelaProdutoCadastro(Janela pai) 
    {
        super(pai);
        
        painelSuporte.add(new CadastroProduto());
        
        montarTela();
    }
    
}
