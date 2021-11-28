package com.Moby.app.DAO;

import com.Moby.app.DAO.Service.Imp.ClienteImpMySql;
import com.Moby.app.Model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteFactory {
    @Autowired
    ClienteImpMySql clienteDAO;

    /*
    public void setClienteDAO(ClienteMySqlDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }
    */
    public int Insert(Cliente c){
        return this.clienteDAO.Insert(c);
    }

    public boolean Delete(int id){
        return this.clienteDAO.Delete(id);
    }

    public boolean Modify(Cliente c){
        return this.clienteDAO.Modify(c);
    }
    
    public Cliente Consult(int id){
        return this.clienteDAO.Consult(id);
    }
    
    public List<Cliente> GetAll(){
        return this.clienteDAO.GetAll();
    }
}
