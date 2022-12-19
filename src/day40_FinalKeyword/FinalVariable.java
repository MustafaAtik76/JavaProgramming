package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;

    final static String name;

    static {

        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        // pi = 4.14; // final variables can not be reassigned

        final String name;

        name = "Java";

        // name = "Wooden Spoon";

        System.out.println("name = " + name);

        System.out.println("===================================");

        FinalVariable obj = new FinalVariable("May/01");

        System.out.println("obj.birthDay = " + obj.birthDay);

        System.out.println("=======================================");

        // FinalVariable.name= "Pyhton"; // Final can not change

        System.out.println("FinalVariable.name = " + FinalVariable.name);
    }
}
