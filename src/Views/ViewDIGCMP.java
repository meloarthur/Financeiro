/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ControllerDIGCMP;
import Models.DIGCMP;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arthur.melo
 */
public class ViewDIGCMP extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public ViewDIGCMP() {
        
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTDIGCMP.getModel();
        jTDIGCMP.setRowSorter(new TableRowSorter(modelo));
        readJTDIGCMP();
        EntradaCodigo.requestFocus();
        
    }
    
    public void readJTDIGCMP(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTDIGCMP.getModel();
        modelo.setNumRows(0);
        ControllerDIGCMP ctrl = new ControllerDIGCMP();
        
        for (DIGCMP d : ctrl.read()){
            modelo.addRow(new Object[]{
                d.getCodigo(),
                d.getNome()
            });
        }
        
    }
    
    public void limparDados(){
        EntradaCodigo.setText("");
        EntradaNome.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDIGCMP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnLimpar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        EntradaCodigo = new javax.swing.JFormattedTextField();
        EntradaNome = new javax.swing.JFormattedTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tipos de Moeda");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Tipos de Moeda de Pagamento");

        jTDIGCMP.setModel(new javax.swing.table.DefaultTableModel(
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
        jTDIGCMP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTDIGCMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDIGCMPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTDIGCMP);
        if (jTDIGCMP.getColumnModel().getColumnCount() > 0) {
            jTDIGCMP.getColumnModel().getColumn(0).setMaxWidth(65);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        BtnLimpar.setText("Limpar dados");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        try {
            EntradaCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("******")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            EntradaNome.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("******************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EntradaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(150, 150, 150))
                            .addComponent(EntradaNome)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpar)
                    .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFechar)
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        
        DIGCMP digcmp = new DIGCMP();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();
        
        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            return; 
        }
        
        //Verificando se os campos "Código" e "Nome" possuem números
        if (EntradaCodigo.getText().matches(".*\\d.*") || EntradaNome.getText().matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        digcmp.setCodigo(EntradaCodigo.getText());
        digcmp.setNome(EntradaNome.getText());
        
        //Verificando se o código e o nome existem
        if ((ctrl.readCodigo(digcmp.getCodigo()) != null) && (ctrl.readNome(digcmp.getNome()) != null)){
            JOptionPane.showMessageDialog(null, "O código e o nome informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        //Verificando se o código existe
        if (ctrl.readCodigo(digcmp.getCodigo()) != null){
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        //Verificando se o nome existe
        if (ctrl.readNome(digcmp.getNome()) != null){
            JOptionPane.showMessageDialog(null, "O nome informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        ctrl.create(digcmp);
        limparDados();
        readJTDIGCMP();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        EntradaCodigo.setText("");
        EntradaNome.setText("");
        readJTDIGCMP();
        EntradaCodigo.requestFocus();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
        
        DIGCMP digcmp = new DIGCMP();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();
        
        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaNome.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        //Verificando se os campos "Código" e "Nome" possuem números
        if (EntradaCodigo.getText().matches(".*\\d.*") || EntradaNome.getText().matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        digcmp.setCodigo(EntradaCodigo.getText());
        digcmp.setNome(EntradaNome.getText());
        
        //Verificando se o código existe
        if (ctrl.readCodigo(digcmp.getCodigo()) == null){
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        ctrl.update(digcmp);
        limparDados();
        readJTDIGCMP();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        
        DIGCMP digcmp = new DIGCMP();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();
        
        if (EntradaCodigo.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Insira o código dos dados que serão excluidos!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        //Verificando se os campos "Código" e "Nome" possuem números
        if (EntradaCodigo.getText().matches(".*\\d.*") || EntradaNome.getText().matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        digcmp.setCodigo(EntradaCodigo.getText());
        
        if (ctrl.readCodigo(digcmp.getCodigo()) == null){
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        ctrl.delete(digcmp);
        limparDados();
        readJTDIGCMP();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        
        String mensagem = "Deseja encerrar o programa?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0)
            this.dispose();
        
    }//GEN-LAST:event_BtnFecharActionPerformed

    //Clicar na linha da tabela e enviar os valores para os campos de texto
    private void jTDIGCMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDIGCMPMouseClicked
        
        if (jTDIGCMP.getSelectedRow() != -1){
            
            try {
                
                EntradaCodigo.setText(String.valueOf(jTDIGCMP.getModel().getValueAt(jTDIGCMP.getSelectedRow(), 0)));
                EntradaNome.setText(String.valueOf(jTDIGCMP.getModel().getValueAt(jTDIGCMP.getSelectedRow(), 1)));
                
            } catch (Exception e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        }
        
    }//GEN-LAST:event_jTDIGCMPMouseClicked

    private void EntradaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNomeActionPerformed
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDIGCMP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JFormattedTextField EntradaCodigo;
    private javax.swing.JFormattedTextField EntradaNome;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDIGCMP;
    // End of variables declaration//GEN-END:variables
}
