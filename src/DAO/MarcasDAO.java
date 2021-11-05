package DAO;

import Connections.ConexaoBDEstoque;
import Models.Marcas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MarcasDAO {

    //Função SQL: SELECT (mostrar lista completa)
    public List<Marcas> read(){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Marcas> list = new ArrayList<>();
        
        try {
            
            stmt = connect.prepareStatement("SELECT * FROM MARCAS ORDER BY CODIGO ASC");
            result = stmt.executeQuery();
            
            while (result.next()){
                
                Marcas marcas = new Marcas();
                
                marcas.setCodigo(result.getString("CODIGO"));
                marcas.setNome(result.getString("NOME"));
                list.add(marcas);
                
            }
            
        } catch (SQLException e){
            
            e.printStackTrace();
            
        }
        
        return list;
        
    }
    
    public Marcas readLine(Marcas m){
        
        try {
            
            ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
            Connection connect = conexaoBD.criarConexao();
            
            String sql = "SELECT * FROM MARCAS WHERE NOME LIKE '%" + m.getNome() + "%'";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                Marcas marcas = new Marcas();
                
                marcas.setCodigo(result.getString("CODIGO"));
                marcas.setNome(result.getString("NOME"));
                
                return marcas;
                
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
    public Marcas readCodigo(String codigo){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        try {
            
            String sql = "SELECT * FROM MARCAS WHERE CODIGO = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, codigo);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                Marcas marcas = new Marcas();
                
                marcas.setCodigo(codigo);
                
                return marcas;
                
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
    public Marcas readNome(String nome){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        try {
            
            String sql = "SELECT * FROM MARCAS WHERE NOME = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, nome);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                Marcas marcas = new Marcas();
                
                marcas.setNome(nome);
                
                return marcas;
                
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
    public void create(Marcas m){
        
        String mensagem = "Deseja salvar os dados?";
        String title = "Confirmar Operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
            
            try {
                
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                String sql = "INSERT INTO MARCAS VALUES (?,?)";
                PreparedStatement stmt = connect.prepareStatement(sql);

                stmt.setString(1, m.getCodigo());
                stmt.setString(2, m.getNome());

                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
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
    public void update(Marcas m){
        
        String mensagem = "Deseja atualizar os dados?";
        String title = "Confirmar Operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
            
            try {
                
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                String sql = "UPDATE MARCAS SET NOME = ? WHERE CODIGO = ?";
                PreparedStatement stmt = connect.prepareStatement(sql);

                stmt.setString(2, m.getCodigo());
                stmt.setString(1, m.getNome());

                stmt.executeUpdate();
                stmt.close();

                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
                connect.close();
                
            } catch (SQLException e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
    }
    
    //Função SQL: DELETE
    public void delete(Marcas m){
        
        String mensagem = "Deseja excluir os dados?";
        String title = "Confirmar Operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
            
            try {
                
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                String sql = "DELETE FROM MARCAS WHERE CODIGO = ?";
                PreparedStatement stmt = connect.prepareStatement(sql);

                stmt.setString(1, m.getCodigo());

                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
                connect.close();
                
            } catch (SQLException e){
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
    }
    
}
