package barestoque.view.telas.cardapio;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaCardapioBotoesMenu extends SetBotoesMenu
{
    private JButton botaoReceitas,
                    botaoAdicionar;
    
    public TelaCardapioBotoesMenu(Janela pai)
    {
        super(pai);
        
        botaoReceitas = new JButton("Receitas");
        botaoAdicionar = new JButton("Adicionar Prato");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoVoltar, 0, 3);
        insertMapa(botaoAdicionar, 1, 3);
        insertMapa(botaoReceitas, 0, 2);
        
        montarTela();
        
    }
    
}
