package transport;

public class Trucks extends Transport<DriverC> implements Competitive {

    public Trucks(String brand, String model, float engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void bestLapTime() {
        System.out.println(" лучшее время круга грузовика " + this.brand + this.model);
    }
    @Override
    public void maxSpeed() {
        System.out.println(" максимальная скорость грузовика " + this.brand + this.model );
    }
    @Override
    public String toString() {
        return "T марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume + " водитель:" + driver;

    }
}