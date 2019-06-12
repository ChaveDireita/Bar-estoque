package barestoque.model;

public abstract class EntidadeBanco
{
    protected int codigo;

    public EntidadeBanco (int codigo)
    {
        this.codigo = codigo;
    }
    
    public int getCodigo ()
    {
        return codigo;
    }

    public void setCodigo (int codigo)
    {
        this.codigo = codigo;
    }
    
    
}
