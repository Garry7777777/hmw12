package transport;


public class Car extends Transport {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "C марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume;
    }
}