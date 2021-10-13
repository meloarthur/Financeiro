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
//        Scanner scan = new Scanner(System.in);

        menu.setVisible(true);

        /*
        System.out.println("1 - SELECT\n2 - INSERT\n3 - UPDATE\n4 - DELETE");
        System.out.print("Informe o comando que deseja realizar: ");
        int cod = scan.nextInt();
        System.out.println("---------------------------------");
        
        switch (cod){
            
            case 1:
                System.out.println("Insira o código referencial para pesquisar na tabela: ");
                compra.setCodigo(scan.nextInt());
        
                compraDAO.read(compra);
                break;
            case 2:
                System.out.println("Insira o código da compra: ");
                compra.setCodigo(scan.nextInt());
                System.out.println("Insira o tipo de compra: ");
                compra.setDescricao(scan.next());
                System.out.println("Insira a quantidade de dias: ");
                compra.setDias(scan.nextInt());

                compraDAO.create(compra);
                break;
            case 3:
                System.out.println("Insira o código que identifica a linha a ser alterada: ");
                compra.setCodigo(scan.nextInt());
                System.out.println("Informe a nova descrição: ");
                compra.setDescricao(scan.next());
                System.out.println("Informe a nova quantidade de dias: ");
                compra.setDias(scan.nextInt());

                compraDAO.update(compra);
                break;
            case 4:
                System.out.println("Insira o código da linha a ser excluída: ");
                compra.setCodigo(scan.nextInt());

                compraDAO.delete(compra);
                break;
                
        }
        */
        }
        
    }
