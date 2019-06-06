
package barestoque.view.telas;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.componentes.*;

import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JPanel;


public class TelaInicial extends JPanel
{
    private JButton botaoSair,
                    botaoIniciar, 
                    botaoConfigurar;
    
    private JComponent[] mapa;
    
    public TelaInicial ()
    {
        GridLayout gl = new GridLayout (6, 10, 8, 8);
        setLayout (gl);
        
        botaoIniciar = new JPositiveButton ("Iniciar");
        botaoConfigurar = new JButton ("Configurar");
        botaoSair = new JNegativeButton ("Sair");
        
        mapa = new JComponent[] {new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),    botaoIniciar, botaoConfigurar, new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),   new JPanel (),   new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (), botaoSair};
        
        for (JComponent jc : mapa)
            add (jc);
    }
    
    
    
}
