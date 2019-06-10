
package barestoque.view.telas;

import barestoque.controller.ControladorDeTransicao;
import barestoque.view.Janela;
import barestoque.view.componentes.*;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JPanel;


public class TelaInicial extends Tela
{
    private JButton botaoSair,
                    botaoIniciar;
    
    public TelaInicial (Janela pai)
    {
        super (pai, 6, 10);
        GridLayout gl = new GridLayout (6, 10, 8, 8);
        setLayout (gl);
        
        botaoIniciar = new JPositiveButton ("Iniciar");
        botaoSair = new JNegativeButton ("Sair");
        
        botaoSair.addActionListener(new ControladorDeTransicao(pai, this));
        botaoIniciar.addActionListener(new ControladorDeTransicao(pai, this));
        
        insertMapa(botaoIniciar, 2, 3);
        insertMapa(botaoSair, 5, 9);
        
        montarTela();
    }

    public JButton getBotaoSair() 
    {
        return botaoSair;
    }

    public JButton getBotaoIniciar() 
    {
        return botaoIniciar;
    }
    
    
    
}
