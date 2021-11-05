package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBDEstoque {

    public static Connection criarConexao() {

        try {

            final String driver = "org.firebirdsql.jdbc.FBDriver";
            Class.forName(driver);

            final String path = "jdbc:firebirdsql:";
            final String database = "172.16.15.4:/servidor/dbtestes/saecbco.fdb";
            final String encode = "?encoding=ISO8859_1";
            final String user = "SYSDBA";
            final String pwd = "@epoca0$";
            final String url = path + database + encode;

            return DriverManager.getConnection(url, user, pwd);

        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o driver de acesso ao banco de dados.");
            e.printStackTrace();
            return null;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco de dados.");
            e.printStackTrace();
            return null;

        }

    }

    public static void close() throws ClassNotFoundException, SQLException, Exception {
        criarConexao().close();
    }

}
