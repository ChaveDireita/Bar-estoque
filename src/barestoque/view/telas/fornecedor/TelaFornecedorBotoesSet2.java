package barestoque.view.telas.fornecedor;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaFornecedorBotoesSet2 extends Tela
{
    private JNegativeButton botaoSair;
    
    public TelaFornecedorBotoesSet2(Janela pai) 
    {
        super(pai);
        
        setLayout (new GridLayout(3, 5, 8, 8));
        
        botaoSair = new JNegativeButton ("Sair");
        
        //<remover>
            botaoSair.addActionListener(e -> pai.dispose());
        //</remover>
        
        mapa = new JComponent[] {new JPanel (), new JPanel (),  new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (),  new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (),  new JPanel (), new JPanel (), botaoSair};
        
        for (JComponent jc : mapa)
            add (jc);
    }
    
}
