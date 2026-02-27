package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceimpl implements CarService {
    private final CarDao carDao;

    public CarServiceimpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}