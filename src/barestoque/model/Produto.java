package barestoque.model;

import java.util.Date;

public class Produto 
{
    private String nome;
    private double valor;
    private int codigo;
    private Categoria categoria;
    private int quantidade;
    private String unidade;
    private Date validade;
    private Fornecedor fornecedor;


    public Produto(String nome, double valor, int codigo, Categoria categoria, int quantidade, String unidade, Date validade, Fornecedor fornecedor) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.validade = validade;
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

    public int getCodigo() {
        return codigo;
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
            
    
    
    /*public boolean vencido(){
        return false;
    }
            */
}

