package barestoque.DAO;

import barestoque.model.Prato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PratoDAO extends ClasseDAO<Prato>{
    
    public PratoDAO(){
        super("prato", new String[] {"codigo", "nome", "valor"});
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

    @Override
    protected Prato montarObjeto(ResultSet resultado) throws SQLException 
    {
        int codigo = resultado.getInt("codigo");
        String nome = resultado.getString("nome");
        double valor = resultado.getDouble("valor");
        
        return new Prato (codigo, nome, valor);
    }

    @Override
    protected Object[] desmontarObjeto(Prato prato) 
    {
        Object[] o =  new Object[2];
        o[0] = prato.getNome();
        o[1] = prato.getValor();
        
        return o;
    }
    
    
    
}

