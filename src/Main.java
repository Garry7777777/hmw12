import transport.Car;
import transport.Bus;
import transport.Trucks;
import transport.Driver;
import transport.DriverC;
import transport.DriverB;
import transport.DriverD;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DriverB driverBob = new DriverB("Bob");
        DriverC driverCharles  = new DriverC("Charles ");
        DriverD driverDen = new DriverD("Den");

        Car carLada = new Car("Lada", "Granta",  1.7f, driverBob);
        Car carAudi = new Car("Audi", "A8 50 L TDI quat",  3.0f, driverBob);
        Car carBMW = new Car("BMW", "Z8",  3.0f, driverBob);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4f, driverBob);

        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);        System.out.println();

        Bus busLiaz = new Bus("ЛИАЗ", "677", 10f,driverDen);
        Bus busIcarus = new Bus("Icarus", "280", 20f,driverDen);
        Bus busPaz = new Bus("ПАЗ", " Горбатый", 5f,driverDen);
        Bus busMers = new Bus("Мерседес", " Люкс", 30f,driverDen);

        System.out.println(busLiaz);
        System.out.println(busIcarus);
        System.out.println(busPaz);
        System.out.println(busMers);        System.out.println();

        Trucks trucksZil = new Trucks("ЗИЛ", "130", 10f,driverCharles);
        Trucks trucksMaz = new Trucks("МАЗ", "200", 5f,driverCharles);
        Trucks trucksGaz = new Trucks("ГАЗ", "69", 5f,driverCharles);
        Trucks trucksMers = new Trucks("Мерседес", "Unimog", 20f,driverCharles);

        System.out.println(trucksZil);
        System.out.println(trucksMaz);
        System.out.println(trucksGaz);
        System.out.println(trucksMers);       System.out.println();

        trucksMaz.startMoving();
        busPaz.endMoving();         System.out.println();

        carLada.bestLapTime();
        busIcarus.maxSpeed();       System.out.println();

        driverDen.refuelCar();
        driverCharles.stopMoving();     System.out.println();

        busPaz.announcement();
        carLada.announcement();
    }
}