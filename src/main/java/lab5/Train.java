package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Train {
    private TrainCar[] cars;
    private Locomotive locomotive;

    public Train(Locomotive locomotive, TrainCar[] cars) {
        this.locomotive = locomotive;
        this.cars = cars;
    }

    public int calculateTotalCapacity() {
        int total = 0;
        if (cars != null) {
            for (TrainCar car : cars) {
                total += car.getCapacity();
            }
        }
        return total;
    }


    public int calculateTotalLuggage() {
        int total = 0;
        if (cars != null) {
            for (TrainCar car : cars) {
                total += car.getLuggage();
            }
        }
        return total;
    }

    public TrainCar[] sortCarsByComfort() {
        TrainCar[] sortedCars = Arrays.copyOf(cars, cars.length);
        Arrays.sort(sortedCars, (c1, c2) -> {
            int comfort1 = (c1 instanceof PassangerCar) ? ((PassangerCar) c1).getComfort() : -1;
            int comfort2 = (c2 instanceof PassangerCar) ? ((PassangerCar) c2).getComfort() : -1;
            return Integer.compare(comfort2, comfort1); // Від більшого до меншого
        });

        return sortedCars;
    }


    public List<TrainCar> findCarsByPassengerRange(int min, int max) {
        List<TrainCar> foundCars = new ArrayList<>();

        for (TrainCar car : cars) {
            int capacity = car.getCapacity();
            if (capacity >= min && capacity <= max) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
}