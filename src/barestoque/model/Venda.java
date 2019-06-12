package barestoque.model;

import java.util.ArrayList;

public class Venda extends EntidadeBanco implements Valoravel, Quantificavel
{
    private Cliente cliente;
    private Prato prato;
    private double valor;
    private int quantidade;

    public Venda (int codigo, Cliente cliente, Prato prato, int quantidade)
    {
        super (codigo);
        this.cliente = cliente;
        this.prato = prato;
        calcularValor ();
        setQuantidade (quantidade);
    }

    public Venda ()
    {
        super (-1);
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
    
    public void calcularValor() throws IllegalArgumentException{
        this.valor = prato.getValor ()*quantidade;
    }

    public Cliente getCliente ()
    {
        return cliente;
    }

    public Prato getPrato ()
    {
        return prato;
    }

    public int getQuantidade ()
    {
        return quantidade;
    }

    public int getCodigo ()
    {
        return codigo;
    }

    public void setCliente (Cliente cliente)
    {
        this.cliente = cliente;
    }

    public void setPrato (Prato prato)
    {
        this.prato = prato;
    }

    public void setQuantidade (int quantidade) throws IllegalArgumentException
    {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        this.quantidade = quantidade;
    }

    public void setCodigo (int codigo)
    {
        this.codigo = codigo;
    }
    
    
    
}
