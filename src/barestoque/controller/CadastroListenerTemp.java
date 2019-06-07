package barestoque.controller;

import barestoque.DAO.FornecedorDAO;
import barestoque.model.Fornecedor;
import barestoque.view.telas.fornecedor.CadastroFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroListenerTemp implements ActionListener
{
    
    private CadastroFornecedor espaco;
    private FornecedorDAO fornecedorDAO;
    
    public CadastroListenerTemp (CadastroFornecedor espaco)
    {
        fornecedorDAO = new FornecedorDAO ();
        this.espaco = espaco;
    }    
    
    @Override
    public void actionPerformed (ActionEvent e)
    {
        String nome = espaco.getCampoFornecedorNome ().getText (), 
               telefone = espaco.getCampoFornecedorTelefone ().getText (), 
               CNPJ = espaco.getCampoFornecedorCNPJ ().getText ();
        
        if (!(nome.isEmpty () || telefone.isEmpty () || CNPJ.isEmpty ()))
        {    
            Fornecedor f = new Fornecedor (nome, telefone, CNPJ);
            fornecedorDAO.inserirFornecedor (f);
            limparDados ();
        }
    }
    
    private void limparDados ()
    {
        espaco.getCampoFornecedorNome ().setText ("");
        espaco.getCampoFornecedorTelefone ().setText ("");
        espaco.getCampoFornecedorCNPJ ().setText ("");
    }
    
    
    
}
