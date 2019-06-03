package barestoque.view;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Janela extends JFrame
{
    private Dimension tamanhoDaTela;
    private GraphicsDevice dispositivoGrafico;
    
    private boolean telaCheia;
    
    public Janela (String titulo, int largura, int altura)
    {
        super (titulo);
        
        tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraDaTela = tamanhoDaTela.width;
        int alturaDaTela = tamanhoDaTela.height;
        
        dispositivoGrafico = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        setSize (largura, altura);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setVisible (true);
        setLocation ((larguraDaTela - largura)/2, (alturaDaTela - altura)/2);
    }
    
    public void setTelaCheia (boolean telaCheia)
    {
        //setVisible (false);
        setUndecorated (telaCheia);
        if (telaCheia)
            dispositivoGrafico.setFullScreenWindow(this);
        else 
            dispositivoGrafico.setFullScreenWindow(null);
        //setVisible (true);
        this.telaCheia = telaCheia;
    }
    
    public boolean estaEmTelaCheia ()
    {
        return telaCheia;
    }
    
}
