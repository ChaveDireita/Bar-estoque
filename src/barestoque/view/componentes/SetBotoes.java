package barestoque.view.componentes;

import barestoque.view.Janela;
import barestoque.view.telas.Tela;
import java.awt.GridLayout;

public abstract class SetBotoes extends Tela
{ 
    public SetBotoes(Janela pai) {
        super(pai, 3, 5);
        setLayout (new GridLayout(3, 5, 8, 8));
    }
    
}
