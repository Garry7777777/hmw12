import transport.Car;
import transport.Bus;
import transport.Trucks;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Car carLada = new Car("Lada", "Granta",  1.7f);
        Car carAudi = new Car("Audi", "A8 50 L TDI quat",  3.0f);
        Car carBMW = new Car("BMW", "Z8",  3.0f);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4f);

        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println();

        Bus busLiaz = new Bus("ЛИАЗ", "677", 10f);
        Bus busIcarus = new Bus("Icarus", "280", 20f);
        Bus busPaz = new Bus("ПАЗ", "Горбатый", 5f);
        Bus busMers = new Bus("Мерседес", "Люкс", 30f);

        System.out.println(busLiaz);
        System.out.println(busIcarus);
        System.out.println(busPaz);
        System.out.println(busMers);
        System.out.println();

        Trucks trucksZil = new Trucks("ЗИЛ", "130", 10f);
        Trucks trucksMaz = new Trucks("МАЗ", "200", 5f);
        Trucks trucksGaz = new Trucks("ГАЗ", "69", 5f);
        Trucks trucksMers = new Trucks("Мерседес", "Люкс", 20f);

        System.out.println(trucksZil);
        System.out.println(trucksMaz);
        System.out.println(trucksGaz);
        System.out.println(trucksMers);
        System.out.println();

        trucksMaz.startMoving();
        busPaz.endMoving();

    }
}