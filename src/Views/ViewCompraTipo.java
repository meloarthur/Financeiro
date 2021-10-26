package Views;

import Controllers.ControllerCompraTipo;
import Models.CompraTipo;
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
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
    }
    
    //Criando na interface a tabela do banco de dados
    public void readJTCompraTipo(){
        
        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        modelo.setNumRows(0);
        ControllerCompraTipo ctrl = new ControllerCompraTipo();
        
        for (CompraTipo c: ctrl.read()){
            
            modelo.addRow(new Object[]{
                
                c.getCodigo(),
                c.getDescricao(),
                c.getDias()
                
            });
            
        }
        
    }
    
    //Limpa os campos de texto
    public void limparCampos(){
        
        EntradaCodigo.setText("");
        EntradaDescricao.setText("");
        EntradaDias.setText("");
        
    }
    
    //Verifica se os campos são compostos apenas por números
    public boolean isNumeric(String str){
        
        try {
            
            int valor = Integer.parseInt(str);
            return true;
            
        } catch (NumberFormatException e){
            
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
        EntradaDescricao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tipos de Compra");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Tipos de Compra");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Qtd. de dias:");

        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
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

        JTCompraTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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
        jScrollPane1.setViewportView(JTCompraTipo);

        BtnLimpar.setText("Limpar dados");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        try {
            EntradaDescricao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnLimpar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFechar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão de fechar o programa
    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        
        String mensagem = "Deseja encerrar o programa?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0)
            this.dispose();
        
    }//GEN-LAST:event_BtnFecharActionPerformed

    //Botão Insert: pega os dados inseridos, envia para a função de INSERT na classe DAO e mostra o resultado na tabela
    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        
        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();
        
        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        //Verificando se os campos "Código" e "Qtd. de dias" são compostos por números
        if ((!isNumeric(EntradaCodigo.getText())) || (!isNumeric(EntradaDias.getText()))){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));
        
        //Verificando se o código e a descrição existem
        if ((ctrl.readCodigo(compra.getCodigo()) != null) && (ctrl.readDescricao(compra.getDescricao()) != null)){
            JOptionPane.showMessageDialog(null, "O código e a descrição informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        //Verificando se o código existe
        if (ctrl.readCodigo(compra.getCodigo()) != null){
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        //Verificando se a descrição existe
        if (ctrl.readDescricao(compra.getDescricao()) != null){
            JOptionPane.showMessageDialog(null, "A descrição informada já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        ctrl.create(compra);                //Envia os dados para o controlador
        limparCampos();                     //Apaga os dados dos campos de texto
        readJTCompraTipo();                 //Chama a tabela novamente para atualizá-la
        EntradaCodigo.requestFocus();       //Aponta o cursor para o primeiro campo de texto
        
    }//GEN-LAST:event_BtnSalvarActionPerformed

    //Botão Update: pega os dados inseridos, envia para a função de UPDATE na classe DAO e mostra o resultado na tabela
    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
        
        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();
        
        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        //Verificando se os campos "Código" e "Qtd. de dias" são compostos por números
        if ((!isNumeric(EntradaCodigo.getText())) || (!isNumeric(EntradaDias.getText()))){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));
        
        //Verificando se o código existe
        if (ctrl.readCodigo(compra.getCodigo()) == null){
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        ctrl.update(compra);
        limparCampos();
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    //Botão Delete: pega os dados inseridos, envia para a função de DELETE na classe DAO e mostra o resultado na tabela
    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        
        CompraTipo compra = new CompraTipo();
        ControllerCompraTipo ctrl = new ControllerCompraTipo();
        
        if (EntradaCodigo.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Insira o código dos dados que serão excluidos!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        //Verificando se os campos "Código" e "Qtd. de dias" são compostos por números
        if ((!isNumeric(EntradaCodigo.getText())) || (!isNumeric(EntradaDias.getText()))){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        
        if (ctrl.readCodigo(compra.getCodigo()) == null){
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
        
        if (JTCompraTipo.getSelectedRow() != -1){
            
            try {
                
                EntradaCodigo.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 0)));
                EntradaDescricao.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 1)));
                EntradaDias.setText(String.valueOf(JTCompraTipo.getModel().getValueAt(JTCompraTipo.getSelectedRow(), 2)));
                
            } catch (Exception e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        }
        
    }//GEN-LAST:event_JTCompraTipoMouseClicked

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        
        EntradaCodigo.setText("");
        EntradaDescricao.setText("");
        EntradaDias.setText("");
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_BtnLimparActionPerformed

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
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JFormattedTextField EntradaDescricao;
    private javax.swing.JTextField EntradaDias;
    private javax.swing.JTable JTCompraTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
