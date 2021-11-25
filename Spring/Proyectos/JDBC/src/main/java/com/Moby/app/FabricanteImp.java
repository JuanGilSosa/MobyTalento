package com.Moby.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FabricanteImp implements FabricanteService{

    private javax.sql.DataSource datasource;

    public void setDatasource(javax.sql.DataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public boolean insertarFabricante(Fabricante fabricante){
        String query = "INSERT INTO fabricante(nombre) values(?)";
        try{
            Connection conn = datasource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, fabricante.getNombre());

            return ps.execute();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void consultarFabricante(){
        String query = "SELECT * FROM fabricante";
        try{
            Connection conn = datasource.getConnection();
            ResultSet rs = conn.createStatement().executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("nombre") + " | " + rs.getString("codigo"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}