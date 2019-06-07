package barestoque.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    public FabricaConexao fabrica;
    
    public ClienteDAO(){
        fabrica = new FabricaConexao();
    }
    
    public void inserirCliente(Cliente cliente){
        String script = "Insert into cliente (nome) values (?);";
        try (Connection conexao = fabrica.conectar()){
            
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.setString(1, cliente.getNome());
            declaracao.execute();
        } catch (Exception e) {
            System.err.println("Erro: "+e.getMessage());
        }
        
    } 
}
