package barestoque.DAO;

import barestoque.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
    
}
