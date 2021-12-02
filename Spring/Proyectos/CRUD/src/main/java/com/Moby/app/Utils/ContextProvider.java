package com.Moby.app.Utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContextProvider implements ApplicationContextAware {

    private static ApplicationContext context;
    
    @Override
    public void setApplicationContext(ApplicationContext pContext) throws BeansException {
        context = pContext;   
    }

    public static Object GetBean(String name) {
        if(context == null){
            context = new ClassPathXmlApplicationContext("container.xml");
        }
        return context.getBean(name);
    }

    public static <T> T GetBean(String name, Class<T> type) throws RuntimeException{
        if(context == null){
            context = new ClassPathXmlApplicationContext("container.xml");
        }
        return context.getBean(name, type);
    }
}
