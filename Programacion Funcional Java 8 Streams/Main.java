/***
 * @author Gil Sosa, Juan - 15 / 11 / 2021
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        
        ArrayList<Car> cars = InitCar();
        
        //Todos los autos 2004
        List<Car> car_2004 = cars.stream().filter(c -> c.getYear() == 2004).collect(Collectors.toList());
        car_2004.forEach(System.out::println);
        System.out.println("======================================================================================");
        
        //SORT
        cars.stream().sorted(Comparator.comparing(Car::getName)).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------");
        cars.stream().sorted(Comparator.comparing(Car::getYear)).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------");
        cars.stream().sorted(Comparator.comparing(Car::getModel)).forEach(System.out::println);

        System.out.println("======================================================================================");
        
        //ALLMATCH all match es como en mysql la keyword ALL donde retorna booleano si todos los elementos cumplen con el predicate
        Boolean bln = cars.stream().allMatch(p -> p.getYear().equals(2004)); // RETURN -> FALSE
        System.out.println("ALL MATCH equals 2004 = "+bln);

        System.out.println("======================================================================================");
        
        //ANYMATCH any match es como en mysql la keyword ANY donde retorna booleano si al menos un elemento cumple con el predicate
        Boolean bln2 = cars.stream().anyMatch(p -> p.getYear().equals(2004)); // RETURN -> TRUE
        System.out.println("ANY MATCH equals 2004 = "+bln2);

        System.out.println("======================================================================================");
        
        //NONEMATCH verifica si ningun elemento del stream coincide con el predicado, es decir, si ninguno coincido (TRUE) 
        Boolean bln3 = cars.stream().noneMatch(p -> p.getYear().equals(9999)); // RETURN -> TRUE
        System.out.println("NONE MATCH equals 9999 = "+bln3);

        System.out.println("======================================================================================");
        
        //MAX
        Car c = cars.stream().max(Comparator.comparing(Car::getYear)).get();
        System.out.println(c.toString());

        System.out.println("======================================================================================");
        
        //MIN
        Car c2 = cars.stream().min(Comparator.comparing(Car::getYear)).get();
        System.out.println(c2.toString());

        System.out.println("======================================================================================");
        
        //GROUP
        Map< String, List<Car> > group = cars.stream().collect(Collectors.groupingBy(Car::getModel));
        group.forEach((key, value) -> {
            System.out.println(" ### " + key + " ### ");
            value.forEach(System.out::println);            
        });
        
        System.out.println("======================================================================================");

        //MAP
        Long a = cars.stream().mapToInt(Car::getYear).filter(i -> i>2001).count();
        System.out.println("Map menores a 2001 = " + a);
        
        System.out.println("======================================================================================");

        //FLATMAP

        ArrayList<Garage> garages = new ArrayList<>();
        
        Garage g1 = new Garage("AVENIDA SIEMPRE VIVA");
        Garage g2 = new Garage("AVENIDA PEDRO LURO");

        garages.add(g1);garages.add(g2);

        //En mi garage 1 quiero que esten todos los autos que su año modelo sea mayor que 2000
        g1.setCars(cars.stream().filter(car -> car.getYear() > 2000).collect(Collectors.toList()));
        //En mi garage 2 quiero que esten todos los autos que su año modelo sea menor que 2000
        g2.setCars(cars.stream().filter(car -> car.getYear() < 2000).collect(Collectors.toList()));
        
        garages.stream().map(g -> g.getCars()).flatMap(car -> car.stream()).map(auto -> auto.getName()).forEach(System.out::println);
        

        

    }  


    public static ArrayList<Car> InitCar(){
        ArrayList<Car> car = new ArrayList<>();
        car.add(new Car("Spazzio", "FIAT", 1990));//car.add(new Car("C3", "CITROEN", 2004));
        car.add(new Car("Chinquechento", "FIAT", 2009));//car.add(new Car("206", "PEOUGOT", 2004));
        car.add(new Car("GTR-34", "NISSAN", 1980));//car.add(new Car("Supra", "TOYOTA", 1990));
        /*car.add(new Car("GTR M3", "BMW", 2001));*/car.add(new Car("Fiesta", "FORD", 2004));
        car.add(new Car("350Z", "NISSAN", 2001));car.add(new Car("K", "FORD", 2004));
        car.add(new Car("370Z", "NISSAN", 2001));car.add(new Car("Falcon", "FORD", 2004));
        return car;
    }

}
