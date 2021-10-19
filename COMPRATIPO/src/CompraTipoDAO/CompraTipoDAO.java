package CompraTipoDAO;

import Connections.ConexaoBDEstoque;
import CompraTipo.CompraTipo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CompraTipoDAO {
    
    //Função SQL: SELECT (mostrar tabela no banco de dados)
    public List<CompraTipo> read(){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<CompraTipo> list = new ArrayList<>();
        
        try {
            
            stmt = connect.prepareStatement("SELECT * FROM COMPRATIPO");
            result = stmt.executeQuery();
            
            while (result.next()){
                
                CompraTipo compra = new CompraTipo();
                
                compra.setCodigo(result.getInt("CODIGO"));
                compra.setDescricao(result.getString("DESCRICAO"));
                compra.setDias(result.getInt("DIAS"));
                list.add(compra);
                
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(CompraTipoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return list;
        
    }
    
    public CompraTipo readCodigo(int codigo){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        try {
            
            String sql = "SELECT * FROM COMPRATIPO WHERE CODIGO = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                CompraTipo compra = new CompraTipo();
                
                compra.setCodigo(codigo);
                
                return compra;
                
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
    
    public CompraTipo readDescricao(String descricao){
        
        ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
        Connection connect = conexaoBD.criarConexao();
        
        try {
            
            String sql = "SELECT * FROM COMPRATIPO WHERE DESCRICAO = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, descricao);
            
            ResultSet result = stmt.executeQuery();
            
            if (result.next()){
                
                CompraTipo compra = new CompraTipo();
                
                compra.setDescricao(descricao);
                
                return compra;
                
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
    public void create(CompraTipo c){
        
        String mensagem = "Deseja salvar os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
        
            try {

                //Utiliza a fábrica de conexões para criar uma Connection SQL
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                //Cria um PreparedStatement baseado em uma string SQL
                String sql = "INSERT INTO COMPRATIPO(CODIGO, DESCRICAO, DIAS) VALUES (?,?,?)";
                PreparedStatement stmt = connect.prepareStatement(sql);

                //Preenche os valores
                stmt.setInt(1, c.getCodigo());
                stmt.setString(2, c.getDescricao());
                stmt.setInt(3, c.getDias());

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
    public void update(CompraTipo c){
        
        String mensagem = "Deseja atualizar os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
        
            try {

                //Utiliza a fábrica de conexões para criar uma Connection SQL
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                //Cria um PreparedStatement baseado em uma string SQL
                String sql = "UPDATE COMPRATIPO SET DESCRICAO = ?, DIAS = ? WHERE CODIGO = ?";
                PreparedStatement stmt = connect.prepareStatement(sql);

                //Preenche os valores
                stmt.setInt(3, c.getCodigo());
                stmt.setString(1, c.getDescricao());
                stmt.setInt(2, c.getDias());

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
    public void delete(CompraTipo c){
        
        String mensagem = "Deseja excluir os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);
        
        if (res == 0){
        
            try {

                //Utiliza a fábrica de conexões para criar uma Connection SQL
                ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
                Connection connect = conexaoBD.criarConexao();

                //busca a compra pelo código
                String sql = "DELETE FROM COMPRATIPO WHERE CODIGO = ?";
                PreparedStatement stmt = connect.prepareStatement(sql);
                stmt.setInt(1, c.getCodigo());

                //Executar comando SQL
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
