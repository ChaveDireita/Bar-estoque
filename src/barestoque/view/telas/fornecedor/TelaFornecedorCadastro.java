package barestoque.view.telas.fornecedor;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.componentes.SetBotoesApenasSair;
import barestoque.view.telas.Tela;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaFornecedorCadastro extends Tela
{
    private JPanel painelSuporte;
    
    public TelaFornecedorCadastro (Janela pai) 
    {
        super(pai, 2, 2);
        setLayout (new GridLayout (2, 2, 8, 8));
        
        painelSuporte = new JPanel ();
        painelSuporte.setLayout(new GridBagLayout());
        //painelSuporte.setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        painelSuporte.add(new CadastroFornecedor());
        
        insertMapa(new TelaFornecedorBotoesMenu (pai), 0, 0);
        insertMapa(painelSuporte, 0, 1);
        insertMapa(new SetBotoesApenasSair(pai), 1, 1);
        
        montarTela();
        
    }
}
