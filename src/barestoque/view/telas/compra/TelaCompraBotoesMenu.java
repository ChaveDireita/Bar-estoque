package barestoque.view.telas.compra;

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
        botaoListar = new JButton ("Histórico de compras");
        
        //<remover>
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaCompraCadastro(pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaTransacao (pai)));
        //</remover>
        
        insertMapa (botaoVoltar, 1, 2);
        insertMapa (botaoCadastrar, 0, 2);
        insertMapa (botaoListar, 1, 1);
        
        montarTela ();
    }
    
}
