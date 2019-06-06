package barestoque.view;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JPanel;

import javax.swing.JFrame;

public class Janela extends JFrame
{
    private JPanel cena;
    private Dimension tamanhoDaTela;
    private GraphicsDevice dispositivoGrafico;
    private int largura,
                altura;
    
    private boolean telaCheia;
    
    public Janela (String titulo, int largura, int altura, boolean telaCheia)
    {
        super (titulo);
        this.largura = largura;
        this.altura = altura;
        this.telaCheia = telaCheia;
        
        tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        dispositivoGrafico = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        setSize (largura, altura);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable (false);
        
    }
    
    public void aparecer ()
    {
        if (telaCheia)
        {
            setUndecorated (true);
            dispositivoGrafico.setFullScreenWindow(this);
        } else
            setLocation ((tamanhoDaTela.width - largura)/2, (tamanhoDaTela.height - altura)/2);
        setVisible (true);
    }
    
    public void atualizar ()
    {
        validate ();
        repaint ();
    }

    public JPanel getCena() 
    {
        return cena;
    }

    public void setCena(JPanel cena)
    {
        if (this.cena != null)
            remove (this.cena);
        this.cena = cena;
        add (this.cena);
        atualizar ();
    }
    
    
}
