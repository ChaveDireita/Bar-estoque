package barestoque.model;

public class Cliente extends EntidadeBanco{

    private String nome;
    
    public Cliente(int codigo, String nome) {
        super (codigo);
        this.nome = nome;     
    }

    public Cliente() 
    {
        super(-1);
    }
    
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
