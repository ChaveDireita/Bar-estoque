/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barestoque.view.telas.fornecedor;

import barestoque.controller.CadastroListenerTemp;
import barestoque.view.Janela;
import barestoque.view.componentes.JNegativeButton;
import barestoque.view.componentes.JPositiveButton;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author nolas
 */
public class TelaFornecedorCadastroBotoesSet2 extends Tela
{
    private JNegativeButton botaoSair,
                            botaoLimpar;
    private JPositiveButton botaoAdicionar;
    

    public TelaFornecedorCadastroBotoesSet2(Janela pai, CadastroListenerTemp cadastro) {
        super(pai);
        
        setLayout (new GridLayout(3, 5, 8, 8));
        
        botaoSair = new JNegativeButton ("Sair");
        botaoLimpar = new JNegativeButton ("Limpar dados");
        botaoAdicionar = new JPositiveButton ("Adcionar");
        
        //<remover>
            botaoSair.addActionListener(e -> pai.dispose());
            botaoAdicionar.addActionListener (cadastro);
        //</remover>
        
        mapa = new JComponent[] {new JPanel (), new JPanel (),  new JPanel (), botaoAdicionar,   botaoLimpar,
                                 new JPanel (), new JPanel (),  new JPanel (),  new JPanel (), new JPanel (),
                                 new JPanel (), new JPanel (),  new JPanel (),  new JPanel (), botaoSair};
        
        for (JComponent jc : mapa)
            add (jc);
    }
    
}
