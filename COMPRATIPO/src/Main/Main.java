package Main;

import CompraTipoDAO.CompraTipoDAO;
import CompraTipo.CompraTipo;
import Interface.Menu;

public class Main {

    //Abrir menu
    public static void main(String[] args) {

        CompraTipo compra = new CompraTipo();
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        Menu menu = new Menu();

        menu.setVisible(true);

        }
        
    }
