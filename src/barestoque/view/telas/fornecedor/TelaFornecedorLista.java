package barestoque.view.telas.fornecedor;

import barestoque.view.Janela;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TelaFornecedorLista extends Tela
{

    public TelaFornecedorLista(Janela pai) 
    {
        super(pai);
        
        setLayout (new GridLayout (2, 2, 8, 8));
        
        
        
        mapa = new JComponent[] {new TelaFornecedorBotoesSet1 (pai),                     new JTable (),
                                                      new JPanel (), new TelaFornecedorBotoesSet2(pai)};
    }
    
}
