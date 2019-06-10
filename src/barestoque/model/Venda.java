package barestoque.model;

import java.util.ArrayList;

public class Venda extends EntidadeBanco implements Valoravel
{
    private Cliente cliente;
    private ArrayList <Prato> pratos;
    private double valor;

    public Venda(int codigo, ArrayList<Prato> pratos) 
    {
        super (codigo);
        this.pratos = pratos;
        double valor = 0;
        for (Prato pra : pratos)
            valor += pra.getValor ();
        setValor (valor);
    }

    public ArrayList<Prato> getPratos()
    {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos)
    {
        this.pratos = pratos;
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
