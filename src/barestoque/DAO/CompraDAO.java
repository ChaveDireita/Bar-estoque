package barestoque.DAO;

import barestoque.model.Compra;
import barestoque.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompraDAO extends ClasseDAO<Compra>
{
    public CompraDAO(){
        super ("compra", new String[] {"codigo", "codigo_produto", "quantidade", "valor"});
    }

    public void inserirCompra(Compra compra){
        insertInto(compra);
        new ProdutoDAO().adicionarQuantidade(compra.getProduto().getCodigo(), compra.getQuantidade());
    }
    
    public ArrayList <Compra> listaDeCompras ()
    {
        return selectAllFrom();
    }
    
    @Override
    protected Compra montarObjeto(ResultSet resultado) throws SQLException 
    {
        int codigo = resultado.getInt("codigo"),
            quantidade = resultado.getInt("quantidade"),
            codigo_produto = resultado.getInt("codigo_produto");
        
        Produto p = new ProdutoDAO().getProdutoDeCodigo(codigo_produto);
        
        resultado.getDouble("valor");
        
        Compra c = new Compra(codigo, p, quantidade);
        
        return c;
    }

    @Override
    protected Object[] desmontarObjeto(Compra compra)
    {
        Object[] o = new Object[3];
        o[0] = compra.getProduto().getCodigo();
        o[1] = compra.getQuantidade();
        o[2] = compra.getValor();
        
        return o;
    }
    
    public Object[] desmontarParaLista (Compra c)
    {
        Object[] o = new Object[4];
        o[0] = c.getCodigo();
        o[1] = c.getProduto().getNome();
        o[2] = c.getQuantidade();
        o[3] = c.getValor();
        
        return o;
    }
}