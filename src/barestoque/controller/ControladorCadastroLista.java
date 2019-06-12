package barestoque.controller;

import barestoque.DAO.CategoriaDAO;
import barestoque.DAO.ClienteDAO;
import barestoque.DAO.CompraDAO;
import barestoque.DAO.FornecedorDAO;
import barestoque.DAO.PratoDAO;
import barestoque.DAO.ProdutoDAO;
import barestoque.DAO.VendaDAO;
import barestoque.model.Categoria;
import barestoque.model.Cliente;
import barestoque.model.Compra;
import barestoque.model.Fornecedor;
import barestoque.model.Prato;
import barestoque.model.Produto;
import barestoque.model.Venda;
import barestoque.view.Janela;
import barestoque.view.telas.cardapio.CadastroCardapio;
import barestoque.view.telas.cardapio.ListaCardapio;
import barestoque.view.telas.cliente.CadastroCliente;
import barestoque.view.telas.cliente.ListaCliente;
import barestoque.view.telas.compra.CadastroCompra;
import barestoque.view.telas.fornecedor.CadastroFornecedor;
import barestoque.view.telas.fornecedor.ListaFornecedor;
import barestoque.view.telas.produto.CadastroProduto;
import barestoque.view.telas.produto.ListaProduto;
import barestoque.view.telas.venda.CadastroVenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ControladorCadastroLista implements ActionListener, KeyListener, ChangeListener
{
    private JPanel contexto;
    
    
    public ControladorCadastroLista(JPanel contexto) 
    {
        this.contexto = contexto;
    }
    
    //<editor-fold desc="Funções listeners">
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (contexto instanceof CadastroFornecedor)
            eventoCadastroFornecedor ((CadastroFornecedor) contexto, e);
        else if (contexto instanceof ListaFornecedor)
            eventoListaFornecedor((ListaFornecedor) contexto, e);
        else if (contexto instanceof CadastroProduto)
            eventoCadastroProduto((CadastroProduto) contexto, e);
        else if (contexto instanceof ListaProduto)
            eventoListaProduto((ListaProduto) contexto, e);
        else if (contexto instanceof CadastroCompra)
            eventoCadastroCompra((CadastroCompra) contexto, e);
        else if (contexto instanceof CadastroCliente)
            eventoCadastroCliente ((CadastroCliente) contexto, e);
        else if (contexto instanceof CadastroCardapio)
            eventoCadastroCardapio ((CadastroCardapio) contexto, e);
        else if (contexto instanceof ListaCardapio)
            eventoListaCardapio ((ListaCardapio) contexto, e);
        else if (contexto instanceof CadastroVenda)
            eventoCadastroVenda ((CadastroVenda) contexto, e);
    }
    
    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
        if (contexto instanceof CadastroCompra)
            eventoChangeCadastroCompra ((CadastroCompra) contexto, e);
        else if (contexto instanceof CadastroCardapio)
            eventoChangeCadastroCardapio ((CadastroCardapio) contexto, e);
        else if (contexto instanceof CadastroVenda)
            eventoChangeCadastroVenda ((CadastroVenda) contexto, e);
    }
    
    
    //</editor-fold>
    
    //<editor-fold desc="Eventos por painel">
    //<editor-fold desc="Fornecedor">
    private void eventoCadastroFornecedor (CadastroFornecedor cFornecedor, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == cFornecedor.getBotaoAdd())
        {
            String nome = cFornecedor.getCampoNome().getText(),
                   telefone = cFornecedor.getCampoTelefone().getText(),
                   cnpj = cFornecedor.getCampoCNPJ().getText();
            
            if (!new Fornecedor ().validarTelefone(telefone))
            {
                cFornecedor.getMsgErro().setText("Erro: Telefone inválido");
                return;
            } else if (!new Fornecedor ().validarCnpj(cnpj))
            {
                cFornecedor.getMsgErro().setText("Erro: CNPJ inválido");
                return;
            }
            
            Fornecedor f = new Fornecedor ();
            f.setNome(nome);
            f.setTelefone(telefone);
            f.setCnpj(cnpj);
            
            FornecedorDAO fdao = new FornecedorDAO();
            fdao.inserirFornecedor(f);
            
            cFornecedor.limparDados();
            cFornecedor.getMsgErro().setText("");
            
        } else if (src == cFornecedor.getBotaoLimpar())
        {
            cFornecedor.limparDados();
        }
    }
    
    private void eventoListaFornecedor (ListaFornecedor lFornecedor, ActionEvent e)
    {
        Object src = e.getSource();    
    }
    //</editor-fold>
    
    //<editor-fold desc="Cliente">
    private void eventoCadastroCliente (CadastroCliente cCliente, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == cCliente.getBotaoAdd())
        {
            String nome = cCliente.getCampoNome().getText();
            
            Cliente c = new Cliente ();
            c.setNome(nome);
            
            ClienteDAO cdao = new ClienteDAO();
            cdao.inserirCliente(c);
            
            cCliente.limparDados();
        } else if (src == cCliente.getBotaoLimpar())
        {
            cCliente.limparDados();
        }
    }
    
    private void eventoListaCliente (ListaCliente lCliente, ActionEvent e)
    {
        Object src = e.getSource();  
    }
    //</editor-fold>

    //<editor-fold desc="Produto">
    private void eventoCadastroProduto (CadastroProduto cProduto, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == cProduto.getBotaoAdd())
        {
            String nome = cProduto.getCampoNome().getText(),
                   unidade = cProduto.getCampoUnidade().getText(),
                   categoria = cProduto.getCampoCategoria().getText();
            
            double valor = -1;
            
            try
            {
                valor = Double.parseDouble(cProduto.getCampoValor().getText());
            } catch (NumberFormatException nfe) 
            {
                cProduto.getMsgErro().setText("Erro: Valor inválido.");
                return;
            }
            
            if (!new Produto ().validarValor(valor))
            {
                cProduto.getMsgErro().setText("Erro: Valor inválido.");
                return;
            }
            
            Produto p = new Produto();
            p.setNome(nome);
            p.setUnidade(unidade);
            p.setValor(valor);
            
            p.setFornecedor((Fornecedor) cProduto.getComboBoxFornecedor().getSelectedItem());
            p.setCategoria(new CategoriaDAO().getCategoriaDeNome(categoria));
            
            ProdutoDAO pdao = new ProdutoDAO();
            pdao.inserirProduto(p);
            
            cProduto.limparDados();
            cProduto.getMsgErro().setText("");
            
        } else if (src == cProduto.getBotaoLimpar())
        {
            cProduto.limparDados();
        } else if (src == cProduto.getComboBoxCategoria())
        {
            Categoria c = (Categoria) cProduto.getComboBoxCategoria().getSelectedItem();
            cProduto.getCampoCategoria().setText(c.getNome());
        }
    }
    
    
    private void eventoListaProduto (ListaProduto lProduto, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == lProduto.getComboBoxCategoria())
            lProduto.atualizar();
    }
    //</editor-fold>
    
    //<editor-fold desc="Compra">
    private void eventoCadastroCompra (CadastroCompra cCompra, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == cCompra.getBotaoAdd())
        {
            Produto produto = (Produto) cCompra.getComboBoxProduto().getSelectedItem();
            
            int quantidade = (Integer) cCompra.getSpinnerQuantidade().getValue();
            
            Compra c = new Compra ();
            c.setProduto(produto);
            c.setQuantidade(quantidade);
            c.gerarValor();
            
            CompraDAO cdao = new CompraDAO();
            cdao.inserirCompra(c);
            
            cCompra.limparDados();
            cCompra.getMsgErro().setText("");
            
        } else if (src == cCompra.getBotaoLimpar())
        {
            cCompra.limparDados();
        } else if (src == cCompra.getComboBoxProduto())
        {
            cCompra.atualizarPreco();
        }
    }
    
    private void eventoChangeCadastroCompra (CadastroCompra cCompra, ChangeEvent e)
    {
        Object src = e.getSource ();
        if (src == cCompra.getSpinnerQuantidade ())
        {
            cCompra.atualizarPreco ();
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="Cardápio">
    private void eventoCadastroCardapio (CadastroCardapio cCardapio, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == cCardapio.getBotaoAdd())
        {
            String nome = cCardapio.getCampoNome().getText();
            double valor = -1;
            
            try
            {
                valor = Double.parseDouble(cCardapio.getCampoPreco().getText());
            } catch (NumberFormatException nfe)
            {
                cCardapio.getMsgErro().setText("Erro: Preço não é um número");
                return;
            }
            if (!new Prato().validarValor(valor))
            {
                cCardapio.getMsgErro().setText("Erro: Preço inválido");
                return;
            }
            
            Prato p = new Prato();
            p.setNome(nome);
            p.setValor(valor);
            p.setMedidaIngredientes(cCardapio.getQuantidades());
            
            PratoDAO pdao = new PratoDAO();
            pdao.inserirPrato(p);
            
            cCardapio.limparDados();
            cCardapio.getMsgErro().setText("");
            
        } else if (src == cCardapio.getBotaoLimpar())
        {
            cCardapio.limparDados();
        } else if (src == cCardapio.getComboBoxIngrediente())
        {
            Produto p = (Produto) cCardapio.getComboBoxIngrediente().getSelectedItem();
            int spinnerValor = cCardapio.getQuantidades().getOrDefault (p, 0);
            cCardapio.getSpinnerQuantidade().setValue(spinnerValor);
        }
    }
    
    public void eventoChangeCadastroCardapio (CadastroCardapio cCardapio, ChangeEvent e)
    {
        Object src = e.getSource ();
        if (src == cCardapio.getSpinnerQuantidade ())
        {
            Produto p = (Produto) cCardapio.getComboBoxIngrediente().getSelectedItem();
            int spinnerValor = (Integer) cCardapio.getSpinnerQuantidade ().getValue ();
            cCardapio.getQuantidades ().put (p, spinnerValor);
        }
    }
    
    private void eventoListaCardapio (ListaCardapio lCardapio, ActionEvent e)
    {
        Object src = e.getSource ();
        
        if (src == lCardapio.getComboBoxItem ())
        {
            Prato p = (Prato) lCardapio.getComboBoxItem ().getSelectedItem ();
            lCardapio.getEditorPaneFormula ().setText (p.info ());
        }
            
    }
    //</editor-fold>
    
    
    //<editor-fold desc="Venda">
    private void eventoCadastroVenda (CadastroVenda cVenda, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == cVenda.getComboBoxPrato ())
        {
            cVenda.atualizarPreco ();
        } else if (src == cVenda.getBotaoLimpar ())
        {
            cVenda.limparDados ();
        } else if (src == cVenda.getBotaoAdd ())
        {
            Cliente cliente = (Cliente) cVenda.getComboBoxCliente ().getSelectedItem ();
            Prato prato = (Prato) cVenda.getComboBoxPrato ().getSelectedItem ();

            int quantidade = (Integer) cVenda.getSpinnerQuantidade ().getValue ();
            double valor = (Double) prato.getValor ();

            double preco = valor * quantidade;

            Venda v = new Venda ();

            v.setCliente (cliente);
            v.setPrato (prato);
            v.setQuantidade (quantidade);
            v.calcularValor ();
            
            if (!v.checarViabilidade ())
            {
                cVenda.getMsgErro ().setText ("Erro: quantidade de produtos insuficiente");
                return;
            }
            VendaDAO vdao = new VendaDAO ();
            vdao.inserirVenda (v);

            cVenda.limparDados ();
        }
        
    }
    
    private void eventoChangeCadastroVenda (CadastroVenda cVenda, ChangeEvent e)
    {
        Object src = e.getSource();
        
        if (src == cVenda.getSpinnerQuantidade ())
        {
            cVenda.atualizarPreco ();
        }
            
    }
    //</editor-fold>
    
    //</editor-fold>
}
