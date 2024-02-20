package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("Mersedes", "Benz", 2020));
        listCar.add(new Car("Toyota", "Land Cruiser", 2021));
        listCar.add(new Car("BMW", "X5", 2022));
        listCar.add(new Car("Jaguar", "XF", 2023));
        listCar.add(new Car("Audi", "A8", 2024));
    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> readCar(int n) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newListCar.add(listCar.get(i));
        }
        return newListCar;
    }
}