package com.Moby.app.Controller;

import com.google.protobuf.Type;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContextProvider implements ApplicationContextAware {

    private static ApplicationContext context;// = new ClassPathXmlApplicationContext("container.xml");
    
    @Override
    public void setApplicationContext(ApplicationContext pContext) throws BeansException {
        context = pContext;   
    }

    public static Object GetBean(String name) throws RuntimeException{
        if(context == null){
            context = new ClassPathXmlApplicationContext("container.xml");
            //throw new RuntimeException("Context NULL");
        }
        return context.getBean(name);
    }

    public static <T> T GetBean(String name, Class<T> type) throws RuntimeException{
        if(context == null){
            throw new RuntimeException("Context NULL");
        }
        return context.getBean(name, type);
    }
}
