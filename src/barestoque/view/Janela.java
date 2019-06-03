package barestoque.view;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Color;

import javax.swing.JFrame;

public class Janela extends JFrame
{
//    private Dimension tamanhoDaTela;
    private GraphicsDevice dispositivoGrafico;
    
    public Janela (String titulo)
    {
        super (titulo);
        
//        tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
//        int larguraDaTela = tamanhoDaTela.width;
//        int alturaDaTela = tamanhoDaTela.height;

        setUndecorated (true);
        setBackground (Color.white);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setVisible (true);
        
        dispositivoGrafico = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        dispositivoGrafico.setFullScreenWindow(this);
        
    }
}
