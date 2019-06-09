package barestoque.view.telas.venda;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaTransacao;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaVendaBotoesMenu extends Tela
{
    
    private JButton botaoVender,
                    botaoHistorico;
    
    private JNegativeButton botaoVoltar;
    
    public TelaVendaBotoesMenu (Janela pai)
    {
        super(pai, 3, 5);
        setLayout (new GridLayout (3, 5, 8, 8));
        
        botaoVender = new JButton ("Realizar Venda");
        botaoHistorico = new JButton ("Histórico de vendas");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaTransacao (pai)));
        //</remover>
        
        insertMapa (botaoVoltar, 1, 4);
        insertMapa (botaoVender, 2, 4);
        insertMapa (botaoHistorico, 1, 3);
        
        montarTela ();
    }
    
}
