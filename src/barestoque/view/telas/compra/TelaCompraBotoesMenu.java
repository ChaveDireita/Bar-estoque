package barestoque.view.telas.compra;

import barestoque.controller.ControladorDeTransicao;
import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaTransacao;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaCompraBotoesMenu extends SetBotoesMenu
{
    
    public TelaCompraBotoesMenu (Janela pai)
    {
        super(pai);
        
        botaoCadastrar = new JButton ("Realizar compra");
        botaoListar = new JButton ("Histórico");
        botaoVoltar = new JNegativeButton("X");
        
        botaoCadastrar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoListar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoVoltar.addActionListener(new ControladorDeTransicao(pai, this));
        
        insertMapa (botaoVoltar, 1, 2);
        insertMapa (botaoCadastrar, 0, 2);
        insertMapa (botaoListar, 1, 1);
        
        montarTela ();
    }
    
}
