package Views;

import Controllers.ControllerCompraTipo;
import Models.CompraTipo;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author arthur.melo
 */
public class ViewCompraTipo extends javax.swing.JFrame {

    //Método construtor
    public ViewCompraTipo() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        JTCompraTipo.setRowSorter(new TableRowSorter(modelo));
        EntradaCodigo.requestFocus();
        readJTCompraTipo();
    }

    //Criando na interface a tabela do banco de dados
    public void readJTCompraTipo() {

        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        modelo.setNumRows(0);
        ControllerCompraTipo ctrl = new ControllerCompraTipo();

        for (CompraTipo c : ctrl.read()) {

            modelo.addRow(new Object[]{
                c.getCodigo(),
                c.getDescricao(),
                c.getDias()

            });

        }

    }

    //Limpa os campos de texto
    public void limparCampos() {

        EntradaCodigo.setText("");
        EntradaDescricao.setText("");
        EntradaDias.setText("");

    }

    //Verifica se os campos são compostos apenas por números
    public boolean isNumeric(String str) {

        try {

            int valor = Integer.parseInt(str);
            return true;

        } catch (NumberFormatException e) {

            return false;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTCompraTipo = new javax.swing.JTable();
        BtnPesquisar = new javax.swing.JButton();
        EntradaLocalizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EntradaDias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EntradaDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnLimpar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tipos de Compra");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipos de Compra");

        JTCompraTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRICAO", "DIAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTCompraTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTCompraTipoMouseClicked(evt);
            }
        });
        JTCompraTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTCompraTipoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTCompraTipoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTCompraTipo);

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Localizar:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EntradaDias.setNextFocusableComponent(EntradaLocalizar);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Qtd. de dias:");

        EntradaDescricao.setNextFocusableComponent(EntradaDias);
        EntradaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        EntradaCodigo.setNextFocusableComponent(EntradaDescricao);
        EntradaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(EntradaLocalizar)
                            .addGap(12, 12, 12)
                            .addComponent(BtnPesquisar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPesquisar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão Salvar: pega os dados inseridos, envia para a função de INSERT na classe DAO e mostra o resultado na tabela
    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed

        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaDescricao.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nDescrição: Máximo 20 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se os campos "Código", "Descrição" e "Qtd. de dias" são compostos por números
        if ((!isNumeric(EntradaCodigo.getText())) || (EntradaDescricao.getText().matches(".*\\d.*")) || (!isNumeric(EntradaDias.getText()))) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));

        //Verificando se o código e a descrição existem
        if ((ctrl.readCodigo(compra.getCodigo()) != null) && (ctrl.readDescricao(compra.getDescricao()) != null)) {
            JOptionPane.showMessageDialog(null, "O código e a descrição informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se o código existe
        if (ctrl.readCodigo(compra.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se a descrição existe
        if (ctrl.readDescricao(compra.getDescricao()) != null) {
            JOptionPane.showMessageDialog(null, "A descrição informada já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.create(compra);                //Envia os dados para o controlador
        limparCampos();                     //Apaga os dados dos campos de texto
        readJTCompraTipo();                 //Chama a tabela novamente para atualizá-la
        EntradaCodigo.requestFocus();       //Aponta o cursor para o primeiro campo de texto

    }//GEN-LAST:event_BtnSalvarActionPerformed

    //Botão Atualizar: pega os dados inseridos, envia para a função de UPDATE na classe DAO e mostra o resultado na tabela
    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed

        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaDescricao.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nDescrição: Máximo 20 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se os campos "Código" e "Qtd. de dias" são compostos por números
        if ((!isNumeric(EntradaCodigo.getText())) || (!isNumeric(EntradaDias.getText()))) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));

        //Verificando se o código existe
        if (ctrl.readCodigo(compra.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.update(compra);
        limparCampos();
        readJTCompraTipo();
        EntradaCodigo.requestFocus();

    }//GEN-LAST:event_BtnAtualizarActionPerformed

    //Botão Excluir: pega os dados inseridos, envia para a função de DELETE na classe DAO e mostra o resultado na tabela
    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed

        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();

        if (EntradaCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o código dos dados que serão excluidos!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        if (EntradaDescricao.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Limite de caracteres atingido!\n\nDescrição: Máximo 20 caracteres", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        //Verificando se os campos "Código" e "Qtd. de dias" são compostos por números
        if ((!isNumeric(EntradaCodigo.getText())) || (!isNumeric(EntradaDias.getText()))) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));

        if (ctrl.readCodigo(compra.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }

        ctrl.delete(compra);
        limparCampos();
        readJTCompraTipo();
        EntradaCodigo.requestFocus();

    }//GEN-LAST:event_BtnExcluirActionPerformed

    //Botão Limpar: apaga os dados dos campos de texto e permite o usuário executar uma consulta ou um comando
    private void JTCompraTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCompraTipoMouseClicked

        if (JTCompraTipo.getSelectedRow() != -1) {

            try {

                EntradaCodigo.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 0)));
                EntradaDescricao.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 1)));
                EntradaDias.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 2)));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_JTCompraTipoMouseClicked

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed

        EntradaCodigo.setText("");
        EntradaDescricao.setText("");
        EntradaDias.setText("");
        EntradaLocalizar.setText("");
        EntradaCodigo.requestFocus();
        readJTCompraTipo();

    }//GEN-LAST:event_BtnLimparActionPerformed

    private void JTCompraTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCompraTipoKeyPressed

    }//GEN-LAST:event_JTCompraTipoKeyPressed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();
        CompraTipo compra = new CompraTipo();
        compra.setDescricao(EntradaLocalizar.getText());

        if (EntradaLocalizar.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha o campo vazio!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaLocalizar.requestFocus();
            return;
                
        }else if (EntradaLocalizar.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaLocalizar.requestFocus();
            return;
        }

        if (!EntradaLocalizar.getText().isEmpty()) {
            
            if (EntradaLocalizar.getText().length() <= 20){
                
                CompraTipo c = ctrl.readLine(compra);
                modelo.setRowCount(0);

                if (c != null){
                    modelo.addRow(new Object[]{
                        c.getCodigo(),
                        c.getDescricao(),
                        c.getDias()
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "A descrição informada não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
                    EntradaLocalizar.requestFocus();
                }

                return; 
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Limite de caracteres atingido! (Máximo: 20)", "Falha Encontrada", JOptionPane.OK_OPTION);
                EntradaCodigo.requestFocus();
                
            }
            
        }

    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void JTCompraTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCompraTipoKeyReleased

        if (JTCompraTipo.getSelectedRow() != -1) {

            try {

                EntradaCodigo.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 0)));
                EntradaDescricao.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 1)));
                EntradaDias.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 2)));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_JTCompraTipoKeyReleased

    private void EntradaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCodigoActionPerformed

    private void EntradaLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLocalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaLocalizarActionPerformed

    private void EntradaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDescricaoActionPerformed

    //Abrir menu
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCompraTipo().setVisible(true);
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
    private javax.swing.JTextField EntradaDescricao;
    private javax.swing.JTextField EntradaDias;
    private javax.swing.JTextField EntradaLocalizar;
    private javax.swing.JTable JTCompraTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
