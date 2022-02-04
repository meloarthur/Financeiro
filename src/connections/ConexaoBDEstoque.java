package connections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class ConexaoBDEstoque {

    public static Connection criarConexao() {

        try {

            Properties prop = new Properties();
            String filePath = "src/properties/conf.properties";
            File file = new File(filePath);
            String path = file.getPath();
            FileInputStream is = new FileInputStream(filePath);
            prop.load(is);
            final String url = prop.getProperty("path") + prop.getProperty("database") + prop.getProperty("encode");

            return DriverManager.getConnection(url, prop.getProperty("user"), prop.getProperty("pwd"));

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco de dados.");
            e.printStackTrace();
            return null;

        } catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco de dados.");
            e.printStackTrace();
            return null;
            
        }

    }

    public static void close() throws ClassNotFoundException, SQLException, Exception {
        criarConexao().close();
    }

}
