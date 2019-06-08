package barestoque.model;

public class Fornecedor extends EntidadeBanco{
    
    //Atributos
    private String nome;
    private String telefone;
    private String cnpj;
    
    //Construtor
    public Fornecedor(int codigo, String nome, String telefone, String cnpj) {    
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    //Métodos Acessores e Modificadores

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
