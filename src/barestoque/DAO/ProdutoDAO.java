package barestoque.DAO;

import barestoque.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
    public FabricaConexao fabrica;
    
    public ProdutoDAO(){
        fabrica = new FabricaConexao();
    }
    
    public void inserirProduto(Produto produto){
        String script = "Insert into produto (nome, valor, unidade, quantidade) values (?, ?, ?, ?);";
        try (Connection conexao = fabrica.conectar()){
            
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.setString(1, produto.getNome());
            declaracao.setDouble(2, produto.getValor());
            declaracao.setString(3, produto.getUnidade());
            declaracao.setInt(4, produto.getQuantidade());
            declaracao.execute();
        } catch (Exception e){
                System.err.println("Erro: "+e.getMessage());
        }
    }
}

