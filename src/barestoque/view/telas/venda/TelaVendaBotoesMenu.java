package barestoque.view.telas.venda;

import barestoque.controller.ControladorDeTransicao;
import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.TelaTransacao;
import javax.swing.JButton;

public class TelaVendaBotoesMenu extends SetBotoesMenu
{ 
    public TelaVendaBotoesMenu (Janela pai)
    {
        super(pai);
        
        botaoCadastrar = new JButton ("Realizar Venda");
        botaoListar = new JButton ("Histórico de vendas");
        botaoVoltar = new JNegativeButton("X");
        
        botaoCadastrar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoListar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoVoltar.addActionListener(new ControladorDeTransicao(pai, this));
        
        insertMapa (botaoVoltar, 1, 4);
        insertMapa (botaoCadastrar, 2, 4);
        insertMapa (botaoListar, 1, 3);
        
        montarTela ();
    }
    
}
