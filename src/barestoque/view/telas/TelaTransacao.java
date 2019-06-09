package barestoque.view.telas;

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
        
        
        //<remover>
            botaoVender.addActionListener(e -> pai.setCena(new TelaVenda (pai)));
            botaoComprar.addActionListener(e -> pai.setCena(new TelaCompra (pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaMenu (pai)));
            botaoSair.addActionListener(e -> pai.dispose());
        //</remover>
        
        insertMapa(botaoVoltar, 1, 3);
        insertMapa(botaoComprar, 1, 2);
        insertMapa(botaoVender, 1, 4);
        insertMapa (botaoSair, 5, 9);
        
        montarTela();
    }
    
}
