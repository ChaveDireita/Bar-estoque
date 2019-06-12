package barestoque.DAO;

import barestoque.model.Cliente;
import barestoque.model.Prato;
import barestoque.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaDAO extends ClasseDAO<Venda>{
    
    public VendaDAO(){
        super ("venda", new String[] {"codigo", "codigo_prato", "codigo_cliente", "quantidade", "valor"});
    }
    
    public void inserirProduto(Venda venda){
        
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
    protected Object[] desmontarObjeto (Venda objeto)
    {
        throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

