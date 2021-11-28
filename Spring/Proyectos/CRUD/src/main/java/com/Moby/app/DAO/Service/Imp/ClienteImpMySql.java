package com.Moby.app.DAO.Service.Imp;

import java.util.List;
import java.util.ArrayList;

import com.Moby.app.DAO.Service.ClienteService;
import com.Moby.app.Model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

@Service
public class ClienteImpMySql implements ClienteService{
    @Autowired
    DataSource datasource;
    /*
    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }
    */

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
    public int Insert(Cliente c) {
        try{
            int id = -1;
            String sql = "INSERT INTO cliente(nombre) VALUES (?)";
            
            Connection conn = datasource.getConnection();
            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1,c.getNombre());
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
    public boolean Modify(Cliente c) {
        return false;
    }

    @Override
    public Cliente Consult(int id) {
        try{
            String sql = "SELECT * FROM cliente WHERE id = "+id;
            Connection conn = datasource.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Cliente aux = new Cliente();
            while(rs.next()){
                aux.setId(Integer.parseInt(rs.getObject("id").toString()) );
                aux.setNombre(rs.getObject("nombre").toString());
            }
            return aux;
        }catch(SQLException ignore){ System.out.println("Error al Consultar por ID"); }
        return new Cliente();
    }

    @Override
    public List<Cliente> GetAll() {
        List<Cliente> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM cliente";
            Connection conn = datasource.getConnection();
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Cliente aux = new Cliente();
                aux.setId(Integer.parseInt(rs.getObject("id").toString()) );
                aux.setNombre(rs.getObject("nombre").toString());
                list.add(aux);
            }
        }catch(SQLException e){ System.out.println("Error al Consultar Todos msg = "+e.getMessage()); }
        return list;
    }
}