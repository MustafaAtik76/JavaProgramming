package day25_CustomMethodOverloading;

import utilities.StringUtility;
import java.lang.String;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("-------------");

        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------");

        String word = "Civic";

        boolean Palindrome = StringUtility.isPalindrome(word);

        System.out.println(Palindrome);


        System.out.println("-----------------------------");

        String [] names = {"Anna", "Java", "Python", "Racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each: names ) {

            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("--------------------------------");

        String s2= "aaaaaaaaaaaaabbbbbbbbbbbcccccccccdddddddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);
    }


}
