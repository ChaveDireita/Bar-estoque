package barestoque.controller;

import barestoque.DAO.CategoriaDAO;
import barestoque.DAO.ClienteDAO;
import barestoque.DAO.FornecedorDAO;
import barestoque.DAO.ProdutoDAO;
import barestoque.model.Categoria;
import barestoque.model.Cliente;
import barestoque.model.Fornecedor;
import barestoque.model.Produto;
import barestoque.view.Janela;
import barestoque.view.telas.cliente.CadastroCliente;
import barestoque.view.telas.cliente.ListaCliente;
import barestoque.view.telas.fornecedor.CadastroFornecedor;
import barestoque.view.telas.fornecedor.ListaFornecedor;
import barestoque.view.telas.produto.CadastroProduto;
import barestoque.view.telas.produto.ListaProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class ControladorCadastroLista implements ActionListener, KeyListener
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
        
        if (src == lFornecedor.getBotaoDeletar())
        {
            try
            {
                int linha = lFornecedor.getTabelaFornecedor().getSelectedRow();
                int codigo = (Integer) lFornecedor.getTabelaFornecedor().getValueAt(linha, 0);
                
                FornecedorDAO fdao = new FornecedorDAO();
                fdao.deletarFornecedor(codigo);
                
                lFornecedor.atualizar();
            } catch (NullPointerException ne)
            {
                return;
            }
        }    
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
        
        if (src == lCliente.getBotaoDeletar())
        {
            try
            {
                int linha = lCliente.getTabelaCliente().getSelectedRow();
                int codigo = (Integer) lCliente.getTabelaCliente().getValueAt(linha, 0);
                
                ClienteDAO cdao = new ClienteDAO();
                cdao.deletarCliente(codigo);
            } catch (NullPointerException ne)
            {
                return;
            }
            
            lCliente.atualizar(); 
        }  
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
        }
    }
    
    private void eventolistaProduto (ListaProduto lProduto, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == lProduto.getBotaoDeletar())
        {
            
        }
    }
    //</editor-fold>
    //</editor-fold>
}
