package barestoque.model;

import java.util.ArrayList;

public class Prato extends EntidadeBanco
{
    private ArrayList <Produto> ingredientes;
    private String nome;
    private double valor;
    
    public double lucro ()
    {
        double valorDeProducao = 0;
        for (Produto p: ingredientes)
            valorDeProducao += p.getValor();
        return valor - valorDeProducao;
    }
    
    public ArrayList<Produto> getIngredientes() 
    {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Produto> ingredientes) 
    {
        this.ingredientes = ingredientes;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getValor() 
    {
        return valor;
    }

    public void setValor(double valor) throws IllegalArgumentException
    {
        if (valor >= 0)
            this.valor = valor;
        else
            throw new IllegalArgumentException ();
    }
    
    
}
