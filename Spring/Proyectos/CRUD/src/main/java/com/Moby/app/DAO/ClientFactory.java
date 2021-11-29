package com.Moby.app.DAO;

import com.Moby.app.DAO.Service.Imp.ClientImpMySql;
import com.Moby.app.Model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFactory {
    @Autowired
    ClientImpMySql clienteDAO;

    public int Insert(Client c){
        return this.clienteDAO.Insert(c);
    }

    public boolean Delete(int id){
        return this.clienteDAO.Delete(id);
    }

    public boolean Modify(Client c){
        return this.clienteDAO.Modify(c);
    }
    
    public Client Consult(int id){
        return this.clienteDAO.Consult(id);
    }
    
    public List<Client> GetAll(){
        return this.clienteDAO.GetAll();
    }
}
