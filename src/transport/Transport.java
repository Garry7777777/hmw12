package transport;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected float engineVolume;

/*
    protected final int productionYear;
    protected final String productionCountry;
    protected String color;
    protected int maxSpeed;
*/

    public Transport(String brand, String model, float engineVolume) {

        if (brand == null) this.brand = "default";
        else this.brand = brand;

        if (model == null) this.model = "default";
        else this.model = model;

        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;
    }

    public void startMoving(){
        System.out.println("начал движение:" + this.brand + this.model);
    }

    public void endMoving(){
        System.out.println("закончил движение:" + this.brand + this.model);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
