package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("Without Predicate");
        System.out.println("-----------------------------------");

        System.out.println(isPhoneNumberValid("+355695474025"));
        System.out.println(isPhoneNumberValid("+325695474025"));
        System.out.println(isPhoneNumberValid("+3556954"));

        System.out.println("-----------------------------------");
        System.out.println("With Predicate");
        System.out.println("-----------------------------------");

        System.out.println(isPhoneNumberValid.test("+355695474025"));
        System.out.println(isPhoneNumberValid.test("+325695474025"));
        System.out.println(isPhoneNumberValid.test("+3556954"));

        System.out.println("-----------------------------------");
        System.out.println("With Chained Predicate");
        System.out.println("-----------------------------------");
        // and logic
        System.out.println("Is phone number valid and contains number 3 : "+isPhoneNumberValid.and(containsNumber3).test("+355695474025"));
        System.out.println("Is phone number valid and contains number 3 : "+isPhoneNumberValid.and(containsNumber3).test("+455695474025"));
        // or logic
        System.out.println("Is phone number valid and contains number 3(or logic) : "+isPhoneNumberValid.or(containsNumber3).test("+35569547405"));
    }

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("+355") && phoneNumber.length()==13;
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("+355") && phoneNumber.length()==13;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
