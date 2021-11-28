package com.Moby.app.DAO.Service;

import com.Moby.app.Model.Cliente;
import java.util.List;

public interface ClienteService {
    public int Insert(Cliente c);
    public boolean Delete(int id);
    public boolean Modify(Cliente c);
    public Cliente Consult(int id);
    public List<Cliente> GetAll();
}
