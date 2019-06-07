package barestoque.view.componentes;

import barestoque.view.InicializadorLookAndFeel;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class JPositiveButton extends JButton
{

    public JPositiveButton() 
    {
        setBackground (InicializadorLookAndFeel.COR_BOTAO_POSITIVO);
    }

    public JPositiveButton(Icon icon)
    {
        super(icon);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_POSITIVO);
    }

    public JPositiveButton(String text) 
    {
        super(text);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_POSITIVO);
    }

    public JPositiveButton(Action a) 
    {
        super(a);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_POSITIVO);
    }

    public JPositiveButton(String text, Icon icon) 
    {
        super(text, icon);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_POSITIVO);
    }
    
}
