package barestoque.DAO;

import barestoque.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDAO extends ClasseDAO <Categoria>{
    
    public CategoriaDAO(){
        super("categoria", new String[] {"codigo", "nome"});
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
    
    public void inserir (Categoria c)
    {
        insertInto(c);
    }
    
    public void deletarCategoria (int codigo)
    {
        deleteFromWhereCodigo(codigo);
    }
    
    public void deletarCategoria (Categoria c)
    {
        deleteFromWhereCodigo(c.getCodigo ());
    }
    
    public void renomearCategoria (String novoNome, int codigo)
    {
        updateSet(new String[] {"nome"}, new String[] {novoNome}, "codigo = " + codigo);
    }
    
    public ArrayList <Categoria> listaDeCategorias ()
    {
        return selectAllFrom();
    }
    
    public Categoria getCategoriaDeCodigo (int codigo)
    {
        ArrayList <Categoria> categoriaArray = selectFromWhere ("codigo = " + codigo);
        if (categoriaArray.isEmpty())
            return null;
        return categoriaArray.get (0);
    }
    @Override
    protected Categoria montarObjeto(ResultSet resultado) throws SQLException
    {
        int codigo = resultado.getInt("codigo");
        String nome = resultado.getString("nome");
        
        return new Categoria (codigo, nome);
    }

    @Override
    protected Object[] desmontarObjeto(Categoria categoria) 
    {
        Object[] o = new Object[1];
        o[0] = categoria.getNome ();
        return o;
    }
    
    
}
