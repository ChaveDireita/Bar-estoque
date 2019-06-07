package barestoque.view.telas.fornecedor;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
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
        super(pai);
        setLayout (new GridLayout (2, 2, 8, 8));
        
        painelSuporte = new JPanel ();
        painelSuporte.setLayout(new GridBagLayout());
        painelSuporte.setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        painelSuporte.add(new CadastroFornecedor());
        
        mapa = new JComponent[] {new TelaFornecedorBotoesSet1 (pai),            painelSuporte,
                                                      new JPanel (), new TelaFornecedorCadastroBotoesSet2(pai)};
        
        for (JComponent jc : mapa)
            add (jc);
        
    }
}
