package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCarsCount(int count) {
        List<Car> cars = carDao.getAllCars();
        return cars.subList(0, Math.min(count, cars.size()));
        }
}

