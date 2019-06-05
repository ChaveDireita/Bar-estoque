package barestoque.model;

import java.util.ArrayList;

public class Venda
{
    private int codigo;
    //private Cliente cliente;
    private ArrayList <Prato> pratos;
    private double valor;

    public Venda(int codigo, ArrayList<Prato> pratos) 
    {
        this.codigo = codigo;
        this.pratos = pratos;
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

    public void setValor(double valor) 
    {
        this.valor = valor;
    }

    public int getCodigo() 
    {
        return codigo;
    }
}
