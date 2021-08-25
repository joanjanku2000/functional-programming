package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // normal java function
        greetCustomer(new Customer("Maria","99999"));
        // consumer functional interface
        greetConsumer.accept(new Customer("Maria","88888"));
        // BiConsumer functional interface
        greetConsumerV2.accept(new Customer("Maria","88888"),false);
    }

    static BiConsumer<Customer,Boolean> greetConsumerV2 = (customer,showPhoneNumber) ->

        System.out.println("Hello "+customer.customerName
                + ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));

;

    static Consumer<Customer> greetConsumer = customer ->
            System.out.println("Hello "+customer.customerName
                    + ", thanks for registering phone number "
                    +customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName
                + ", thanks for registering phone number "
                +customer.customerPhoneNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
