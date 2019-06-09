package barestoque.view.telas.cliente;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoes;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaClienteBotoesMenu extends SetBotoesMenu
{
    public TelaClienteBotoesMenu(Janela pai) {
        super(pai);
        
        //<remover>
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaClienteCadastro(pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoCadastrar, 0, 2);
        insertMapa(botaoListar, 1, 1);
        insertMapa(botaoVoltar, 1, 2);
        
        montarTela();
    }
    
    
}
