package barestoque.view.telas;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaTransacao extends Tela
{
    
    private JButton botaoComprar,
                    botaoVender;
    
    private JNegativeButton botaoVoltar;
    
    public TelaTransacao(Janela pai) 
    {
        super (pai, 6, 10);
        setLayout (new GridLayout (6, 10, 8, 8));
        
        botaoComprar = new JButton("Compras");
        botaoVender = new JButton("Vendas");
        botaoVoltar = new JNegativeButton("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoVoltar, 1, 3);
        insertMapa(botaoComprar, 1, 2);
        insertMapa(botaoVender, 1, 4);
        
        montarTela();
    }
    
}
