package barestoque.model;

public interface Quantificavel 
{
    default boolean validarQuantidade (int quantidade)
    {
        return quantidade >= 0;
    }
}
