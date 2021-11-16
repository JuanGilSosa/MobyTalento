import java.util.ArrayList;
import java.util.List;
public class Garage {

    private String dir;
    private List<Car> cars;
    
    public Garage(String dir){
        this.dir = dir;
        cars = new ArrayList<>();
    }
    
    public List<Car> getCars()         { return this.cars; }
    public void setCars(List<Car> cars){ this.cars = cars; }
    public String getDir()                  {return this.dir;}
    public void addCar(Car car)             { cars.add(car); }
}
