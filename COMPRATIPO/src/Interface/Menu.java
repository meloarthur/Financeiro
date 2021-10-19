package Interface;

import CompraTipo.CompraTipo;
import CompraTipoDAO.CompraTipoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * @author arthur.melo
 */
public class Menu extends javax.swing.JFrame {

    //Método construtor
    public Menu() {
        initComponents();
        getContentPane().setBackground(Color.black);
        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        JTCompraTipo.setRowSorter(new TableRowSorter(modelo));
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
    }
    
    //Criando na interface a tabela do banco de dados
    public void readJTCompraTipo(){
        
        DefaultTableModel modelo = (DefaultTableModel) JTCompraTipo.getModel();
        modelo.setNumRows(0);
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        for (CompraTipo c: compraDAO.read()){
            
            modelo.addRow(new Object[]{
                
                c.getCodigo(),
                c.getDescricao(),
                c.getDias()
                
            });
            
        }
        
    }
    
    public void limparCampos(){
        
        EntradaCodigo.setText("");
        EntradaDescricao.setText("");
        EntradaDias.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        EntradaDescricao = new javax.swing.JTextField();
        EntradaDias = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTCompraTipo = new javax.swing.JTable();
        LimparButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Tipos de Compra");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipos de Compra");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Qtd. de dias:");

        UpdateButton.setText("Atualizar");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        InsertButton.setText("Salvar");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Excluir");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Fechar");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
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

        LimparButton.setText("Limpar dados");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LimparButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LimparButton)
                        .addGap(18, 18, 18)
                        .addComponent(InsertButton)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(CloseButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão de fechar o programa
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        
        String mensagem = "Deseja encerrar o programa?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0)
            System.exit(0);
        
    }//GEN-LAST:event_CloseButtonActionPerformed

    //Botão Insert: pega os dados inseridos, envia para a função de INSERT na classe DAO e mostra o resultado na tabela
    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        
        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));
        
        //Verificando se o código e a descrição existem
        if ((compraDAO.readCodigo(compra.getCodigo()) != null) && (compraDAO.readDescricao(compra.getDescricao()) != null)){
            JOptionPane.showMessageDialog(null, "O código e a descrição informados já existem!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        //Verificando se o código existe
        if (compraDAO.readCodigo(compra.getCodigo()) != null){
            JOptionPane.showMessageDialog(null, "O código informado já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        //Verificando se a descrição existe
        if (compraDAO.readDescricao(compra.getDescricao()) != null){
            JOptionPane.showMessageDialog(null, "A descrição informada já existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        compraDAO.create(compra);           //Envia os dados para o método na classe DAO
        limparCampos();                     //Apaga os dados dos campos de texto
        readJTCompraTipo();                 //Chama a tabela novamente para atualizá-la
        EntradaCodigo.requestFocus();       //Aponta o cursor para o primeiro campo de texto
        
    }//GEN-LAST:event_InsertButtonActionPerformed

    //Botão Update: pega os dados inseridos, envia para a função de UPDATE na classe DAO e mostra o resultado na tabela
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaDescricao.getText().isEmpty() || EntradaDias.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));
        
        //Verificando se o código existe
        if (compraDAO.readCodigo(compra.getCodigo()) == null){
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        compraDAO.update(compra);
        limparCampos();
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    //Botão Delete: pega os dados inseridos, envia para a função de DELETE na classe DAO e mostra o resultado na tabela
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        if (EntradaCodigo.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Insira o código dos dados que serão excluidos!", "Dados incompletos", JOptionPane.OK_OPTION);
            return;            
        }
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        
        if (compraDAO.readCodigo(compra.getCodigo()) == null){
            JOptionPane.showMessageDialog(null, "O código informado não existe!", "Falha Encontrada", JOptionPane.OK_OPTION);
            return;
        }
        
        compraDAO.delete(compra);
        limparCampos();
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

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

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        
        EntradaCodigo.setText("");
        EntradaDescricao.setText("");
        EntradaDias.setText("");
        readJTCompraTipo();
        EntradaCodigo.requestFocus();
        
    }//GEN-LAST:event_LimparButtonActionPerformed

    //Abrir menu
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaDescricao;
    private javax.swing.JTextField EntradaDias;
    private javax.swing.JButton InsertButton;
    private javax.swing.JTable JTCompraTipo;
    private javax.swing.JButton LimparButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
