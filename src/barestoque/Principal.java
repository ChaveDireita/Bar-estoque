package barestoque;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.telas.TelaInicial;

public class Principal
{
    public static void main(String[] args) 
    {
        new InicializadorLookAndFeel ().init();
        Janela j = new Janela ("Teste", 1280, 768, true);
        j.aparecer();
        j.setCena(new TelaInicial());
    }
}
