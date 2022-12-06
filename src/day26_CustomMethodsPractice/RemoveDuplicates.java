package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String[]str = { "Ali", "Veli", "Ali", "Veli"};

        String[] strings = ArraysUtility.removeDuplicates(str);

        System.out.println(Arrays.toString(strings));
    }
}
