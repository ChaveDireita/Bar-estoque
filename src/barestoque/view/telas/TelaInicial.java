
package barestoque.view.telas;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.componentes.*;

import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JPanel;


public class TelaInicial extends Tela
{
    private JButton botaoSair,
                    botaoIniciar;
    
    public TelaInicial (Janela pai)
    {
        super (pai);
        GridLayout gl = new GridLayout (6, 10, 8, 8);
        setLayout (gl);
        
        botaoIniciar = new JPositiveButton ("Iniciar");
        botaoSair = new JNegativeButton ("Sair");
        
        //<remover>
            botaoSair.addActionListener(e -> pai.dispose());
            botaoIniciar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
        //</remover>
        
        mapa = new JComponent[] {new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),    botaoIniciar,   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), botaoSair};
        
        for (JComponent jc : mapa)
            add (jc);
    }
    
    
    
}
