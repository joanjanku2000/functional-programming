package functionalinterface;

import java.util.function.Supplier;

/**
 * Supplier returns anything you want
 */
public class _Supplier {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("Without Supplier");
        System.out.println("-----------------------------------");

        System.out.println(getDBConnectionUrl());

        System.out.println("-----------------------------------");
        System.out.println("With Supplier");
        System.out.println("-----------------------------------");

        System.out.println(getDbConnectionUrlSupplier.get());
    }

    //purpose of the function : just return a value
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/restaurant";
    }

    static Supplier<String> getDbConnectionUrlSupplier
            = () -> "jdbc://localhost:5432/restaurant";
}
