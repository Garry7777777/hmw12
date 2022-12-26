package transport;

public class Driver {

    protected String fullName;
    protected int driverLicense;
    protected int drivingExperience;



    public Driver(String fullName) {
        this.fullName = fullName;
    }

    public void startMoving(){
        System.out.println( this  + " движется ");
    }

    public void stopMoving(){
        System.out.println( this  + " остановился ");
    }

    public void refuelCar(){
        System.out.println( this  + " заправляет ");
    }

    @Override
    public String toString() {
        return " водитель " + fullName;
    }



}
