package barestoque.view.telas.cliente;

import barestoque.view.Janela;
import barestoque.view.componentes.SetBotoesApenasSair;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;

public class TelaCliente extends Tela
{

    public TelaCliente(Janela pai) 
    {
        super(pai, 2, 2);
        setLayout (new GridLayout (2, 2, 8, 8));
        
        insertMapa(painelSuporte, 0, 1);
        insertMapa(new TelaClienteBotoesMenu(pai), 0, 0);
        insertMapa(new SetBotoesApenasSair (pai), 1, 1);
        
        montarTela ();
    }
    
}
