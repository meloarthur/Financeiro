package Controllers;

import DAO.DIGCMPDAO;
import Models.DIGCMP;
import java.util.List;

public class ControllerDIGCMP {
    
    public List<DIGCMP> read(){
        DIGCMPDAO digcmpDAO = new DIGCMPDAO();
        return digcmpDAO.read();
    }
    
    public DIGCMP readCodigo(String codigo){
        DIGCMPDAO digcmpDAO = new DIGCMPDAO();
        return digcmpDAO.readCodigo(codigo);
    }
    
    public DIGCMP readNome(String nome){
        DIGCMPDAO digcmpDAO = new DIGCMPDAO();
        return digcmpDAO.readNome(nome);
    }
    
    public void create(DIGCMP d){
        DIGCMPDAO digcmpDAO = new DIGCMPDAO();
        digcmpDAO.create(d);
    }
    
    public void update(DIGCMP d){
        DIGCMPDAO digcmpDAO = new DIGCMPDAO();
        digcmpDAO.update(d);
    }
    
    public void delete(DIGCMP d){
        DIGCMPDAO digcmpDAO = new DIGCMPDAO();
        digcmpDAO.delete(d);
    }
    
}
