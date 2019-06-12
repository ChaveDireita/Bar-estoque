package barestoque.model;

public class Fornecedor extends EntidadeBanco{
    
    //Atributos
    private String nome;
    private String telefone;
    private String cnpj;
    
    //Construtor
    public Fornecedor(int codigo, String nome, String telefone, String cnpj) {    
        super (codigo);
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public Fornecedor() 
    {
        super(-1);
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

    public void setTelefone(String telefone) throws IllegalArgumentException {
        if (!validarTelefone (telefone))
            throw new IllegalArgumentException ();
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws IllegalArgumentException{
        if (!validarCnpj (cnpj))
            throw new IllegalArgumentException ();
        this.cnpj = cnpj;
    }
    
    public boolean validarTelefone (String telefone)
    {
        return telefone.matches ("[0-9]{4,5}[-][0-9]{4}");
    }
    
    public boolean validarCnpj (String cnpj)
    {
        return cnpj.matches ("[0-9]{2}([.][0-9]{3}){2}[/][0-9]{4}[-][0-9]{2}");
    }
    
    @Override
    public String toString ()
    {
        return nome;
    }
}
