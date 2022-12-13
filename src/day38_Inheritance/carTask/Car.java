package day38_Inheritance.carTask;

public class Car{

    public String brand, model;
    public int years;
    public double price;
    public String color;
    public int miles;

    public Car(String brand, String model, int years, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.years = years;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+model+ " is starting");
    }
    public void drive(){
        System.out.println(brand+model+ " is driving");

    }
    /*public void fly (){  // fly () is not common for all cars, and parent class should only contain the common feature of all cars

    }*/

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", years=" + years +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
