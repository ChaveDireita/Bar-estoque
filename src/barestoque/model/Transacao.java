package barestoque.model;

public class Transacao extends EntidadeBanco
{
    protected double valor;

    public Transacao (int codigo, double valor)
    {
        super (codigo);
        this.valor = valor;
    }
}
