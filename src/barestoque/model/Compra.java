package barestoque.model;

public class Compra extends Transacao implements Quantificavel{
    
    private Produto produto;
    private int quantidade;
    private double valor;

    public Compra (int codigo, Produto produto, int quantidade)
    {
        super (codigo, 1);
        this.produto = produto;
        this.quantidade = quantidade;
        gerarValor();
    }

    public Compra() 
    {
        super(-1, 1);
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
        this.quantidade = quantidade;
    }

    public double getValor() {
        gerarValor();
        return valor;
    }

    public void gerarValor() throws IllegalArgumentException{
        if (!validarValor (produto.getValor()*quantidade))
            throw new IllegalArgumentException ();
        this.valor = produto.getValor()*quantidade;
    }
    
    @Override
    public boolean validarQuantidade (int quantidade)
    {
        return quantidade > 0;
    }
}
