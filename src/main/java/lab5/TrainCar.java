package lab5;

public abstract class TrainCar {
    private int id;

    public TrainCar(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Абстрактні методи, щоб Train міг звертатися до них у циклі
    public abstract int getLuggage();
    public abstract int getCapacity();
}