package com.Moby.app.DAO.Service.Imp;

import java.util.List;
import java.util.ArrayList;

import com.Moby.app.DAO.Service.ClientService;
import com.Moby.app.Model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

@Service
public class ClientImpMySql implements ClientService{
    @Autowired
    DataSource datasource;

    /**
     * <p> <b> Descripcion: </b> Luego de comenzar la conexión se usa un 
     * PreparedStatement poniendo como seguro parametro de su metodo prepareStatment
     *  arg1 = Statement.RETURN_GENERATED_KEYS
     * Asi cuando llamo al metodo .getGeneratedKeys() obtengo un ResultSet con keys 
     * generadas
     * 
     * Si no se logra la insersion o falla, se retorna -1;
     * 
     * @param c Es el cliente que se insertara
     * @return int id del usuario insertado
     */
    @Override
    public int Insert(Client c) {
        try{
            int id = -1;
            String sql = "INSERT INTO cliente(nombre) VALUES (?)";
            
            Connection conn = datasource.getConnection();
            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1,c.getName());
            st.execute();

            ResultSet rs = st.getGeneratedKeys();
            if(rs.next()){
                id = rs.getInt(1);
            }
            
            conn.close();
            
            return id;
        }catch(SQLException ignore){ System.out.println("Error al Agregar"); }
        return -1;
    }

    @Override
    public boolean Delete(int id) {
        try{
            String sql = "DELETE FROM cliente WHERE id = ?";

            Connection conn = datasource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(id));
            boolean bln = ps.execute();
            conn.close();
            return bln;
        }catch(SQLException ignore){ System.out.println("Error al Eliminar"); }
        return false;
    }

    @Override
    public boolean Modify(Client c) {
        try{
            String sql = "UPDATE cliente SET nombre = ? WHERE id = ?";
            Connection conn = datasource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, String.valueOf(c.getId()));
            ps.execute();
            conn.close();
            return true;
        }catch(SQLException e){
            System.out.println("Error al Modificar = "+e.getMessage());
        }
        return false;
    }

    @Override
    public Client Consult(int id) {
        try{
            String sql = "SELECT * FROM cliente WHERE id = "+id;
            Connection conn = datasource.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Client aux = new Client();
            while(rs.next()){
                aux.setId(Integer.parseInt(rs.getObject("id").toString()) );
                aux.setName(rs.getObject("nombre").toString());
            }
            conn.close();
            return aux;
        }catch(SQLException ignore){ System.out.println("Error al Consultar por ID"); }
        return new Client();
    }

    @Override
    public List<Client> GetAll() {
        List<Client> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM cliente";
            Connection conn = datasource.getConnection();
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Client aux = new Client();
                aux.setId(Integer.parseInt(rs.getObject("id").toString()) );
                aux.setName(rs.getObject("nombre").toString());
                list.add(aux);
            }
            conn.close();
        }catch(SQLException e){ System.out.println("Error al Consultar Todos msg = "+e.getMessage()); }
        return list;
    }
}