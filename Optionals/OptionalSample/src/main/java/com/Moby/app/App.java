package com.Moby.app;

import static java.lang.System.out;

import java.util.List;
import java.util.Arrays;
import com.Moby.app.Model.*;
import java.util.Optional;


public class App {
    public static void main( String[] args ){
        
        List<String> list = Arrays.asList(
            "Carlos", "Alicia", "Mercedez", 
            "Cristian","Gonzalo","Debora"
        );
        
        
        Optional<String> opt = list.stream().filter(n -> n.equals("Alicia")).findFirst();
        opt.ifPresent(name -> System.out.println(name));
        
        //Filtro informacion, y si si esta presente, ejecuto una lambda mostrando el dato
        list.stream()
            .filter(n -> n.equals("Alicia"))
            .findFirst()
            .ifPresent(out::println);
        
        /* 
            En este caso, dado el filtro que name.equals("Cristina"), por lo que findAny 
            me devuelve un Optional vacio, entonces al usar orElse que si el Optional, en este
            caso esta vacio, seteara la informacion argumentada.
        */
        String javaHome = list.stream()
            .filter(name -> name.equals("Cristina"))
            .findAny()                              //Mi optional
            .orElse("%JAVA_HOME%");

        out.println(javaHome); //OUTPUT: %JAVA_HOME%

        /*
            Este findFirst me devuelve un Optional con informacion
            por lo que orElse devolvera su informacion [Gonzalo]
        */
        String gonzalo = list.stream()
            .filter(name -> name.equals("Gonzalo"))
            .findFirst()
            .orElse("Debora");
        
        out.println(gonzalo); //OUTPUT: Gonzalo

        Person person = new Person();

        Optional<String> name = list.stream().filter( n -> n.equals("Gonzalo")).findFirst();
        name.ifPresent(g -> person.setName(g));

        out.println(person.getName());
    }
}
