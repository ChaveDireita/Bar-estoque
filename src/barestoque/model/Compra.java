package barestoque.model;

public class Compra extends EntidadeBanco implements Valoravel{
    
    private int codigoProduto;
    private int quantidade;
    private double valor;

    public Compra (int codigoProduto, int quantidade, double valor, int codigo)
    {
        super (codigo);
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws IllegalArgumentException
    {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws IllegalArgumentException{
        if (!validarValor (valor))
            throw new IllegalArgumentException ();
        this.valor = valor;
    }
    
    public boolean validarQuantidade (int quantidade)
    {
        return quantidade > 0;
    }
}
