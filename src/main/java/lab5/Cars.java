package lab5;

class PassangerCar extends TrainCar {
    private int capacity;
    private int comfort;
    private int luggage;

    public PassangerCar(int id, int capacity, int comfort, int luggage) {
        super(id);
        this.capacity = capacity;
        this.comfort = comfort;
        this.luggage = luggage;
    }

    @Override
    public int getCapacity() {
        return capacity; }

    @Override
    public int getLuggage() {
        return luggage; }

    public int getComfort() {
        return comfort; }
}

class LugggageCar extends TrainCar {
    private int luggage;

    public LugggageCar(int id, int luggage) {
        super(id);
        this.luggage = luggage;
    }

    @Override
    public int getLuggage() {
        return luggage;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
class Locomotive {
    private int power;

    public Locomotive(int power) {
        this.power = power;
    }
}