package day40_FinalKeyword;

public class Zoo{

    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M', "White", "Medium", 2);

        System.out.println("dog.getBreed() = " + dog.getBreed());

        System.out.println("dog.getGender() = " + dog.getGender());

        dog.drink();
    }
}
