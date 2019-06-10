package barestoque.view.telas.fornecedor;

import barestoque.controller.ControladorDeTransicao;
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
        
        botaoCadastrar = new JButton ("Cadastrar");
        botaoListar = new JButton ("Listar");
        botaoVoltar = new JNegativeButton("X");
        
        botaoVoltar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoCadastrar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoListar.addActionListener(new ControladorDeTransicao(pai, this));
        
        insertMapa(botaoCadastrar, 1, 2);
        insertMapa(botaoListar, 2, 1);
        insertMapa(botaoVoltar, 2, 2);
        
         montarTela();
    }
    
}
