package lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class lab5Test {

    private Train train;
    private PassangerCar car1;
    private PassangerCar car2;
    private LugggageCar lugCar;

    @BeforeEach
    void setUp() {
        // Створюємо тестові дані перед кожним тестом
        car1 = new PassangerCar(1, 36, 3, 100); // ID 1, Кап 36, Комфорт 3, Багаж 100
        car2 = new PassangerCar(2, 18, 5, 50);  // ID 2, Кап 18, Комфорт 5, Багаж 50
        lugCar = new LugggageCar(3, 1000);      // ID 3, Кап 0, Багаж 1000

        TrainCar[] cars = {car1, car2, lugCar};
        train = new Train(new Locomotive(5000), cars);
    }

    @Test
    @DisplayName("Перевірка загальної кількості пасажирів")
    void testCalculateTotalCapacity() {
        int expectedCapacity = 36 + 18 + 0;
        assertEquals(expectedCapacity, train.calculateTotalCapacity(),
                "Загальна місткість повинна бути сумою місткостей усіх вагонів");
    }

    @Test
    @DisplayName("Перевірка загальної ваги багажу (пасажирські + багажні)")
    void testCalculateTotalLuggage() {
        int expectedLuggage = 100 + 50 + 1000;
        assertEquals(expectedLuggage, train.calculateTotalLuggage(),
                "Загальний багаж має враховувати і пасажирські, і спеціальні багажні вагони");
    }

    @Test
    @DisplayName("Перевірка сортування за рівнем комфортності")
    void testSortCarsByComfort() {
        TrainCar[] sorted = train.sortCarsByComfort();

        // Очікуємо порядок: car2 (5), car1 (3), lugCar (-1)
        assertAll("Сортування має бути від найвищого комфорту до найнижчого",
                () -> assertEquals(2, sorted[0].getId(), "Першим має бути вагон з комфортом 5"),
                () -> assertEquals(1, sorted[1].getId(), "Другим має бути вагон з комфортом 3"),
                () -> assertEquals(3, sorted[2].getId(), "Останнім має бути не пасажирський вагон")
        );
    }

    @Test
    @DisplayName("Пошук вагона за діапазоном пасажирів")
    void testFindCarsByPassengerRange() {
        // Шукаємо вагон, де від 10 до 20 пасажирів (має знайти car2 з 18)
        List<TrainCar> result = train.findCarsByPassengerRange(10, 20);

        assertEquals(1, result.size(), "Має бути знайдено рівно один вагон");
        assertEquals(2, result.get(0).getId(), "Знайдений вагон повинен мати ID 2");
    }

    @Test
    @DisplayName("Пошук у діапазоні, де немає вагонів")
    void testFindCarsByPassengerRangeEmpty() {
        List<TrainCar> result = train.findCarsByPassengerRange(100, 200);
        assertTrue(result.isEmpty(), "Список має бути порожнім, якщо жоден вагон не підходить");
    }
}