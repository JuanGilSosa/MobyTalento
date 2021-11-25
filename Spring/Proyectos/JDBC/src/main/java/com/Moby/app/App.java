package com.Moby.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
        FabricanteImp eImp = (FabricanteImp)context.getBean("fabricanteImp");
        Fabricante fabricante = new Fabricante();
        fabricante.setNombre("salamandra");
        fabricante.setCodigo("0");
        if(eImp.insertarFabricante(fabricante)){
            System.out.println("Fabricante Cargado con exito");
        }
        //eImp.consultarFabricante();
    }
}
