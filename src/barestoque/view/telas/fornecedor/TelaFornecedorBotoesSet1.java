package barestoque.view.telas.fornecedor;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaMenu;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaFornecedorBotoesSet1 extends Tela
{
    private JButton botaoCadastrar,
                    botaoListar;
    
    private JNegativeButton botaoVoltar;
    
    
    public TelaFornecedorBotoesSet1(Janela pai)
    {
        super(pai);
        
        setLayout (new GridLayout (3, 5, 8, 8));
        
        botaoCadastrar = new JButton ("Cadastrar");
        botaoListar = new JButton ("Listar");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
            botaoCadastrar.addActionListener(e -> pai.setCena(new TelaFornecedorCadastro(pai)));
        //</remover>
        
        mapa = new JComponent[] {new JPanel (), new JPanel (),  new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), botaoCadastrar, new JPanel (), new JPanel (),
                                 new JPanel (),   botaoListar,    botaoVoltar, new JPanel (), new JPanel ()};
        
         for (JComponent jc : mapa)
            add (jc);
    }
    
}
