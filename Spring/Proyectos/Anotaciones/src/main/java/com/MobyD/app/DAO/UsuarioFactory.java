package com.MobyD.app.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFactory {
    @Autowired
    UsuarioMySQL usr;

    public void add(){
        System.out.println(usr.insertar());
    }
}
