package com.Moby.app.Model;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
*/
//@Entity
//@Table(name="cliente")
public class Client {

    /*@Id @Column(name="id")*/     private Integer id;    
    /*    @Column(name="nombre")*/ private String  name;
    
    public Integer getId()              { return id;        }
    public void    setId(Integer id)    { this.id = id;     }
    public String  getName()            { return name;      }
    public void    setName(String name) { this.name = name; } 

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", name=" + name + "]";
    }
}