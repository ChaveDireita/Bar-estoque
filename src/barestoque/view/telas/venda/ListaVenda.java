/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barestoque.view.telas.venda;

import barestoque.controller.ControladorCadastroLista;
import barestoque.view.InicializadorLookAndFeel;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author nolas
 */
public class ListaVenda extends javax.swing.JPanel {

    /**
     * Creates new form ListaVenda
     */
    public ListaVenda() {
        initComponents();
        setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        
        botaoDeletar.addActionListener(new ControladorCadastroLista(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        botaoDeletar.setText("Deletar");
        botaoDeletar.setPreferredSize(new java.awt.Dimension(73, 40));

        tabelaVenda.setBorder(new javax.swing.border.StrokeBorder(new java.awt.BasicStroke (1f), InicializadorLookAndFeel.COR_BACKGROUND));
        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaVenda.setFillsViewportHeight(true);
        tabelaVenda.setRowHeight(28);
        jScrollPane1.setViewportView(tabelaVenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public JButton getBotaoDeletar() {
        return botaoDeletar;
    }

    public JTable getTabelaVenda() {
        return tabelaVenda;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVenda;
    // End of variables declaration//GEN-END:variables
}
