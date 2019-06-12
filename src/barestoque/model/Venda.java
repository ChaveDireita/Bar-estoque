package barestoque.model;

import java.util.ArrayList;

public class Venda extends EntidadeBanco implements Valoravel
{
    private Cliente cliente;
    private Prato prato;
    private double valor;
    
    public Venda(int codigo, Prato prato) 
    {
        super (codigo);
        this.prato = prato;
        setValor (prato.getValor ());
    }

    public Prato getPratos()
    {
        return prato;
    }

    public void setPratos(Prato pratos)
    {
        this.prato = pratos;
    }

    public double getValor() 
    {
        return valor;
    }
    
    private void setValor(double valor) throws IllegalArgumentException{
        if (!validarValor (valor))
            throw new IllegalArgumentException ();
        this.valor = valor;
    }
    
    
}
