package barestoque.DAO;

import barestoque.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FornecedorDAO extends ClasseDAO <Fornecedor>{
    
    public FornecedorDAO(){
        super ("fornecedor", new String[] {"codigo", "nome", "telefone", "CNPJ"});
    }
    
    public void inserirFornecedor(Fornecedor fornecedor){
        String script = "Insert into fornecedor (nome, telefone, cnpj) values (?, ?, ?);";
        try (Connection conexao = fabrica.conectar()){
            
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.setString(1, fornecedor.getNome());
            declaracao.setString(2, fornecedor.getTelefone());
            declaracao.setString(3, fornecedor.getCnpj());
            declaracao.execute();
        } catch (Exception e) {
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
    public ArrayList<Fornecedor> listaDeFornecedores ()
    {
        return selectAllFrom();
    }
    
    public void deletarFornecedor (Fornecedor fornecedor)
    {
        deleteFromWhereCodigo(fornecedor.getCodigo());
    }
    
    public void deletarFornecedor (int codigo)
    {
        deleteFromWhereCodigo(codigo);
    }
    
    @Override
    protected Fornecedor montarObjeto(ResultSet resultado) throws SQLException 
    {
        String nome = resultado.getString("nome"),
               telefone = resultado.getString("telefone"),
               cnpj = resultado.getString("cnpj");
        
        int codigo = resultado.getInt("codigo");
        return new Fornecedor (codigo, nome, telefone, cnpj);
    }

    @Override
    protected Object[] desmontarObjeto(Fornecedor fornecedor) 
    {
        Object[] o = new Object[3];
        o[0] = fornecedor.getNome();
        o[1] = fornecedor.getTelefone();
        o[2] = fornecedor.getCnpj();
        
        return o;
    }
    
    public Object[] desmontarParaLista (Fornecedor fornecedor)
    {
        Object[] o = new Object[4];
        o[0] = fornecedor.getCodigo();
        o[1] = fornecedor.getNome();
        o[2] = fornecedor.getTelefone();
        o[3] = fornecedor.getCnpj();
        
        return o;
    }
    
}
