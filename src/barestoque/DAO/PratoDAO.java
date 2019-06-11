package barestoque.DAO;

import barestoque.model.Prato;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PratoDAO {
    public FabricaConexao fabrica;
    
    public PratoDAO(){
        fabrica = new FabricaConexao();
    }
    
    public void inserirPrato(Prato prato){
        String script = "Insert into prato (nome, valor, ingredientes) values (?, ?, ?);";
        try (Connection conexao = fabrica.conectar()){
            
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.setString(1, prato.getNome());
            declaracao.setDouble(2, prato.getValor());
            declaracao.execute();
        } catch (Exception e){
                System.err.println("Erro: "+e.getMessage());
        }
    }
}

