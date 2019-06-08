package barestoque.model;

public class Produto extends EntidadeBanco
{
    private String nome;
    private double valor;
    private Categoria categoria;
    private int quantidade;
    private String unidade;
    private Fornecedor fornecedor;


    public Produto(String nome, double valor, int codigo, Categoria categoria, int quantidade, String unidade, Fornecedor fornecedor) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.fornecedor = fornecedor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Categoria getCategoria ()
    {
        return categoria;
    }

    public void setCategoria (Categoria categoria)
    {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor ()
    {
        return fornecedor;
    }

    public void setFornecedor (Fornecedor fornecedor)
    {
        this.fornecedor = fornecedor;
    }
    
    
}

