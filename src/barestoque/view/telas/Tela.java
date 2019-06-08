package barestoque.view.telas;

import barestoque.view.Janela;
import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class Tela extends JPanel
{
    protected JComponent[][] mapa;
    protected Janela pai;
    protected int linhas,
                  colunas;
    
    public Tela (Janela pai, int linhas, int colunas)
    {
        this.pai = pai;
        this.linhas = linhas;
        this.colunas = colunas;
        
        mapa = new JComponent[linhas][colunas];
        for (int i = 0; i < mapa.length; i++)
            for (int j = 0; j < mapa[i].length; j++)
                mapa[i][j] = new JPanel ();
    }
    
    public void insertMapa (JComponent jc, int linha, int coluna)
    {
        mapa[linha][coluna] = jc;
    }
    
    protected void montarTela ()
    {
        for (JComponent[] jcarray : mapa)
            for (JComponent jc : jcarray)
                    add (jc);
    } 
    
}
