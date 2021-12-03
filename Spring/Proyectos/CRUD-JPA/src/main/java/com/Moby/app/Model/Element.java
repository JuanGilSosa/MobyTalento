package com.Moby.app.Model;

public class Element {
    
    private Integer id;
    private String element;
    private Integer power;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public String getElement() {
        return element;
    }
    public void setElement(String element) {
        this.element = element;
    }
    public Integer getPower() {
        return power;
    }
    public void setPower(Integer power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Element [element=" + element + ", power=" + power + "]";
    }
}
