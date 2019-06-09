package barestoque.view.telas.venda;

import barestoque.view.Janela;
import barestoque.view.componentes.SetBotoesApenasSair;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;

public class TelaVenda extends Tela
{

    public TelaVenda (Janela pai)
    {
        super (pai, 2, 2);
        setLayout (new GridLayout (2, 2, 8, 8));
        
        insertMapa (new SetBotoesApenasSair (pai), 1, 1);
        insertMapa (new TelaVendaBotoesMenu (pai), 0, 0);
                
        montarTela ();
    }
    
}
