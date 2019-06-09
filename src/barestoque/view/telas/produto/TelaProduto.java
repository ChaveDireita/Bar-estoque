package barestoque.view.telas.produto;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.telas.Tela;
import barestoque.view.componentes.SetBotoesApenasSair;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaProduto extends Tela
{
    
    public TelaProduto(Janela pai) 
    {
        super(pai, 2, 2);
        setLayout (new GridLayout(2, 2, 8, 8));
        
        insertMapa(painelSuporte, 0, 1);
        insertMapa(new TelaProdutoBotoesMenu(pai), 1, 0);
        insertMapa(new SetBotoesApenasSair(pai), 1, 1);
        
        montarTela();
    }
}
