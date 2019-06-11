package barestoque.DAO;

import barestoque.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VendaDAO {
    public FabricaConexao fabrica;
    
    public VendaDAO(){
        fabrica = new FabricaConexao();
    }
    
    public void inserirProduto(Venda venda){
        String script = "Insert into venda (cliente, pratos, valor) values (?, ?, ?);";
        try (Connection conexao = fabrica.conectar()){
            
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.setDouble(3, venda.getValor());
            declaracao.execute();
        } catch (Exception e){
                System.err.println("Erro: "+e.getMessage());
        }
    }
}

