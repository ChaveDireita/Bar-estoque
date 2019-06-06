package barestoque.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.UIManager;
import javax.swing.border.StrokeBorder;


public class InicializadorLookAndFeel 
{
    public static final Color BACKGROUND = new Color (53, 47, 43),
                              FOREGROUND = new Color (247, 240, 230),
                              BOTAO_PADRAO = new Color (223, 157, 46),
                              BOTAO_POSITIVO = new Color (208, 204, 41),
                              BOTAO_NEGATIVO = new Color (201, 78, 55);
    
    public InicializadorLookAndFeel ()
    {
        
    }
    
    public void init ()
    {
        //Painéis
        UIManager.put ("Panel.background", BACKGROUND);
        
        //Botoes
        UIManager.put ("Button.background", BOTAO_PADRAO);
        UIManager.put ("Button.foreground", FOREGROUND);
        UIManager.put ("Button.padding", FOREGROUND);
        UIManager.put ("Button.border", new StrokeBorder (new BasicStroke (0f), Color.white));
        UIManager.put ("Button.font", new Font("Calibri", Font.PLAIN, 18));
        UIManager.put ("Button.focus", new Color (0, 0, 0, 0));
        UIManager.put ("Button.select", new Color (69, 122, 201, 20));
        
        
    }
}
