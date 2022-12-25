package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "B марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume;

    }
}