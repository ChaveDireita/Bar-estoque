package barestoque.DAO;

import barestoque.model.Cliente;
import barestoque.model.Prato;
import barestoque.model.Produto;
import barestoque.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class VendaDAO extends ClasseDAO<Venda>{
    
    public VendaDAO(){
        super ("venda", new String[] {"codigo", "codigo_prato", "codigo_cliente", "quantidade", "valor"});
    }
    
    public void inserirVenda(Venda venda){
        insertInto (venda);
        
        Map<Produto, Integer> medidas = venda.getPrato ().getMedidaIngredientes ();
        Set <Produto> chaves = medidas.keySet ();
        
        for (Produto p : chaves)
        {
            int valor = medidas.get (p);
            new ProdutoDAO ().removerQuantidade (p.getCodigo (), valor);
        }
        
    }

    public ArrayList <Venda> listaDeVendas ()
    {
        return selectAllFrom ();
    }
    
    @Override
    protected Venda montarObjeto (ResultSet resultado) throws SQLException
    {
        int codigo = resultado.getInt ("codigo"),
            quantidade = resultado.getInt ("quantidade"),
            codigo_prato = resultado.getInt ("codigo_prato"),
            codigo_cliente = resultado.getInt ("codigo_cliente");
            
        
        double valor = resultado.getDouble ("valor");
        
        Prato p = new PratoDAO ().getPratoDeCodigo (codigo_prato);
        Cliente c = new ClienteDAO ().getClienteDeCodigo (codigo);
        
        return new Venda (codigo, c, p, quantidade);
        
    }
    
    @Override
    protected Object[] desmontarObjeto (Venda venda)
    {
        Object[] o = new Object[4];
        o[0] = venda.getPrato ().getCodigo ();
        o[1] = venda.getCliente ().getCodigo ();
        o[2] = venda.getQuantidade ();
        o[3] = venda.getValor ();
        
        
        
        return o;
    }
    
    public Object[] desmontarParaLista (Venda venda)
    {
        Object[] o = new Object[5];
        o[0] = venda.getCodigo ();
        o[1] = venda.getCliente ().getNome ();
        o[2] = venda.getPrato ().getNome ();
        o[3] = venda.getQuantidade ();
        venda.calcularValor ();
        o[4] = venda.getValor ();
        
        return o;
    }
}

