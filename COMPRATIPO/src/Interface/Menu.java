package Interface;

import CompraTipo.CompraTipo;
import CompraTipoDAO.CompraTipoDAO;
import java.awt.Color;
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
    }
    
    //Criando na tela a tabela do banco de dados
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - COMPRATIPO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Insira os dados e escolha o comando SQL:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Qtd. de dias:");

        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        InsertButton.setText("INSERT");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("DELETE");
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
        jScrollPane1.setViewportView(JTCompraTipo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(InsertButton)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(CloseButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    //Botão de fechar o programa
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    //Botão Insert: pega os dados inseridos, envia para a função de INSERT na classe DAO e mostra o resultado na tabela
    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));
        compraDAO.create(compra);
        
        readJTCompraTipo();
        
    }                                            

    //Botão Update: pega os dados inseridos, envia para a função de UPDATE na classe DAO e mostra o resultado na tabela
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compra.setDescricao(EntradaDescricao.getText());
        compra.setDias(Integer.parseInt(EntradaDias.getText()));
        compraDAO.update(compra);
        
        readJTCompraTipo();
        
    }                                            

    //Botão Delete: pega os dados inseridos, envia para a função de DELETE na classe DAO e mostra o resultado na tabela
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        
        compra.setCodigo(Integer.parseInt(EntradaCodigo.getText()));
        compraDAO.delete(compra);
        
        readJTCompraTipo();
        
    }                                            

    //Abrir menu
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaDescricao;
    private javax.swing.JTextField EntradaDias;
    private javax.swing.JButton InsertButton;
    private javax.swing.JTable JTCompraTipo;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
