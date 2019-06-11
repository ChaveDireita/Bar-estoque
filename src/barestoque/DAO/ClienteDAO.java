package barestoque.DAO;

import barestoque.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO extends ClasseDAO <Cliente>{
    
    public ClienteDAO(){
        super ("cliente", new String[] {"codigo", "nome"});
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

    @Override
    protected Cliente montarObjeto(ResultSet resultado) throws SQLException 
    {
        int codigo = resultado.getInt("codigo");
        String nome = resultado.getString("nome");
        
        return new Cliente (codigo, nome);
    }

    @Override
    protected Object[] desmontarObjeto(Cliente cliente) 
    {
        Object[] o = new Object[1];
        o[0] = cliente.getNome ();
        return o;
    }
    
    
}
