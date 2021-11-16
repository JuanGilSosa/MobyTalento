public class Car {
    private String name;
    private String model;
    private Integer year;

    public Car(String name, String model, Integer year){
        this.name = name; this.model = model; this.year = year;
    }
    public Car(){
        this("","",0);
    }
    public void setName(String name)   { this.name = name;  }
    public void setModel(String model) { this.model = model;}
    public void setYear(Integer year)  { this.year = year;  }

    public String getName()  { return name; }
    public String getModel() { return model;}
    public Integer getYear() { return year; }

    @Override
    public String toString(){
        return "Car{ name ="+name+
        " model = "+model+
        " year = "+year+ 
        "}";
    }
}
