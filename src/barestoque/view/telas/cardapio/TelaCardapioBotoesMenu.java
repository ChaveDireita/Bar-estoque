package barestoque.view.telas.cardapio;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.SetBotoesMenu;
import barestoque.view.telas.TelaMenu;
import javax.swing.JButton;

public class TelaCardapioBotoesMenu extends SetBotoesMenu
{
    public TelaCardapioBotoesMenu(Janela pai)
    {
        super(pai);
        
        botaoListar = new JButton("Receitas");
        botaoCadastrar = new JButton("Adicionar Prato");
        botaoVoltar = new JNegativeButton("X");
        //<remover>
            botaoListar.addActionListener(e -> pai.setCena(new TelaCardapioLista(pai)));
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaCardapioCadastro(pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoVoltar, 0, 3);
        insertMapa(botaoCadastrar, 1, 3);
        insertMapa(botaoListar, 0, 2);
        
        montarTela();
        
    }
    
}
