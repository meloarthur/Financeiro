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

    //Função SQL: INSERT
    public void create(CompraTipo c){
        
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
            
            JOptionPane.showMessageDialog(null, "A compra " + c.getDescricao() + " foi gravado no BD.");
            connect.close();
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!");
            e.printStackTrace();
            
        }
        
    }
    
    //Função SQL: UPDATE
    public void update(CompraTipo c){
        
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
            
            JOptionPane.showMessageDialog(null, "A compra " + c.getDescricao() + " foi atualizada no BD.");
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!");
            e.printStackTrace();
            
        }
        
    }
    
    //Função SQL: DELETE
    public void delete(CompraTipo c){
        
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
            
            JOptionPane.showMessageDialog(null, "A compra foi removida do BD.");
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!");
            e.printStackTrace();
            
        }
        
    }
    
}
