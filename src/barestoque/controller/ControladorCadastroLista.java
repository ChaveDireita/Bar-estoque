package barestoque.controller;

import barestoque.DAO.FornecedorDAO;
import barestoque.model.Fornecedor;
import barestoque.view.Janela;
import barestoque.view.telas.fornecedor.CadastroFornecedor;
import barestoque.view.telas.fornecedor.ListaFornecedor;
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
            String nome = cFornecedor.getCampoFornecedorNome().getText(),
                   telefone = cFornecedor.getCampoFornecedorTelefone().getText(),
                   cnpj = cFornecedor.getCampoFornecedorCNPJ().getText();
            
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
            
            limparDadosCadastroFornecedor(cFornecedor);
        } else if (src == cFornecedor.getBotaoLimpar())
        {
            limparDadosCadastroFornecedor(cFornecedor);
        }
    }
    
    private void eventoListaFornecedor (ListaFornecedor lFornecedor, ActionEvent e)
    {
        Object src = e.getSource();
        
        if (src == lFornecedor.getBotaoDeletar())
        {
            int linha = lFornecedor.getTabelaFornecedor().getSelectedRow();
            int codigo = (Integer) lFornecedor.getTabelaFornecedor().getValueAt(linha, 0);
            
            FornecedorDAO fdao = new FornecedorDAO();
        }    
    }
    
    private void limparDadosCadastroFornecedor (CadastroFornecedor cFornecedor)
    {
        cFornecedor.getCampoFornecedorNome().setText("");
        cFornecedor.getCampoFornecedorTelefone().setText("");
        cFornecedor.getCampoFornecedorCNPJ().setText("");
    }
    //</editor-fold>
    //</editor-fold>
}
