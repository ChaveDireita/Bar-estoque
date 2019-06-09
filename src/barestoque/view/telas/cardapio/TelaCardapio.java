package barestoque.view.telas.cardapio;

import barestoque.view.Janela;
import barestoque.view.componentes.SetBotoesApenasSair;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;

public class TelaCardapio extends Tela
{ 
    public TelaCardapio(Janela pai) 
    {
        super(pai, 2, 2);
        
        setLayout (new GridLayout (2, 2, 8, 8));
        
        insertMapa(painelSuporte, 0, 1);
        insertMapa(new SetBotoesApenasSair (pai), 1, 1);
        insertMapa(new TelaCardapioBotoesMenu(pai), 1, 0);
        
        montarTela();
    }
    
}
