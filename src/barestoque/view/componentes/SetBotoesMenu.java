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
    }

    public JButton getBotaoCadastrar()
    {
        return botaoCadastrar;
    }

    public JButton getBotaoListar() 
    {
        return botaoListar;
    }

    public JNegativeButton getBotaoVoltar() 
    {
        return botaoVoltar;
    }
    
    
}
