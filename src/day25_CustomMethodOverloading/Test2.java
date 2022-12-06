package day25_CustomMethodOverloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("----------------------");

        double[] arr2 = {1.5, 5.2, 6.5, 7.3};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("-----------------------");

        String[] arr4 = {"Ali", "Veli", "Mahmut", "Leyla"};

        ArraysUtility.printEachElement(arr4);


        System.out.println("------------------------------");

        int[] arr5 = {7, 9, 4, 1, 0, 11};

        int max1 = ArraysUtility.max(arr5);

        System.out.println("max1 = " + max1);

        int min1 = ArraysUtility.min(arr5);

        System.out.println("min1 = " + min1);


        System.out.println("--------------------");

        double[] n2 = {10.5, 2.5, 5.5, 41.5};

        double max2 = ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);

        double min2 = ArraysUtility.min(n2);

        System.out.println("min2 = " + min2);

        System.out.println("------------------------");

        int[] a1 = {1, 2, 3, 4, 5, 6};

        boolean r1= ArraysUtility.contains(a1, 5);

        System.out.println("r1 = " + r1);

        System.out.println("--------------------------------");

        double[]a2= {10.5,2.5,4.5,6.5,0.5};

        boolean r2 =ArraysUtility.contains(a2, 0.5);

        System.out.println("r2 = " + r2);

        System.out.println("---------------------");

        String [] word1 = {"Ali", "Veli", "Ayşe", "Nalan"};

        boolean r3 = ArraysUtility.contains(word1, "Ali");

        System.out.println("r3 = " + r3);
    }
}