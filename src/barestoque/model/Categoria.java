package barestoque.model;

public class Categoria extends EntidadeBanco
{
    private String nome;

    public Categoria (int codigo, String nome)
    {
        super (codigo);
        this.nome = nome;
    }

    public Categoria(String nome)
    {
        super(-1);
        this.nome = nome;
    }    
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}
