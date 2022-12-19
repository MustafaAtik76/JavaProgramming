package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(AccessModifier_Test4.name2); // protected is visible outside package in subclass ONLY

        // System.out.println(AccessModifier_Test4.name1); // default is not visible outside the package

        AccessModifier_Test4.method2();

       // AccessModifier_Test4.method1(); // static method is not visible outside the package


    }
}
