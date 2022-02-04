package DAO;

import connections.ConexaoBDEstoque;
import Models.DIGCMP;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DIGCMPDAO {
  
    //Função SQL: SELECT (mostrar lista completa)
    public List<DIGCMP> read(){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<DIGCMP> list = new ArrayList<>();
        
        try {
            
            stmt = connect.prepareStatement("SELECT * FROM DIGCMP ORDER BY CODIGO ASC");
            result = stmt.executeQuery();
            
            while (result.next()){
                
                DIGCMP digcmp = new DIGCMP();
                
                digcmp.setCodigo(result.getString("CODIGO"));
                digcmp.setNome(result.getString("NOME"));
                list.add(digcmp);
                
            }
            
        } catch (SQLException e){
            
            e.printStackTrace();
            
        }
        
        return list;
        
    }
    
    //Função SQL: SELECT (fazer consulta por linha específica)
    public DIGCMP readLine(DIGCMP d){
        
        try {
            
            ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
            Connection connect = conexaoBD.criarConexao();
            
            String sql = "SELECT * FROM DIGCMP WHERE NOME LIKE '%" + d.getNome() + "%'";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                DIGCMP digcmp = new DIGCMP();
                
                digcmp.setCodigo(result.getString("CODIGO"));
                digcmp.setNome(result.getString("NOME"));
                
                return digcmp;
                
            } else {
                
                connect.close();
                return null;
                
            }
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    //Função SQL: SELECT (verifica se o código inserido existe)
    public DIGCMP readCodigo(String codigo){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        try {
            
            String sql = "SELECT * FROM DIGCMP WHERE CODIGO = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, codigo);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                DIGCMP digcmp = new DIGCMP();
                
                digcmp.setCodigo(codigo);
                
                return digcmp;
                
            } else {
                
                connect.close();
                return null;
                
            }
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            e.printStackTrace();
            
            return null;
            
        }
        
    }
    
    //Função SQL: SELECT (verifica se o nome inserido existe)
    public DIGCMP readNome(String nome){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        try {
            
            String sql = "SELECT * FROM DIGCMP WHERE NOME = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, nome);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                DIGCMP digcmp = new DIGCMP();
                
                digcmp.setNome(nome);
                
                return digcmp;
            } else {
                connect.close();
                return null;
            }
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            e.printStackTrace();
            
            return null;
            
        }
        
    }
    
    //Função SQL: INSERT
    public void create(DIGCMP d){
        
        String mensagem = "Deseja salvar os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
            
            try {
                
                //Utiliza a fábrica de conexões para criar uma Connection SQL
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();
                
                //Cria um PreparedStatement baseado em uma string SQL
                String sql = "INSERT INTO DIGCMP (CODIGO, NOME) VALUES (?,?)";
                PreparedStatement stmt = connect.prepareStatement(sql);
                
                //Preenche os valores
                stmt.setString(1, d.getCodigo());
                stmt.setString(2, d.getNome());
                
                //Executar comando SQL
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Operação Concluida", JOptionPane.INFORMATION_MESSAGE);
                connect.close();
                
            } catch (SQLException e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
    }
    
    //Função SQL: UPDATE
    public void update(DIGCMP d){
        
        String mensagem = "Deseja atualizar os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
            
            try {
                
                //Utiliza a fábrica de conexões para criar uma Connection SQL
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();
                
                //Cria um PreparedStatement baseado em uma string SQL
                String sql = "UPDATE DIGCMP SET NOME = ? WHERE CODIGO = ?";
                PreparedStatement stmt = connect.prepareStatement(sql);
                
                //Preenche os valores
                stmt.setString(1, d.getNome());
                stmt.setString(2, d.getCodigo());
                
                //Executar comando SQL
                stmt.executeUpdate();
                stmt.close();
                connect.close();
                
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Operação Concluida", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
    }
    
    //Função SQL: DELETE
    public void delete(DIGCMP d){
        
        String mensagem = "Deseja excluir os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
            
            try {
                
                //Utiliza a fábrica de conexões para criar uma Connection SQL
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                //busca a compra pelo código
                String sql = "DELETE FROM DIGCMP WHERE CODIGO = ?";
                PreparedStatement stmt = connect.prepareStatement(sql);
                stmt.setString(1, d.getCodigo());
                
                stmt.execute();
                stmt.close();
                connect.close();
                
                JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Operação Concluida", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
    }
    
}
