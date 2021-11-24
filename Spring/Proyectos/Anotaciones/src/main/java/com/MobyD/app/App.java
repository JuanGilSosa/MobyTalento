package com.MobyD.app;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.MobyD.app.DAO.UsuarioFactory;

public class App 
{
    public static void main( String[] args )
    {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
            UsuarioFactory usrFactory = (UsuarioFactory)context.getBean("usuarioFactory");
            usrFactory.add();
        }catch(BeansException be){
            System.out.println("EXCEPTION = "+be.getMessage());
        }
        
        
    }
}
