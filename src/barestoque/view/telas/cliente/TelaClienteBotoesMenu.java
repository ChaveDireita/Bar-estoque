package barestoque.view.telas.cliente;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaClienteBotoesMenu extends Tela
{
    private JButton botaoCadastrar,
                    botaoListar;
    
    private JNegativeButton botaoVoltar;

    public TelaClienteBotoesMenu(Janela pai) {
        super(pai, 3, 5);
        
        setLayout (new GridLayout (3, 5, 8, 8));
        
        botaoCadastrar = new JButton ("Cadastrar");
        botaoListar = new JButton ("Listar");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        insertMapa(botaoCadastrar, 0, 2);
        insertMapa(botaoListar, 1, 1);
        insertMapa(botaoVoltar, 1, 2);
        
         montarTela();
    }
    
    
}
