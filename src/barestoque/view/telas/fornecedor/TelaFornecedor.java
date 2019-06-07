package barestoque.view.telas.fornecedor;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.telas.Tela;

import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TelaFornecedor extends Tela
{
    
    public TelaFornecedor(Janela pai) 
    {
        super(pai);
        setLayout (new GridLayout (2, 2, 8, 8));
        
        mapa = new JComponent[] {new TelaFornecedorBotoesSet1 (pai),            new JPanel (),
                                                      new JPanel (), new TelaFornecedorBotoesSet2(pai)};
        
        for (JComponent jc : mapa)
            add (jc);
        
    }
    
}
