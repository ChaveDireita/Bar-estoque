package barestoque.view.telas;

import barestoque.view.telas.fornecedor.TelaFornecedor;
import barestoque.view.Janela;
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
                    botaoMenuEstoque,
                    botaoConfigurar,
                    botaoCliente;
    
    private JNegativeButton botaoSair,
                            botaoVoltar;
    
    public TelaMenu (Janela pai)
    {
        super (pai);
        GridLayout gl = new GridLayout (6, 10, 8, 8);
        setLayout (gl);
        
        botaoMenuProduto = new JButton ("Produtos");
        botaoMenuFornecedor = new JButton ("Fornecedores");
        botaoMenuPrato = new JButton ("Cardápio");
        botaoMenuTransacao = new JButton ("Transações");
        botaoMenuEstoque = new JButton ("Estoque");
        botaoCliente = new JButton ("Clientes");
        botaoConfigurar = new JButton ("Configurações");
        botaoSair = new JNegativeButton("Sair");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoMenuFornecedor.addActionListener(e -> pai.setCena(new TelaFornecedor (pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaInicial (pai)));
            botaoSair.addActionListener(e -> pai.dispose ());
        //</remover>
        
        mapa = new JComponent[] {new JPanel (), new JPanel (), new JPanel (),       new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), botaoCliente,        botaoMenuTransacao, botaoMenuEstoque,    new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), botaoMenuFornecedor, botaoVoltar,        botaoConfigurar,     new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), botaoMenuProduto,    botaoMenuPrato,     new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),       new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (), new JPanel (),       new JPanel (),      new JPanel (),       new JPanel (), new JPanel (), new JPanel (), new JPanel (), botaoSair};
        
        for (JComponent jc : mapa)
            add (jc);
    }
}
