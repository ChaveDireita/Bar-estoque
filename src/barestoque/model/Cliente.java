package barestoque.model;

public class Cliente extends EntidadeBanco{
    
    //Atributos
    private String nome;
    
    //Construtor
    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;     
    }
    
    
    //Métodos Acessores e Modificadoress
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
