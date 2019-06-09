package barestoque.view.telas.compra;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaTransacao;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaCompraBotoesMenu extends SetBotoesMenu
{
    
    private JButton botaoComprar,
                    botaoHistorico;
    
    public TelaCompraBotoesMenu (Janela pai)
    {
        super(pai);
        
        botaoComprar = new JButton ("Realizar compra");
        botaoHistorico = new JButton ("Histórico de compras");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaTransacao (pai)));
        //</remover>
        
        insertMapa (botaoVoltar, 1, 2);
        insertMapa (botaoComprar, 0, 2);
        insertMapa (botaoHistorico, 1, 1);
        
        montarTela ();
    }
    
}
