package Main;

import CompraTipoDAO.CompraTipoDAO;
import CompraTipo.CompraTipo;
import Interface.Menu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        Menu menu = new Menu();

        menu.setVisible(true);

        }
        
    }
