package barestoque.model;

public class Compra extends EntidadeBanco implements Valoravel{
    
    private Produto produto;
    private int quantidade;
    private double valor;

    public Compra (Produto produto, int quantidade, double valor, int codigo)
    {
        super (codigo);
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws IllegalArgumentException
    {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        produto.adicionar (quantidade);
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
