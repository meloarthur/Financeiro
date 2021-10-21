package Controllers;

import DAO.CompraTipoDAO;
import Models.CompraTipo;
import java.util.List;

public class ControllerCompraTipo {

    public void create(CompraTipo c){
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        compraDAO.create(c);
    }
    
    public void update(CompraTipo c){
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        compraDAO.update(c);
    }
    
    public void delete(CompraTipo c){
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        compraDAO.delete(c);
    }
    
    public List<CompraTipo> read(){
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        return compraDAO.read();
    }
    
    public CompraTipo readCodigo(int codigo){
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        CompraTipo compra = new CompraTipo();
        return compraDAO.readCodigo(codigo);
    }
    
    public CompraTipo readDescricao(String descricao){
        CompraTipoDAO compraDAO = new CompraTipoDAO();
        CompraTipo compra = new CompraTipo();
        return compraDAO.readDescricao(descricao);
    }
    
}
