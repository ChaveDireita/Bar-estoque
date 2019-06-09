package barestoque.view.componentes;

import barestoque.view.Janela;
import javax.swing.JButton;

public class SetBotoesMenu extends SetBotoes
{
    protected JButton botaoCadastrar,
                      botaoListar;
    
    protected JNegativeButton botaoVoltar;
    
    public SetBotoesMenu(Janela pai) 
    {
        super(pai);
        
        botaoCadastrar = new JButton ("Cadastrar");
        botaoListar = new JButton ("Listar");
        botaoVoltar = new JNegativeButton("X");
    }
    
}
