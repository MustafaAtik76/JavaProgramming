package day38_Inheritance.carTask;

public class Toyota extends Car{


    public Toyota(String model, int years, double price, String color, int miles) {
        super("Toyota", model, years, price, color, miles);
    }

    public void reliable(){

        System.out.println(brand+ " " + model + " is reliable");
    }

}
