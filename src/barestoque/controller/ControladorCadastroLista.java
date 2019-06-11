package barestoque.controller;

import barestoque.DAO.FornecedorDAO;
import barestoque.model.Fornecedor;
import barestoque.view.Janela;
import barestoque.view.telas.fornecedor.CadastroFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class ControladorCadastroLista implements ActionListener, KeyListener
{
    private Janela pai;
    private JPanel contexto;

    public ControladorCadastroLista(Janela pai, JPanel contexto) 
    {
        this.pai = pai;
        this.contexto = contexto;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (contexto instanceof CadastroFornecedor)
            eventoCadastroFornecedor ((CadastroFornecedor) contexto, e);
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
    
    public void eventoCadastroFornecedor (CadastroFornecedor cFornecedor, ActionEvent e)
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
        }
    }
}
