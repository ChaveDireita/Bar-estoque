package barestoque.DAO;

import barestoque.model.EntidadeBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ClasseDAO <T extends EntidadeBanco>
{
    protected FabricaConexao fabrica;
    protected String tabela;
    protected String[] colunas;
    protected int lastId;
    
    public ClasseDAO (String tabela, String[] colunas)
    {
        fabrica = new FabricaConexao ();
        this.tabela = tabela;
        this.colunas = colunas;
    }
    
    protected abstract T montarObjeto (ResultSet resultado) throws SQLException;
    
    protected abstract Object[] desmontarObjeto (T objeto);
    
    protected void insertInto (T objeto)
    {
        Object[] values = desmontarObjeto (objeto);
        String colunaLista = "";
        String script = "Insert into " + tabela + "(";
        
        for (int i = 1; i < colunas.length - 1; i++)
            script += (colunas[i] + ", ");
        script += (colunas[colunas.length - 1] + ") values (");
        
        for (int i = 1; i < colunas.length - 1; i++)
            script += "?, ";
        script += "?);";
        try (Connection conexao = fabrica.conectar())
        {
            PreparedStatement declaracao = conexao.prepareStatement(script);
            for (int i = 0; i < values.length; i++)
            {
                Object valor = values[i];
                
                if (valor instanceof Integer)
                    declaracao.setInt (i + 1, (Integer) valor);
                else if (valor instanceof Double)
                    declaracao.setDouble (i + 1, (Double) valor);
                else if (valor instanceof String)
                    declaracao.setString (i + 1, (String) valor);
            }
            declaracao.executeUpdate ();
            declaracao = conexao.prepareStatement ("select LAST_INSERT_ID ();");
            ResultSet rs = declaracao.executeQuery ();
            rs.next ();
            lastId = rs.getInt (1);
        } catch (Exception e)
        {
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
    protected ArrayList <T> selectFromWhere (String[] colunas, String condicao)
    {
        ArrayList <T> entidadesFiltradas = new ArrayList <T>();
        
        String script = "Select ";
        String colunaLista = "";
        for (int i = 0; i < colunas.length - 1; i++)
            colunaLista += colunas[i] + ", ";
        colunaLista += colunas[colunas.length - 1];
        if (condicao != null)
            script += (colunaLista + " from " + tabela + " where " + condicao + ";");
        else
            script += (colunaLista + " from " + tabela + ";");
        
        try (Connection conexao = fabrica.conectar())
        {
            PreparedStatement declaracao = conexao.prepareStatement(script);
            ResultSet resultado = declaracao.executeQuery ();
            while (resultado.next ())
                entidadesFiltradas.add (montarObjeto (resultado));
        } catch (Exception e)
        {
            e.printStackTrace ();
        }
        
        return entidadesFiltradas;
    }
    
    protected ArrayList <T> selectFromWhere (String condicao)
    {
        return selectFromWhere (colunas, condicao);
    }
    
    protected ArrayList <T> selectAllFrom ()
    {
        return selectFromWhere (colunas, null);
    }
    
    protected void deleteFromWhere (String condicao)
    {
        String script = "Delete from " + tabela + " where " + condicao + ";";
        try (Connection conexao = fabrica.conectar())
        {
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.executeUpdate ();
        } catch (Exception e)
        {
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
    protected void deleteFromWhereCodigo (int codigo)
    {
        deleteFromWhere ("codigo = " + codigo);
    }
    
    protected void updateSet (String[] colunas, Object[] valores, String condicao)
    {
        String script = "Update " + tabela + " set ";
        
        for (int i = 0; i < colunas.length - 1; i++)
            script += (colunas[i] + "=" + valores[i] + ", ");
        script += (colunas[colunas.length - 1] + "=" + valores[colunas.length - 1] + " where " + condicao + ";");
        
        try (Connection conexao = fabrica.conectar())
        {
            PreparedStatement declaracao = conexao.prepareStatement(script);
            declaracao.executeUpdate ();
        } catch (Exception e)
        {
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
}
