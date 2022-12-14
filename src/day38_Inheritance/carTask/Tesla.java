package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String model, int years, double price, String color, int miles) {
        super("Tesla", model, years, price, color, miles);
    }

    public void autoPilot (){

        System.out.println(brand+ " "+model+" is autopilot mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start"+brand+" " +model);
    }
}
