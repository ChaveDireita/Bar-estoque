package barestoque.view.telas.cardapio;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaCardapioBotoesMenu extends Tela
{
    private JButton botaoReceitas,
                    botaoAdicionar;
    
    private JNegativeButton botaoVoltar;
    
    public TelaCardapioBotoesMenu(Janela pai)
    {
        super(pai, 3, 5);
        setLayout (new GridLayout (3, 5, 8, 8));
        
        botaoReceitas = new JButton("Receitas");
        botaoAdicionar = new JButton("Adicionar Prato");
        
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoVoltar, 0, 3);
        insertMapa(botaoAdicionar, 1, 3);
        insertMapa(botaoReceitas, 0, 2);
        
        montarTela();
        
    }
    
}
