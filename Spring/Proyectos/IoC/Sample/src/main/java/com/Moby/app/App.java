package com.Moby.app;

import com.Moby.app.Models.Conductor;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
    public static void main(String[] args) {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
            BeanFactory factory = context;

            Conductor conductor = (Conductor) factory.getBean("conducir");
            System.out.println(conductor.conducir());
        }catch(BeanCreationException | BeanInstantiationException e){
            System.out.println(e);
        }


    }
}
