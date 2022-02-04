/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ControllerMarcas;
import Models.Marcas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arthur.melo
 */
public class ViewMarcas extends javax.swing.JFrame {

    /**
     * Creates new form ViewMarcas
     */
    public ViewMarcas() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTMarcas.getModel();
        jTMarcas.setRowSorter(new TableRowSorter(modelo));
        EntradaCodigo.requestFocus();
        readJTMarcas();
    }
    
    //Criando na interface a tabela do banco de dados
    public void readJTMarcas() {

        DefaultTableModel modelo = (DefaultTableModel) jTMarcas.getModel();
        modelo.setNumRows(0);
        ControllerMarcas ctrl = new ControllerMarcas();

        for (Marcas m : ctrl.read()) {
            modelo.addRow(new Object[]{
                m.getCodigo(),
                m.getNome()
            });
        }

    }

    public void limparDados() {
        EntradaCodigo.setText("");
        EntradaNome.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EntradaLocalizar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTMarcas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EntradaNome = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Marcas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Marcas de Materiais");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Localizar:");

        EntradaLocalizar.setNextFocusableComponent(EntradaCodigo);
        EntradaLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLocalizarActionPerformed(evt);
            }
        });

        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pesquisar.png"))); // NOI18N
        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        jTMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMarcasMouseClicked(evt);
            }
        });
        jTMarcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTMarcasKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTMarcas);
        if (jTMarcas.getColumnModel().getColumnCount() > 0) {
            jTMarcas.getColumnModel().getColumn(0).setMaxWidth(65);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        EntradaCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EntradaCodigo.setNextFocusableComponent(EntradaNome);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        EntradaNome.setNextFocusableComponent(EntradaLocalizar);
        EntradaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomeActionPerformed(evt);
            }
        });

        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/limpar.png"))); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salvar.png"))); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/atualizar.png"))); // NOI18N
        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/excluir.png"))); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EntradaCodigo)
                        .addComponent(jLabel3)
                        .addComponent(EntradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EntradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnPesquisar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        EntradaCodigo.setText("");
        EntradaNome.setText("");
        EntradaLocalizar.setText("");
        EntradaCodigo.requestFocus();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void EntradaLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLocalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaLocalizarActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jTMarcas.getModel();
        ControllerMarcas ctrl = new ControllerMarcas();
        Marcas marcas = new Marcas();
        marcas.setNome(EntradaLocalizar.getText());

        if (EntradaLocalizar.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o campo vazio!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;

        } else if (EntradaLocalizar.getText().matches(".*\\d.*")) {
            
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
            
        }

        if (!EntradaLocalizar.getText().isEmpty()) {

            if (EntradaLocalizar.getText().length() <= 20){
                
                Marcas m = ctrl.readLine(marcas);
                modelo.setRowCount(0);

                if (m != null) {

                    modelo.addRow(new Object[]{
                        m.getCodigo(),
                        m.getNome()
                    });
                    EntradaCodigo.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "A pesquisa não apresentou nenhum resultado!", "Falha Encontrada", JOptionPane.OK_OPTION);
                    EntradaCodigo.requestFocus();

                }

                return;
            
            } else {
                
                JOptionPane.showMessageDialog(null, "Limite de caracteres atingido! (Máximo: 20)", "Falha Encontrada", JOptionPane.OK_OPTION);
                EntradaCodigo.requestFocus();
                
            }

        }
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void jTMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMarcasMouseClicked

        if (jTMarcas.getSelectedRow() != -1) {

            try {

                EntradaCodigo.setText(String.valueOf(jTMarcas.getModel().getValueAt(jTMarcas.getSelectedRow(), 0)));
                EntradaNome.setText(String.valueOf(jTMarcas.getModel().getValueAt(jTMarcas.getSelectedRow(), 1)));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_jTMarcasMouseClicked

    private void jTMarcasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMarcasKeyReleased

        if (jTMarcas.getSelectedRow() != -1) {

            try {

                EntradaCodigo.setText(String.valueOf(jTMarcas.getModel().getValueAt(jTMarcas.getSelectedRow(), 0)));
                EntradaNome.setText(String.valueOf(jTMarcas.getModel().getValueAt(jTMarcas.getSelectedRow(), 1)));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_jTMarcasKeyReleased

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed

        Marcas marcas = new Marcas();
        ControllerMarcas ctrl = new ControllerMarcas();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaCodigo.getText().length() > 3 || EntradaNome.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nCódigo: Máximo 3 caracteres\nNome: Máximo 20 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        marcas.setCodigo(EntradaCodigo.getText());
        marcas.setNome(EntradaNome.getText());

        //Verificando se o código e o nome existem
        if ((ctrl.readCodigo(marcas.getCodigo()) != null) && (ctrl.readNome(marcas.getNome()) != null)) {
            JOptionPane.showMessageDialog(null, "O código e o nome informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se o código existe
        if (ctrl.readCodigo(marcas.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se o nome existe
        if (ctrl.readNome(marcas.getNome()) != null) {
            JOptionPane.showMessageDialog(null, "O nome informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.create(marcas);
        limparDados();
        readJTMarcas();
        EntradaCodigo.requestFocus();
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed

        Marcas marcas = new Marcas();
        ControllerMarcas ctrl = new ControllerMarcas();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaCodigo.getText().length() > 3 || EntradaNome.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nCódigo: Máximo 3 caracteres\nNome: Máximo 20 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        marcas.setCodigo(EntradaCodigo.getText());
        marcas.setNome(EntradaNome.getText());

        //Verificando se o código existe
        if (ctrl.readCodigo(marcas.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.update(marcas);
        limparDados();
        readJTMarcas();
        EntradaCodigo.requestFocus();
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed

        Marcas marcas = new Marcas();
        ControllerMarcas ctrl = new ControllerMarcas();

        if (EntradaCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o código dos dados que serão excluidos!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;
        }
        
        if (EntradaCodigo.getText().length() > 3 || EntradaNome.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nCódigo: Máximo 3 caracteres\nNome: Máximo 20 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        marcas.setCodigo(EntradaCodigo.getText());

        if (ctrl.readCodigo(marcas.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }

        ctrl.delete(marcas);
        limparDados();
        readJTMarcas();
        EntradaCodigo.requestFocus();
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void EntradaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaLocalizar;
    private javax.swing.JTextField EntradaNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTMarcas;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
