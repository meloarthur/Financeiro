package Controllers;

import DAO.MarcasDAO;
import Models.Marcas;
import java.util.List;

public class ControllerMarcas {

    public List<Marcas> read(){
        MarcasDAO marcasDAO = new MarcasDAO();
        return marcasDAO.read();
    }
    
    public Marcas readLine(Marcas m){
        MarcasDAO marcasDAO = new MarcasDAO();
        return marcasDAO.readLine(m);
    }
    
    public Marcas readCodigo(String codigo){
        MarcasDAO marcasDAO = new MarcasDAO();
        return marcasDAO.readCodigo(codigo);
    }
    
    public Marcas readNome(String nome){
        MarcasDAO marcasDAO = new MarcasDAO();
        return marcasDAO.readNome(nome);
    }
    
    public void create(Marcas m){
        MarcasDAO marcasDAO = new MarcasDAO();
        marcasDAO.create(m);
    }
    
    public void update(Marcas m){
        MarcasDAO marcasDAO = new MarcasDAO();
        marcasDAO.update(m);
    }
    
    public void delete(Marcas m){
        MarcasDAO marcasDAO = new MarcasDAO();
        marcasDAO.delete(m);
    }
    
}
