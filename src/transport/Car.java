package transport;


public class Car extends Transport<DriverB> implements Competitive{

    public Car(String brand, String model, float engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);

    }
    @Override
    public void bestLapTime() {
        System.out.println("лучшее время круга авто " + this.brand + this.model);
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость авто " + this.brand + this.model);
    }
    @Override
    public String toString() {
        return "C марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume + " водитель:" + driver;
    }
}