package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.SortedMap;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occurred");
        }

        System.out.println("Test1 completed");

        System.out.println("=====================================================");

        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]);

            System.out.println("Try Block");

        } catch (RuntimeException e) {

            //System.out.println("Catch Block");
            //System.out.println("Run time Exception was occurred");


            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Test2 completed");

        System.out.println("=====================================================");

        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());

            e.printStackTrace();
        }
        System.out.println("Test3 completed");


        System.out.println("==========================================0");

        System.out.println("Hello");
        try {
            Thread.sleep(3000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");


        System.out.println("================================================");

        try {
            FileInputStream file = new FileInputStream("File path");
        }catch (FileNotFoundException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }
}
