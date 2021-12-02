package com.Moby.app.Controller;

import com.Moby.app.DAO.Service.ClientService;
import com.Moby.app.Model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * <p> <b> Descripcion : </b> Este ClientFactory, seria mi controlador
 */

@Service
public class ClientFactory {
    @Autowired
    ClientService clientService;

    public int Insert(Client c){
        return this.clientService.Insert(c);
    }

    public boolean Delete(int id){
        return this.clientService.Delete(id);
    }

    public boolean Modify(Client c){
        return this.clientService.Modify(c);
    }
    
    public Client Consult(int id){
        return this.clientService.Consult(id);
    }
    
    public List<Client> GetAll(){
        return this.clientService.GetAll();
    }
}
