package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla = new Tesla("Model S", 2022, 94900, "Red", 0);

        BMW bmw = new BMW("x5", 2020, 67350, "Black", 12000);

        System.out.println(tesla);

        tesla.start();
        tesla.autoPilot();

        System.out.println("-----------------------------------------");

        System.out.println(toyota);
        toyota.start();
        toyota.reliable();

        System.out.println("--------------------------------------------------");

        System.out.println(bmw);
        bmw.start();
        bmw.racing();

    }
}
