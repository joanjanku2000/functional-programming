package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+35568698463",
                LocalDate.of(2000,3,1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        // Using combinator pattern
        CustomerRegistrationValidator.ValidationResult validationResult = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(validationResult);

        if (validationResult != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(validationResult.name());
        }
    }
}
