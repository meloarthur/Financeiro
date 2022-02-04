/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ControllerDIGCMP;
import Models.CompraTipo;
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

    //Método construtor
    public ViewDIGCMP() {

        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTDIGCMP.getModel();
        jTDIGCMP.setRowSorter(new TableRowSorter(modelo));
        EntradaCodigo.requestFocus();
        readJTDIGCMP();

    }

    //Criando na interface a tabela do banco de dados
    public void readJTDIGCMP() {

        DefaultTableModel modelo = (DefaultTableModel) jTDIGCMP.getModel();
        modelo.setNumRows(0);
        ControllerDIGCMP ctrl = new ControllerDIGCMP();

        for (DIGCMP d : ctrl.read()) {
            modelo.addRow(new Object[]{
                d.getCodigo(),
                d.getNome()
            });
        }

    }

    //Limpar os dados dos campos de texto
    public void limparDados() {
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
        BtnPesquisar = new javax.swing.JButton();
        EntradaLocalizar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnExcluir = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        EntradaNome = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tipos de Moeda");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        jTDIGCMP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDIGCMPKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTDIGCMP);
        if (jTDIGCMP.getColumnModel().getColumnCount() > 0) {
            jTDIGCMP.getColumnModel().getColumn(0).setMaxWidth(65);
        }

        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pesquisar.png"))); // NOI18N
        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.setNextFocusableComponent(EntradaCodigo);
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        EntradaLocalizar.setNextFocusableComponent(BtnPesquisar);
        EntradaLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLocalizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Localizar:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        EntradaCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EntradaCodigo.setNextFocusableComponent(EntradaNome);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/excluir.png"))); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/atualizar.png"))); // NOI18N
        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salvar.png"))); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/limpar.png"))); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(EntradaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(EntradaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPesquisar)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão Salvar: pega os dados inseridos, envia para a função de INSERT na classe DAO e mostra o resultado na tabela
    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed

        DIGCMP digcmp = new DIGCMP();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaCodigo.getText().length() > 6 || EntradaNome.getText().length() > 30){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nCódigo: Máximo 6 caracteres\nNome: Máximo 30 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se os campos "Código" e "Nome" possuem números
        if (EntradaCodigo.getText().matches(".*\\d.*") || EntradaNome.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        digcmp.setCodigo(EntradaCodigo.getText());
        digcmp.setNome(EntradaNome.getText());

        //Verificando se o código e o nome existem
        if ((ctrl.readCodigo(digcmp.getCodigo()) != null) && (ctrl.readNome(digcmp.getNome()) != null)) {
            JOptionPane.showMessageDialog(null, "O código e o nome informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se o código existe
        if (ctrl.readCodigo(digcmp.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se o nome existe
        if (ctrl.readNome(digcmp.getNome()) != null) {
            JOptionPane.showMessageDialog(null, "O nome informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.create(digcmp);
        limparDados();
        readJTDIGCMP();
        EntradaCodigo.requestFocus();

    }//GEN-LAST:event_BtnSalvarActionPerformed

    //Botão Limpar: limpa os campos de texto e permite o usuário executar uma consulta ou um comando
    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        EntradaCodigo.setText("");
        EntradaNome.setText("");
        EntradaLocalizar.setText("");
        EntradaCodigo.requestFocus();
        readJTDIGCMP();
    }//GEN-LAST:event_BtnLimparActionPerformed

    //Botão Atualizar: pega os dados inseridos, envia para a função de UPDATE na classe DAO e mostra o resultado na tabela
    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed

        DIGCMP digcmp = new DIGCMP();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaCodigo.getText().length() > 6 || EntradaNome.getText().length() > 30){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nCódigo: Máximo 6 caracteres\nNome: Máximo 30 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se os campos "Código" e "Nome" possuem números
        if (EntradaCodigo.getText().matches(".*\\d.*") || EntradaNome.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        digcmp.setCodigo(EntradaCodigo.getText());
        digcmp.setNome(EntradaNome.getText());

        //Verificando se o código existe
        if (ctrl.readCodigo(digcmp.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.update(digcmp);
        limparDados();
        readJTDIGCMP();
        EntradaCodigo.requestFocus();

    }//GEN-LAST:event_BtnAtualizarActionPerformed

    //Botão Excluir: pega os dados inseridos, envia para a função de DELETE na classe DAO e mostra o resultado na tabela
    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed

        DIGCMP digcmp = new DIGCMP();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();

        if (EntradaCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o código dos dados que serão excluidos!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;
        }
        
        if (EntradaCodigo.getText().length() > 6 || EntradaNome.getText().length() > 30){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nCódigo: Máximo 6 caracteres\nNome: Máximo 30 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se os campos "Código" e "Nome" possuem números
        if (EntradaCodigo.getText().matches(".*\\d.*") || EntradaNome.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }

        digcmp.setCodigo(EntradaCodigo.getText());

        if (ctrl.readCodigo(digcmp.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }

        ctrl.delete(digcmp);
        limparDados();
        readJTDIGCMP();
        EntradaCodigo.requestFocus();

    }//GEN-LAST:event_BtnExcluirActionPerformed

    //Clicar na linha da tabela e enviar os valores para os campos de texto
    private void jTDIGCMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDIGCMPMouseClicked

        if (jTDIGCMP.getSelectedRow() != -1) {

            try {

                EntradaCodigo.setText(String.valueOf(jTDIGCMP.getModel().getValueAt(jTDIGCMP.getSelectedRow(), 0)));
                EntradaNome.setText(String.valueOf(jTDIGCMP.getModel().getValueAt(jTDIGCMP.getSelectedRow(), 1)));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_jTDIGCMPMouseClicked

    private void jTDIGCMPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDIGCMPKeyReleased

        if (jTDIGCMP.getSelectedRow() != -1) {

            try {

                EntradaCodigo.setText(String.valueOf(jTDIGCMP.getModel().getValueAt(jTDIGCMP.getSelectedRow(), 0)));
                EntradaNome.setText(String.valueOf(jTDIGCMP.getModel().getValueAt(jTDIGCMP.getSelectedRow(), 1)));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_jTDIGCMPKeyReleased

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jTDIGCMP.getModel();
        ControllerDIGCMP ctrl = new ControllerDIGCMP();
        DIGCMP digcmp = new DIGCMP();
        digcmp.setNome(EntradaLocalizar.getText());

        if (EntradaLocalizar.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o campo vazio!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaLocalizar.requestFocus();
            return;

        } else if (EntradaLocalizar.getText().matches(".*\\d.*")) {
            
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
            
        }

        if (!EntradaLocalizar.getText().isEmpty()) {

            if (EntradaLocalizar.getText().length() <= 30){
                
                DIGCMP d = ctrl.readLine(digcmp);
                modelo.setRowCount(0);

                if (d != null) {

                    modelo.addRow(new Object[]{
                        d.getCodigo(),
                        d.getNome()
                    });
                    EntradaLocalizar.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "A pesquisa não apresentou nenhum resultado!", "Falha Encontrada", JOptionPane.OK_OPTION);
                    EntradaLocalizar.requestFocus();

                }

                return;
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Limite de caracteres atingido! (Máximo: 30)", "Falha Encontrada", JOptionPane.OK_OPTION);
                EntradaLocalizar.requestFocus();
                
            }
            
        }

    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void EntradaLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLocalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaLocalizarActionPerformed
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
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaLocalizar;
    private javax.swing.JTextField EntradaNome;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDIGCMP;
    // End of variables declaration//GEN-END:variables
}
