package barestoque.view.telas.venda;

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
        
        //<remover>
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaVendaCadastro(pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaTransacao (pai)));
        //</remover>
        
        insertMapa (botaoVoltar, 1, 4);
        insertMapa (botaoCadastrar, 2, 4);
        insertMapa (botaoListar, 1, 3);
        
        montarTela ();
    }
    
}
