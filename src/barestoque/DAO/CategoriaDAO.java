package barestoque.DAO;

import barestoque.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CategoriaDAO {
    public FabricaConexao fabrica;
    
    public CategoriaDAO(){
        fabrica = new FabricaConexao();
    }
    
    public void inserirCategoria(Categoria categoria){
        String script = "Insert into categoria (nome) values(?);";
        try(Connection conexao = fabrica.conectar()){
            
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.setString(1, categoria.getNome());
            declaracao.execute();
        }catch(Exception e){
            System.err.println("Erro: "+e.getMessage());
        }
        
    }
}
