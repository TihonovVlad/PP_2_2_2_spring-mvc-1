package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(
            @RequestParam (value = "count", defaultValue = "5")
            int count, ModelMap model) {

        List<Car> resultCars = carService.getCarsCount(count);

        model.addAttribute("cars", resultCars);
        return "cars";
    }

}