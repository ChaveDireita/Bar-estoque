package barestoque.model;

public class Cliente extends EntidadeBanco{
    
    //Atributos
    private String nome;
    
    //Construtor
    public Cliente(int codigo, String nome) {
        super (codigo);
        this.nome = nome;     
    }

    public Cliente() 
    {
        super(-1);
    }
    
    //Métodos Acessores e Modificadoress
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString ()
    {
        return nome;
    }
}
