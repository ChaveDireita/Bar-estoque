package barestoque.view.telas;

import barestoque.controller.ControladorDeTransicao;
import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.compra.TelaCompra;
import barestoque.view.telas.venda.TelaVenda;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaTransacao extends Tela
{
    
    private JButton botaoComprar,
                    botaoVender;
    
    private JNegativeButton botaoVoltar,
                            botaoSair;
    
    public TelaTransacao(Janela pai) 
    {
        super (pai, 6, 10);
        setLayout (new GridLayout (6, 10, 8, 8));
        
        botaoComprar = new JButton("Compras");
        botaoVender = new JButton("Vendas");
        botaoVoltar = new JNegativeButton("X");
        botaoSair = new JNegativeButton ("Sair");
        
        
        botaoVender.addActionListener(new ControladorDeTransicao(pai, this));
        botaoComprar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoVoltar.addActionListener(new ControladorDeTransicao(pai, this));
        botaoSair.addActionListener(new ControladorDeTransicao(pai, this));
        
        insertMapa(botaoVoltar, 1, 3);
        insertMapa(botaoComprar, 1, 2);
        insertMapa(botaoVender, 1, 4);
        insertMapa (botaoSair, 5, 9);
        
        montarTela();
    }

    public JButton getBotaoComprar()
    {
        return botaoComprar;
    }

    public JButton getBotaoVender()
    {
        return botaoVender;
    }

    public JNegativeButton getBotaoVoltar() 
    {
        return botaoVoltar;
    }

    public JNegativeButton getBotaoSair()
    {
        return botaoSair;
    }
    
    
}
