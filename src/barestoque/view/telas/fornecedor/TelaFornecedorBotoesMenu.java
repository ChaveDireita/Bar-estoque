package barestoque.view.telas.fornecedor;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaFornecedorBotoesMenu extends Tela
{
    private JButton botaoCadastrar,
                    botaoListar;
    
    private JNegativeButton botaoVoltar;
    
    
    public TelaFornecedorBotoesMenu(Janela pai)
    {
        super(pai, 3, 5);
        
        setLayout (new GridLayout (3, 5, 8, 8));
        
        botaoCadastrar = new JButton ("Cadastrar");
        botaoListar = new JButton ("Listar");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaFornecedorCadastro(pai)));
        //</remover>
        
        insertMapa(botaoCadastrar, 1, 2);
        insertMapa(botaoListar, 2, 1);
        insertMapa(botaoVoltar, 2, 2);
        
         montarTela();
    }
    
}
