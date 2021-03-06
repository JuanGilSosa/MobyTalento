package com.Moby.app.Model;

public class Person {
    
    private String name;
    private Integer age;
    
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Person(){
        this("", 0);
    }
    
    public void setName(String name){this.name = name;}
    public void setAge(Integer age){this.age = age;}
    public Integer getAge(){return age;}
    public String getName(){return name;}

    @Override
    public String toString(){
        return String.format("Person: nombre = %s | Edad = %d", name, age);
    }
}
