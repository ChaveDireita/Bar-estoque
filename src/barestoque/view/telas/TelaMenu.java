package barestoque.view.telas;

import barestoque.view.telas.fornecedor.TelaFornecedor;
import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.telas.cardapio.TelaCardapio;
import barestoque.view.telas.cliente.TelaCliente;
import barestoque.view.telas.produto.TelaProduto;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaMenu extends Tela
{
    private JButton botaoMenuProduto,
                    botaoMenuFornecedor,
                    botaoMenuPrato,
                    botaoMenuTransacao,
                    botaoConfigurar,
                    botaoMenuCliente;
    
    private JNegativeButton botaoSair,
                            botaoVoltar;
    
    public TelaMenu (Janela pai)
    {
        super (pai, 6, 10);
        setLayout (new GridLayout (6, 10, 8, 8));
        
        botaoMenuProduto = new JButton ("Produtos");
        botaoMenuFornecedor = new JButton ("Fornecedores");
        botaoMenuPrato = new JButton ("Cardápio");
        botaoMenuTransacao = new JButton ("Transações");
        botaoMenuCliente = new JButton ("Clientes");
        botaoConfigurar = new JButton ("Configurações");
        botaoSair = new JNegativeButton("Sair");
        botaoVoltar = new JNegativeButton ("X");
        
        //<remover>
            botaoMenuPrato.addActionListener(e -> pai.setCena(new TelaCardapio(pai)));
            botaoMenuTransacao.addActionListener(e -> pai.setCena(new TelaTransacao(pai)));
            botaoMenuCliente.addActionListener(e -> pai.setCena(new TelaCliente(pai)));
            botaoMenuProduto.addActionListener(e -> pai.setCena(new TelaProduto (pai)));
            botaoMenuFornecedor.addActionListener(e -> pai.setCena(new TelaFornecedor (pai)));
            botaoVoltar.addActionListener(e -> pai.setCena(new TelaInicial (pai)));
            botaoSair.addActionListener(e -> pai.dispose ());
        //</remover>
        
        insertMapa(botaoMenuCliente, 1, 2);
        insertMapa(botaoMenuTransacao, 1, 3);
        insertMapa(botaoMenuFornecedor, 2, 2);
        insertMapa(botaoVoltar, 2, 3);
        insertMapa(botaoConfigurar, 2, 4);
        insertMapa(botaoMenuProduto, 3, 2);
        insertMapa(botaoMenuPrato, 3, 3);
        insertMapa(botaoSair, 5, 9);
        
        montarTela();
    }

    public JButton getBotaoMenuProduto()
    {
        return botaoMenuProduto;
    }

    public JButton getBotaoMenuFornecedor() 
    {
        return botaoMenuFornecedor;
    }

    public JButton getBotaoMenuPrato()
    {
        return botaoMenuPrato;
    }

    public JButton getBotaoMenuTransacao() 
    {
        return botaoMenuTransacao;
    }

    public JButton getBotaoConfigurar() 
    {
        return botaoConfigurar;
    }

    public JButton getBotaoMenuCliente()
    {
        return botaoMenuCliente;
    }

    public JNegativeButton getBotaoSair() 
    {
        return botaoSair;
    }

    public JNegativeButton getBotaoVoltar() 
    {
        return botaoVoltar;
    }
    
    
}
