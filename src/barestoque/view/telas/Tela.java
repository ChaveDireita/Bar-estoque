package barestoque.view.telas;

import barestoque.view.Janela;
import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class Tela extends JPanel
{
    protected JComponent[] mapa;
    protected Janela pai;
    
    public Tela (Janela pai)
    {
        this.pai = pai;
    }
}
