package barestoque.model;

public class Compra extends EntidadeBanco{
    
    private Produto produto;
    private int quantidade;
    private double valor;

    public Produto getCodigoProduto() {
        return produto;
    }

    public void setCodigoProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
