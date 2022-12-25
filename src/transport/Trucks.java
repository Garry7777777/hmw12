package transport;

public class Trucks extends Transport {

    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "T марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume;

    }
}