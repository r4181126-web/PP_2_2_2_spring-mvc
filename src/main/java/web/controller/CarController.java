package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping("cars")
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String index(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carsToShow;
        if (count == null) {
            carsToShow = carDao.getAllCars();
        } else {
            if (count >= 5) {
                carsToShow = carDao.getAllCars();
            } else {
                carsToShow = carDao.getCars(count);
            }
        }
        model.addAttribute("cars", carsToShow);
        return "cars";
    }
}
