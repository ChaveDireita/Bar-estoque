package barestoque.view.telas.compra;

import barestoque.view.Janela;

public class TelaCompraCadastro extends TelaCompra
{

    public TelaCompraCadastro(Janela pai) 
    {
        super(pai);
        
        painelSuporte.add(new CadastroCompra());
        
        montarTela();
    }
    
}
