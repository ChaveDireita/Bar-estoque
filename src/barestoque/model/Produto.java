package barestoque.model;

import java.util.Date;

public class Produto 
{
    private String nome;
    private double valor;
    private int codigo;
   // private Categoria categoria;
    private String quantidade;
    private String unidade;
    private Date validade;
   // private Fornecedor fornecedor;

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

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
            
    public Produto ()
    {
    }
    /*public boolean vencido(){
        return false;
    }
            */
    
}

