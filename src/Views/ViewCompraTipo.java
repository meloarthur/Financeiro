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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        EntradaDias = new javax.swing.JTextField();
        BtnAtualizar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTCompraTipo = new javax.swing.JTable();
        BtnLimpar = new javax.swing.JButton();
        BtnPesquisar = new javax.swing.JButton();
        EntradaDescricao = new javax.swing.JTextField();
        EntradaLocalizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tipos de Compra");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipos de Compra");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Qtd. de dias:");

        EntradaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCodigoActionPerformed(evt);
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

        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/limpar.png"))); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pesquisar.png"))); // NOI18N
        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        EntradaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDescricaoActionPerformed(evt);
            }
        });

        EntradaLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLocalizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Localizar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(BtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28))
                    .addComponent(BtnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSalvar)
                            .addComponent(EntradaLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Botão Fechar: fechar janela e voltar para o menu
    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed

        String mensagem = "Deseja encerrar o programa?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_BtnFecharActionPerformed

    //Botão Salvar: pega os dados inseridos, envia para a função de INSERT na classe DAO e mostra o resultado na tabela
    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed

        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
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
            return;
        }

        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));

        //Verificando se o código e a descrição existem
        if ((ctrl.readCodigo(compra.getCodigo()) != null) && (ctrl.readDescricao(compra.getDescricao()) != null)) {
            JOptionPane.showMessageDialog(null, "O código e a descrição informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }

        //Verificando se o código existe
        if (ctrl.readCodigo(compra.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }

        //Verificando se a descrição existe
        if (ctrl.readDescricao(compra.getDescricao()) != null) {
            JOptionPane.showMessageDialog(null, "A descrição informada já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }

        ctrl.create(compra);                //Envia os dados para o controlador
        limparCampos();                     //Apaga os dados dos campos de texto
        readJTCompraTipo();         //Chama a tabela novamente para atualizá-la
        EntradaCodigo.requestFocus();       //Aponta o cursor para o primeiro campo de texto

    }//GEN-LAST:event_BtnSalvarActionPerformed

    //Botão Atualizar: pega os dados inseridos, envia para a função de UPDATE na classe DAO e mostra o resultado na tabela
    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed

        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
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
            return;
        }

        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));

        //Verificando se o código existe
        if (ctrl.readCodigo(compra.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
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
            return;
        }

        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));

        if (ctrl.readCodigo(compra.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
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

    }//GEN-LAST:event_BtnLimparActionPerformed

    private void JTCompraTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCompraTipoKeyPressed

    }//GEN-LAST:event_JTCompraTipoKeyPressed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();
        CompraTipo compra = new CompraTipo();
        compra.setDescricao(EntradaLocalizar.getText());

        if (EntradaLocalizar.getText().isEmpty()) {
            
            modelo.setRowCount(0);
                
            for (CompraTipo c : ctrl.read()){
                modelo.addRow(new Object[]{
                    c.getCodigo(),
                    c.getDescricao(),
                    c.getDias()
                });
            }
            
            EntradaCodigo.requestFocus();
            return;
                
        }else if (EntradaLocalizar.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
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
                    JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
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
    private javax.swing.JButton BtnFechar;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
