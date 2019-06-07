package barestoque.view.telas.fornecedor;

import barestoque.controller.CadastroListenerTemp;
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
        CadastroFornecedor cf = new CadastroFornecedor ();
        painelSuporte.add(cf);
        CadastroListenerTemp clt = new CadastroListenerTemp (cf);
        mapa = new JComponent[] {new TelaFornecedorBotoesSet1 (pai),            painelSuporte,
                                                      new JPanel (), new TelaFornecedorCadastroBotoesSet2(pai, clt)};
        
        for (JComponent jc : mapa)
            add (jc);
        
    }
}
