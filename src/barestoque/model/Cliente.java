package barestoque.model;

public class Cliente {
    
    //Atributos
    private int codigo;
    private String nome;
    
    //Construtor
    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;     
    }
    
    
    //Métodos Acessores e Modificadoress
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
