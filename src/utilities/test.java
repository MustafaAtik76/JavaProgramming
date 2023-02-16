package utilities;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {


        //output is:
        //[1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0]
        //
        //[1  9  1                      0   0  0]


        int[] array = {1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0};
//		               0  1  2  3  4 ...          length-3     length-2    length-1
//						++							--

        moveLeft(array);

    }

    public static void moveLeft(int[] oldArray){

        int[] newArray = new int[oldArray.length];

        int beginning = 0;
        int ending = oldArray.length - 1;

        for (int i = 0; i < newArray.length; i++) {
            if (oldArray[i] == 0) {
                newArray[ending] = oldArray[i];
                ending--;
            } else {
                newArray[beginning] = oldArray[i];
                beginning++;
            }
        }

        for (int number : newArray) {
            System.out.print(number);
        }

        System.out.println(Arrays.toString(newArray));
    }
}








