/**
 * EntidadeBanco.
 * 
 * A classe EntidadeBano é mãe de todas as outras classes de regra de negócio 
 * que possuem seu correlato nas tabelas do banco de dados. Por enquanto todas 
 * as classes do pacote model são filhas desta classe.
 * 
 * Ela possui apenas um campo, id, e seus acessores.
 * 
 * @author Filipe Nolasco (ChaveDireita)
*/
package barestoque.model;

public abstract class EntidadeBanco
{
    /**
     * Este campo corresponde à chave primária das entidades no banco de dados
     */
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
