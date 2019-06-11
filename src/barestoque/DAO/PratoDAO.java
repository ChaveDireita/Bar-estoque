package barestoque.DAO;

import barestoque.model.Prato;
import barestoque.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PratoDAO extends ClasseDAO<Prato>{
    
    public PratoDAO(){
        super("prato", new String[] {"codigo", "nome", "valor"});
    }
    
    public void inserirPrato(Prato prato){
        insertInto(prato);
        
        try (Connection conexao = fabrica.conectar())
        {
            Set <Produto> ingredientes = prato.getMedidaIngredientes().keySet();
            for (Produto p : ingredientes){
                String script = "insert into prato_ingrediente values (" + prato.getCodigo() + ", " + p.getCodigo() + ", " + prato.getMedidaIngredientes().get((Produto) p) + ");";
                PreparedStatement declaracao = conexao.prepareStatement(script);
                declaracao.executeUpdate ();
            }
        } catch (Exception e)
        {
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
    @Override
    protected Prato montarObjeto(ResultSet resultado) throws SQLException 
    {
        int codigo = resultado.getInt("codigo");
        String nome = resultado.getString("nome");
        double valor = resultado.getDouble("valor");
        Map <Produto, Integer> medidaIngredientes = new HashMap<Produto, Integer>();
        
        
        try (Connection conexao = fabrica.conectar())
        {
            String script = "select codigo_produto, quantidade from prato_ingrediente where prato_ingrediente.codigo_prato = " + codigo + ");";
            PreparedStatement declaracao = conexao.prepareStatement(script);
            ResultSet subResultado = declaracao.executeQuery();
            while (subResultado.next())
            {
                int codigo_produto = subResultado.getInt("codigo_produto"),
                    quantidade = subResultado.getInt("quantidade") ;
                Produto p = new ProdutoDAO().getProdutoDeCodigo(codigo_produto);
                medidaIngredientes.put(p, quantidade);
            }
                
        } catch (Exception e)
        {
            System.err.println("Erro: "+e.getMessage());
        }
        
        return new Prato (codigo, nome, valor, medidaIngredientes);
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

