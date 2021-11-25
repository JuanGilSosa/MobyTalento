package com.Moby.app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductoImp implements ProductoService{

    javax.sql.DataSource datasource;

    public void setDatasource(javax.sql.DataSource datasource){
        this.datasource = datasource;
    }

    @Override
    public boolean insertarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) values(?,?,?)";
        try{
            Connection conn = datasource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getPrecio().toString());
            ps.setString(3, producto.getCodigoFabricante());

            return ps.execute();
        }catch(java.sql.SQLException ignore){ /***/ }
        return false;
    }

    @Override
    public void consultarProducto() {
        
        
    }
    
}
