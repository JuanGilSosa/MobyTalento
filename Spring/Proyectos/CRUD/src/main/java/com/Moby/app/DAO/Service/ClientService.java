package com.Moby.app.DAO.Service;

import com.Moby.app.Model.Client;

import java.util.List;

public interface ClientService {
    public int Insert(Client c);
    public boolean Delete(int id);
    public boolean Modify(Client c);
    public Client Consult(int id);
    public List<Client> GetAll();
}
