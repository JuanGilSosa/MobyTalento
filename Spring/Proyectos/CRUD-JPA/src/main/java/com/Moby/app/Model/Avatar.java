package com.Moby.app.Model;

import java.util.ArrayList;

public class Avatar {
    
    private Integer id;
    private String name;
    private String age;
    private ArrayList<Element> elements;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public ArrayList<Element> getElements() {
        return elements;
    }
    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Avatar [age=" + age + ", elements=" + elements + ", name=" + name + "]";
    }

}
