package barestoque.view.telas.venda;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.TelaTransacao;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaVendaBotoesMenu extends SetBotoesMenu
{
    
    private JButton botaoVender,
                    botaoHistorico;
    
    private JNegativeButton botaoVoltar;
    
    public TelaVendaBotoesMenu (Janela pai)
    {
        super(pai);
        
        botaoVender = new JButton ("Realizar Venda");
        botaoHistorico = new JButton ("Histórico de vendas");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaTransacao (pai)));
        //</remover>
        
        insertMapa (botaoVoltar, 1, 4);
        insertMapa (botaoVender, 2, 4);
        insertMapa (botaoHistorico, 1, 3);
        
        montarTela ();
    }
    
}
