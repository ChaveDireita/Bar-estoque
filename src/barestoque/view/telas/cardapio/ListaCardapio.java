/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barestoque.view.telas.cardapio;

import barestoque.DAO.PratoDAO;
import barestoque.controller.ControladorCadastroLista;
import barestoque.model.Prato;
import barestoque.view.InicializadorLookAndFeel;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;

public class ListaCardapio extends javax.swing.JPanel {
    
    private Prato[] listaPratos;
    
    public ListaCardapio() {
        
        ArrayList<Prato> lPrato = new PratoDAO ().listaDePratos ();
        listaPratos = new Prato[lPrato.size ()];
        lPrato.toArray (listaPratos);
        
        initComponents();
        setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        
        comboBoxItem.addActionListener (new ControladorCadastroLista (this));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        comboBoxItem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorPaneFormula = new javax.swing.JEditorPane();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardápio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Item:");

        comboBoxItem.setModel(new javax.swing.DefaultComboBoxModel<Prato>(listaPratos));
        comboBoxItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboBoxItemActionPerformed(evt);
            }
        });

        editorPaneFormula.setEditable(false);
        jScrollPane1.setViewportView(editorPaneFormula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboBoxItemActionPerformed
    {//GEN-HEADEREND:event_comboBoxItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxItemActionPerformed

    public JComboBox<Prato> getComboBoxItem ()
    {
        return comboBoxItem;
    }
    
    public JEditorPane getEditorPaneFormula() {
        return editorPaneFormula;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Prato> comboBoxItem;
    private javax.swing.JEditorPane editorPaneFormula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
