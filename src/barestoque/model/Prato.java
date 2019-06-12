package barestoque.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Prato extends EntidadeBanco implements Valoravel
{
    private Map <Produto, Integer> medidaIngredientes;
    private String nome;
    private double valor;

    public Prato (int codigo, String nome, double valor, Map <Produto, Integer> medidaIngredientes)
    {
        super (codigo);
        this.medidaIngredientes = medidaIngredientes;
        this.nome = nome;
        setValor (valor);
    }

    public Prato() {
        super(-1);
    } 
    
    public double lucro ()
    {
        double valorDeProducao = 0;
        Set <Produto> chaves = medidaIngredientes.keySet();
        for (Produto p: chaves)
            valorDeProducao += p.getValor()*medidaIngredientes.getOrDefault(p, 0);
        return valor - valorDeProducao;
    }
    
    public Map<Produto, Integer> getMedidaIngredientes() 
    {
        return medidaIngredientes;
    }

    public void setMedidaIngredientes(Map<Produto, Integer> medidaIngredientes) 
    {
        this.medidaIngredientes = medidaIngredientes;
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
        if (!validarValor (valor))
            throw new IllegalArgumentException ();
        this.valor = valor;
    }
    
    public String info()
    {
        String s = "Código: " + codigo +
                   "\n Valor: " + valor + ", lucro: " + lucro () +
                   "\n Ingredientes:";
        
        Set<Produto> chaves = medidaIngredientes.keySet ();
        
        for (Produto p : chaves)
            s += "\n" + p.getNome () + " x " + medidaIngredientes.getOrDefault (p, 0);
        
        return s;
    }
    
    @Override
    public String toString ()
    {
        return nome;
    }
}
