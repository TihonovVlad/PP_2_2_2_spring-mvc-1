package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Black", 2025));
        cars.add(new Car("Honda", "White", 2025));
        cars.add(new Car("Kia", "Gray", 2025));
        cars.add(new Car("Mazda", "White", 2025));
        cars.add(new Car("BMW", "Black", 2025));
    return cars;
    }
}
