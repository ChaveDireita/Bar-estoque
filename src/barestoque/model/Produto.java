package barestoque.model;

public class Produto extends EntidadeBanco implements Valoravel, Quantificavel
{
    private String nome;
    private double valor;
    private Categoria categoria;
    private int quantidade;
    private String unidade;
    private Fornecedor fornecedor;


    public Produto(int codigo, String nome, double valor, String unidade, int quantidade, Categoria categoria, Fornecedor fornecedor) {
        super (codigo);
        this.nome = nome;
        setValor (valor);
        this.categoria = categoria;
        setQuantidade (quantidade);
        this.unidade = unidade;
        this.fornecedor = fornecedor;
    }

    public Produto() {
        super(-1);
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

    public void setValor(double valor) throws IllegalArgumentException{
        if (!validarValor (valor))
            throw new IllegalArgumentException ();
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) throws IllegalArgumentException {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        this.quantidade += quantidade;
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
    
    public void adicionar (int quantidade)
    {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        this.quantidade += quantidade;
    }
    
    public void remover (int quantidade)
    {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        this.quantidade -= quantidade;
    }
    
    @Override
    public boolean validarQuantidade (int quantidade)
    {
        return quantidade > 0;
    }
}

