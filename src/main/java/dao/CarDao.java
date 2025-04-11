package dao;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarDao {
    List<Car> getAllCars();
}
