package barestoque.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.border.StrokeBorder;

/**
 * InicializadorLookAndFeel.
 * 
 * Assumindo uma forma mais elegante, uma das gambiarras do meu PBL 2 foi con-
 * vertida na classe InicializadorLookAndFeel. Ela modifica as chaves
 * (Object keys) da classe UIManager, que correspondem aos dados padrão de apa-
 * rência dos componentes swing.
 * 
 * Por exemplo, UIManager.put ("Button.background", algumObjetoTipoColor) modi-
 * fica todos os JButtons que serão criados para ter a cor "algumObjeoTipoColor"
 * 
 * @author Filipe Nolasco (ChaveDireita)
 */

public class InicializadorLookAndFeel 
{
    public static final Color COR_BACKGROUND = new Color (53, 47, 43),
                              COR_FOREGROUND = new Color (247, 240, 230),
                              COR_BOTAO_PADRAO = new Color (223, 157, 46),
                              COR_BOTAO_POSITIVO = new Color (208, 204, 41),
                              COR_BOTAO_NEGATIVO = new Color (201, 78, 55),
                              COR_CAMPO_TEXTO_PADRAO = new Color (247, 245, 242);
    
    public static final Font FONTE_BOTAO_PADRAO = new Font("Calibri", Font.PLAIN, 16),
                             FONTE_LABEL_PADRAO = new Font("Calibri", Font.PLAIN, 16);
    
    public InicializadorLookAndFeel ()
    {
        
    }
    
    public void init ()
    {
        //Painéis
        UIManager.put ("Panel.background", COR_BACKGROUND);
        
        //Botoes
        UIManager.put ("Button.background", COR_BOTAO_PADRAO);
        UIManager.put ("Button.foreground", COR_FOREGROUND);
        UIManager.put ("Button.border", new StrokeBorder (new BasicStroke (0f), COR_BACKGROUND));
        UIManager.put ("Button.font", FONTE_BOTAO_PADRAO);
        UIManager.put ("Button.focus", new Color (0, 0, 0, 0));
        UIManager.put ("Button.select", new Color (69, 122, 201, 20));
        
        //Labels
        UIManager.put ("Label.foreground", COR_BACKGROUND);
        UIManager.put ("Label.font", FONTE_LABEL_PADRAO);
        
        //Bordas
        UIManager.put ("TitledBorder.font", FONTE_LABEL_PADRAO);
        UIManager.put ("TitledBorder.border", new StrokeBorder (new BasicStroke (40f), COR_FOREGROUND));
        
        //Campos de texto
        UIManager.put ("TextField.background", COR_CAMPO_TEXTO_PADRAO);
        UIManager.put ("TextField.foreground", COR_BACKGROUND);
        UIManager.put ("TextField.border", new StrokeBorder (new BasicStroke (1f), COR_BACKGROUND));
        UIManager.put ("TextField.selectionBackground", COR_BACKGROUND);
        UIManager.put ("TextField.selectionForeground", COR_CAMPO_TEXTO_PADRAO);
        UIManager.put ("TextField.caretForeground", COR_BACKGROUND);
        UIManager.put ("TextField.font", FONTE_LABEL_PADRAO);
        
        //ComboBoxes
        UIManager.put ("ComboBox.background", COR_CAMPO_TEXTO_PADRAO);
        UIManager.put ("ComboBox.foreground", COR_BACKGROUND);
        UIManager.put ("ComboBox.border", new StrokeBorder (new BasicStroke (1f), COR_BACKGROUND));
        UIManager.put ("ComboBox.selectionBackground", COR_BACKGROUND);
        UIManager.put ("ComboBox.selectionForeground", COR_CAMPO_TEXTO_PADRAO);
        UIManager.put ("ComboBox.buttonHighlight", COR_FOREGROUND);
        UIManager.put ("ComboBox.font", FONTE_LABEL_PADRAO);
        
        //Tabelas
        UIManager.put ("Table.background", COR_CAMPO_TEXTO_PADRAO);
        UIManager.put ("Table.foreground", COR_BACKGROUND);
        UIManager.put ("Table.font", FONTE_LABEL_PADRAO);
        UIManager.put ("Table.gridColor", COR_BACKGROUND);
        UIManager.put ("Table.border", new StrokeBorder (new BasicStroke (1f), COR_BACKGROUND));
        UIManager.put ("Table.selectionBackground", COR_CAMPO_TEXTO_PADRAO);
        UIManager.put ("TableHeader.font", FONTE_LABEL_PADRAO);
        UIManager.put ("TableHeader.background", COR_BACKGROUND);
        UIManager.put ("TableHeader.foreground", COR_FOREGROUND);
        UIManager.put ("TableHeader.cellBorder", new StrokeBorder (new BasicStroke (1f), COR_BACKGROUND));
        
        //Scrollers
        UIManager.put ("ScrollBar.width", 0);
        
        //Spinners
        UIManager.put("Spinner.font", FONTE_LABEL_PADRAO);
        
    }
}
