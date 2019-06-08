package barestoque.DAO;

import barestoque.model.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CompraDAO {
    public FabricaConexao fabrica;

public void CompraDAO(){
    fabrica = new FabricaConexao();
}

public void inserirCompra(Compra compra){
    
    String script = "Insert into compra (quantidade, valor) values (?, ?);";
    try (Connection conexao = fabrica.conectar()){
        
    PreparedStatement declaracao = conexao.prepareStatement(script);
    declaracao.setInt(1, compra.getQuantidade());
    declaracao.setDouble(2, compra.getValor());
    declaracao.execute();
    }catch (Exception e){
        System.err.println("Erro: "+e.getMessage());
    } 
  }
}