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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnLimpar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        EntradaNome = new javax.swing.JFormattedTextField();
        BtnPesquisar = new javax.swing.JButton();
        EntradaCodigo = new javax.swing.JTextField();
        EntradaLocalizar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

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

        BtnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fechar.png"))); // NOI18N
        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        try {
            EntradaNome.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("******************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EntradaNome.setNextFocusableComponent(EntradaLocalizar);
        EntradaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomeActionPerformed(evt);
            }
        });

        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pesquisar.png"))); // NOI18N
        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        EntradaCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EntradaCodigo.setNextFocusableComponent(EntradaNome);

        EntradaLocalizar.setNextFocusableComponent(EntradaCodigo);
        EntradaLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLocalizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Localizar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EntradaCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnFechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntradaNome)
                                    .addComponent(EntradaLocalizar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpar)
                    .addComponent(EntradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSalvar)
                            .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPesquisar))
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFechar)))
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

    //Botão Fechar: fechar janela e voltar para o menu
    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed

        String mensagem = "Deseja encerrar o programa?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_BtnFecharActionPerformed

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

    private void EntradaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNomeActionPerformed

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

            modelo.setRowCount(0);

            for (DIGCMP d : ctrl.read()) {
                modelo.addRow(new Object[]{
                    d.getCodigo(),
                    d.getNome()
                });
            }

            EntradaCodigo.requestFocus();
            return;

        } else if (EntradaLocalizar.getText().matches(".*\\d.*")) {
            
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
            
        }

        if (!EntradaLocalizar.getText().isEmpty()) {

            if (EntradaLocalizar.getText().length() > 30){
                
                DIGCMP d = ctrl.readLine(digcmp);
                modelo.setRowCount(0);

                if (d != null) {

                    modelo.addRow(new Object[]{
                        d.getCodigo(),
                        d.getNome()
                    });
                    EntradaCodigo.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "A pesquisa não apresentou nenhum resultado!", "Falha Encontrada", JOptionPane.OK_OPTION);
                    EntradaCodigo.requestFocus();

                }

                return;
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Limite de caracteres atingido! (Máximo: 30)", "Falha Encontrada", JOptionPane.OK_OPTION);
                EntradaCodigo.requestFocus();
                
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
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaLocalizar;
    private javax.swing.JFormattedTextField EntradaNome;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDIGCMP;
    // End of variables declaration//GEN-END:variables
}
