package lab5;

import java.util.List;

public class lab5 {
    public static void main(String[] args) {
        getVariant();
        TrainCar[] myCars = {
                new PassangerCar(1, 36, 3, 100), // id 1, кап 36, комфорт 3
                new PassangerCar(2, 18, 5, 50),  // id 2, кап 18, комфорт 5
                new LugggageCar(3, 1000),        // id 3, кап 0, комфорт н/д
                new PassangerCar(4, 54, 2, 200)  // id 4, кап 54, комфорт 2
        };

        Train train = new Train(new Locomotive(100), myCars);

        // Тест сортування
        System.out.println("--- Сортування (за комфортом 5 -> 2) ---");
        TrainCar[] sorted = train.sortCarsByComfort();
        for (TrainCar c : sorted) {
            if (c instanceof PassangerCar) {
                System.out.println("ID: " + c.getId() + ", Comfort: " + ((PassangerCar) c).getComfort());
            }
        }

        // Тест пошуку
        System.out.println("\n--- Пошук (пасажири від 30 до 40) ---");
        List<TrainCar> found = train.findCarsByPassengerRange(30, 40);
        for (TrainCar c : found) {
            System.out.println("Знайдено вагон ID: " + c.getId() + " (місткість: " + c.getCapacity() + ")");
        }

    }
    public static void getVariant(){
        int id = 5103;
        int c13 = id % 13;
        System.out.println(c13);
    }
}
