/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barestoque.view.telas.cardapio;

import barestoque.DAO.ProdutoDAO;
import barestoque.controller.ControladorCadastroLista;
import barestoque.model.Produto;
import barestoque.view.InicializadorLookAndFeel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class CadastroCardapio extends javax.swing.JPanel {
    
    private Map <Produto, Integer> quantidades;
    private Produto[] ingredientes;
    
    public CadastroCardapio() {
        quantidades = new HashMap<Produto, Integer>();
        ArrayList <Produto> plista = new ProdutoDAO().listaDeProdutos();
        ingredientes = new Produto[plista.size()];
        plista.toArray(ingredientes);
        
        initComponents();
        
        msgErro.setText("");
        setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        
        botaoAdd.addActionListener(new ControladorCadastroLista(this));
        botaoLimpar.addActionListener(new ControladorCadastroLista(this));
        comboBoxIngrediente.addActionListener(new ControladorCadastroLista(this));
        spinnerQuantidade.addChangeListener (new ControladorCadastroLista (this));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxIngrediente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        botaoLimpar = new barestoque.view.componentes.JNegativeButton();
        botaoAdd = new barestoque.view.componentes.JPositiveButton();
        spinnerQuantidade = new javax.swing.JSpinner();
        msgErro = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criar Novo Prato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nome:");

        jLabel2.setText("Preço:");

        jLabel3.setText("Ingredientes:");

        comboBoxIngrediente.setModel(new javax.swing.DefaultComboBoxModel<Produto> (ingredientes));

        jLabel4.setText("quantidade:");

        botaoLimpar.setText("X");
        botaoLimpar.setPreferredSize(new java.awt.Dimension(40, 40));

        botaoAdd.setText("+");
        botaoAdd.setPreferredSize(new java.awt.Dimension(40, 40));

        spinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        msgErro.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNome)
            .addComponent(campoPreco)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 295, Short.MAX_VALUE)
                .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(comboBoxIngrediente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(msgErro))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msgErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBotaoAdd() {
        return botaoAdd;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public JTextField getCampoPreco() {
        return campoPreco;
    }

    public JComboBox<Produto> getComboBoxIngrediente() {
        return comboBoxIngrediente;
    }

    public JLabel getMsgErro() {
        return msgErro;
    }

    public Map<Produto, Integer> getQuantidades() {
        return quantidades;
    }

    public JSpinner getSpinnerQuantidade() {
        return spinnerQuantidade;
    }
    
    
    
    public void limparDados ()
    {
        
        quantidades.clear();
        campoNome.setText("");
        campoPreco.setText("");
        msgErro.setText("");
        spinnerQuantidade.setValue(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JComboBox<Produto> comboBoxIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel msgErro;
    private javax.swing.JSpinner spinnerQuantidade;
    // End of variables declaration//GEN-END:variables
}
