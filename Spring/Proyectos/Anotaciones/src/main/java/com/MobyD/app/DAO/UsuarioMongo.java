package com.MobyD.app.DAO;

import org.springframework.stereotype.Service;

@Service
public class UsuarioMongo implements UsuarioService{
    @Override
    public String insertar(){
        return "Insertando Usuario con MongoDB";
    }
}