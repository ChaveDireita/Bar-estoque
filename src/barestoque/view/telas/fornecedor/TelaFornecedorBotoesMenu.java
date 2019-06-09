package barestoque.view.telas.fornecedor;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaFornecedorBotoesMenu extends SetBotoesMenu
{
    public TelaFornecedorBotoesMenu(Janela pai)
    {
        super(pai);
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaFornecedorCadastro(pai)));
            botaoListar.addActionListener(e -> pai.setCena(new TelaFornecedorLista(pai)));
        //</remover>
        
        insertMapa(botaoCadastrar, 1, 2);
        insertMapa(botaoListar, 2, 1);
        insertMapa(botaoVoltar, 2, 2);
        
         montarTela();
    }
    
}
