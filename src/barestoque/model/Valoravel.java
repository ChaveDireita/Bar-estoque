package barestoque.model;

public interface Valoravel
{
    default boolean validarValor (double valor)
    {
        return valor > 0;
    }
}
