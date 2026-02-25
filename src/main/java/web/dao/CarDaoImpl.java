package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        List<Car> avto = new ArrayList<>();
        avto.add(new Car(1, "Nissan","blue"));
        avto.add(new Car(2, "Mazda", "red"));
        avto.add(new Car(3, "Lada", "black"));
        avto.add(new Car(4, "Chery", "green"));
        avto.add(new Car(5, "Haval","yellow"));

        this.cars = Collections.unmodifiableList(avto);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count<= 0) {
            return Collections.emptyList();
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
