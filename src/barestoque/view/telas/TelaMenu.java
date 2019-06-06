package barestoque.view.telas;

import barestoque.view.componentes.JNegativeButton;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaMenu extends Tela
{
    private JButton botaoMenuProduto,
                    botaoMenuFornecedor,
                    botaoMenuPrato,
                    botaoMenuTransacao,
                    botaoCliente;
    
    private JNegativeButton botaoSair;
    
    public TelaMenu ()
    {
        GridLayout gl = new GridLayout (6, 10, 8, 8);
        setLayout (gl);
        
        botaoMenuProduto = new JButton ("Produtos");
        botaoMenuFornecedor = new JButton ("Fornecedores");
        botaoMenuPrato = new JButton ("Pratos");
        botaoMenuTransacao = new JButton ("Transações");
        botaoCliente = new JButton ("Clientes");
        botaoSair = new JNegativeButton("Sair");
        
        mapa = new JComponent[] {new JPanel (), new JPanel (), new JPanel (),    new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),    new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), botaoMenuProduto, botaoMenuPrato,     botaoMenuFornecedor, new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), botaoCliente,     botaoMenuTransacao, new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),    new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),    new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), botaoSair};
        
        for (JComponent jc : mapa)
            add (jc);
    }
}
