package barestoque.DAO;

import barestoque.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public Cliente getClienteDeCodigo (int codigo)
    {
        ArrayList <Cliente> carray = selectFromWhere("codigo = " + codigo);
        if (carray.isEmpty())
            return null;
        return carray.get(0);
    }
    
    public ArrayList <Cliente> listaDeClientes ()
    {
        return selectAllFrom();
    }
    
    public void deletarCliente (Cliente cliente)
    {
        deleteFromWhereCodigo(cliente.getCodigo());
    }
    
    public void deletarCliente (int codigo)
    {
        deleteFromWhereCodigo(codigo);
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
    
    public Object[] desmontarParaLista (Cliente cliente)
    {
        Object[] o = new Object[2];
        o[0] = cliente.getCodigo();
        o[1] = cliente.getNome ();
        
        return o;
    }
}
