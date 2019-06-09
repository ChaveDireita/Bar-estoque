package barestoque.view.telas.compra;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaTransacao;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaCompraBotoesMenu extends Tela
{
    
    private JButton botaoComprar,
                    botaoHistorico;
    
    private JNegativeButton botaoVoltar;
    
    public TelaCompraBotoesMenu (Janela pai)
    {
        super(pai, 3, 5);
        setLayout (new GridLayout (3, 5, 8, 8));
        
        botaoComprar = new JButton ("Realizar compra");
        botaoHistorico = new JButton ("Histórico de compras");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaTransacao (pai)));
        //</remover>
        
        insertMapa (botaoVoltar, 1, 2);
        insertMapa (botaoComprar, 0, 2);
        insertMapa (botaoHistorico, 1, 1);
        
        montarTela ();
    }
    
}
