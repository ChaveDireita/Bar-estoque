package barestoque.model;

public class Transacao extends EntidadeBanco implements Valoravel
{
    protected double valor;

    public Transacao (int codigo, double valor)
    {
        super (codigo);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
