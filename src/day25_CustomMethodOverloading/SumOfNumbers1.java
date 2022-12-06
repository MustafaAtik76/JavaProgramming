package day25_CustomMethodOverloading;

public class SumOfNumbers1 {

    public static void main(String[] args) {

        int r1 = sum(10, 20);
        int r2 = sum(10, 20, 30);
        int r3 = sum(10, 20, 30, 40);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        double r4 = sum(10.5, 20.5);
        System.out.println(r4);
        double r5 = sum(10.5, 20.5, 75.9, 80.1);
        System.out.println(r5);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum (double a, double b){
        return a +b;
    }
    public static double sum (double a, double b, double c, double d){
        return sum(a, b) + c +d;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }
}
