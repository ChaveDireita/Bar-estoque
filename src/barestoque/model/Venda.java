package barestoque.model;

import java.util.ArrayList;

public class Venda extends EntidadeBanco implements Valoravel
{
    private Cliente cliente;
    private Prato pratos;
    private double valor;
    private int quantidade;
    
    public Venda(int codigo, Prato prato, int quantidade) 
    {
        super (codigo);
        this.pratos = prato;
        double valor = 0;
        
        setValor (valor);
    }

    public Prato getPrato()
    {
        return pratos;
    }

    public void setPrato(Prato prato)
    {
        this.pratos = prato;
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
