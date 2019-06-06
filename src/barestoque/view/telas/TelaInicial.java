package barestoque.view.telas;

import barestoque.view.InicializadorLookAndFeel;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JPanel;

public class TelaInicial extends JPanel
{
    private JComponent[] mapa = {new JPanel (), new JPanel (), new JPanel (),               new JPanel (),               new JPanel (),                new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),               new JPanel (),               new JPanel (),                new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JButton ("Clique Aqui"), new JButton ("Outro Botão"), new JButton ("Último Botão"), new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),               new JPanel (),               new JPanel (),                new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),               new JPanel (),               new JPanel (),                new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),               new JPanel (),               new JPanel (),                new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),};
    public TelaInicial ()
    {
        GridLayout gl = new GridLayout (6, 10, 8, 8);
        
        setLayout (gl);
        for (JComponent c : mapa)
            add (c);
        JButton botaoPositivo = new JButton ("Confirmar");
        botaoPositivo.setBackground (InicializadorLookAndFeel.BOTAO_POSITIVO);
        JButton botaoNegativo = new JButton ("Sair");
        botaoNegativo.setBackground (InicializadorLookAndFeel.BOTAO_NEGATIVO);
    }
    
    
    
}
