package org.example; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInventory {

    Map<String, Car> cars = new HashMap<>();

    public CarInventory() {

    }

    public void addCar(Car car) {
        if (car == null || cars.containsKey(car.getModel())) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        cars.put(car.getModel(), car);
    }

    public Car getCar(String model) {
        return cars.get(model);
    }

    public Car sellCar(String model) {
        return cars.remove(model);
    }

    public void updateCarPrice(String model, double newPrice) {
        Car car = cars.get(model);
        if (car != null) {
            car.setPrice(newPrice);
        }
    }

    public List<Car> findCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getMake().equals(make)) {
                foundCars.add(car);
            }
        }
        return foundCars;
    }

    public int getCarCount() {
        return cars.size();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}