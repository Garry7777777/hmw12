package transport;
import drivers.DriverD;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, float engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void bestLapTime() {
        System.out.println("лучшее время круга бусика "+ this.brand + this.model);
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость бусика "+ this.brand + this.model);
    }
    @Override
    public String toString() {
        return "Bus марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume + " водитель:" + driver;

    }
}