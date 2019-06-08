package barestoque.view.componentes;

import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class SetBotoesApenasSair extends Tela
{
    private JNegativeButton botaoSair;
    
    public SetBotoesApenasSair(Janela pai) 
    {
        super(pai, 3, 5);
        
        setLayout (new GridLayout(3, 5, 8, 8));
        
        botaoSair = new JNegativeButton ("Sair");
        
        //<remover>
            botaoSair.addActionListener(e -> pai.dispose());
        //</remover>
        
        insertMapa(botaoSair, 2, 4);
        
        montarTela();
    }
    
}
