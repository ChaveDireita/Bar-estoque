package barestoque.view.telas.cliente;

import barestoque.controller.ControladorDeTransicao;
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
        
        botaoCadastrar = new JButton ("Cadastrar");
        botaoListar = new JButton ("Listar");
        botaoVoltar = new JNegativeButton("X");
        
        botaoCadastrar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoListar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoVoltar.addActionListener(new ControladorDeTransicao(pai, this));
        
        insertMapa(botaoCadastrar, 1, 4);
        insertMapa(botaoListar, 2, 3);
        insertMapa(botaoVoltar, 2, 4);
        
        montarTela();
    }
    
    
}
