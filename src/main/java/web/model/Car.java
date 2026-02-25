package web.model;

import org.springframework.stereotype.Component;
import java.util.Objects;

public class Car {
    private int series;
    private String model;
    private String color;

    public Car(int series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }
    public Car(){}

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
