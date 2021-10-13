package CompraTipoDAO;

import Connections.ConexaoBDEstoque;
import CompraTipo.CompraTipo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraTipoDAO {
    
    //Função SQL: SELECT
    public List<CompraTipo> read(CompraTipo c){
        
        try {
            
            //Utiliza a fábrica de conexões para criar uma Connection SQL
            ConexaoBDEstoque conexaoBD = new ConexaoBDEstoque();
            Connection connect = conexaoBD.criarConexao();
            
            //Busca a compra pelo código
            String sql = "SELECT * FROM COMPRATIPO WHERE CODIGO = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setInt(1, c.getCodigo());
            
            List<CompraTipo> list = new ArrayList<CompraTipo>();
            
            ResultSet result = stmt.executeQuery();
            if (result.next()){
                c.setCodigo(result.getInt("codigo"));
                c.setDescricao(result.getString("descricao"));
                c.setDias(result.getInt("dias"));
                list.add(c);
                /*JOptionPane.showMessageDialog(null, "A compra de código " + c.getCodigo() + " é do tipo "
                                    + c.getDescricao() + " que é composta por " + c.getDias() + " dias.");*/
            } else {
                JOptionPane.showMessageDialog(null, "Compra não encontrada!");
            }
            
            connect.close();
            
            return list;
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o banco de dados!");
            e.printStackTrace();
            return null;
            
        }
        
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

    public Iterable<CompraTipo> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
