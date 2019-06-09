package barestoque.view.telas.produto;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaInicial;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaProdutoBotoesMenu extends SetBotoesMenu
{   
    public TelaProdutoBotoesMenu(Janela pai) 
    {
        super(pai);
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoCadastrar, 1, 2);
        insertMapa(botaoListar, 0, 1);
        insertMapa(botaoVoltar, 0, 2);
        
        montarTela();
    }
    
}
