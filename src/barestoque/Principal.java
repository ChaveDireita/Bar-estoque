
package barestoque;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.telas.TelaInicial;
import javax.swing.SwingUtilities;
public class Principal
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            new InicializadorLookAndFeel ().init();
            Janela j = new Janela ("Teste", 1280, 768, false);
            j.aparecer();
            j.setCena(new TelaInicial (j));
        });
    }
}