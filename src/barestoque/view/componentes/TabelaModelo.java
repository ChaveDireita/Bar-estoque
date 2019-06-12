package barestoque.view.componentes;

import javax.swing.table.DefaultTableModel;

public class TabelaModelo extends DefaultTableModel
{

    @Override
    public boolean isCellEditable (int row, int column)
    {
        return false;
    }
    
}
