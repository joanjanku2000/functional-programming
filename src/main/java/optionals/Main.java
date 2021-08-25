package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {
        //takes supplier as argument]
        Object throwsException
                = Optional.ofNullable("null")
                .orElseThrow(()->  new Exception("e"));

        Optional.ofNullable("null")
                .ifPresent(val -> System.out.println(val)
                );
        Optional.ofNullable("j@gmail.com")
                .ifPresentOrElse(
                        val -> System.out.println("Sending email to "+val),
                        () -> {
                            System.out.println("Cannot send email");
                        }
                );
        Object valueDefault = Optional.ofNullable(null)
                .orElseGet(()->"Default value");
        Object value = Optional.ofNullable("hello")
                .orElseGet(()->"Default value");
        System.out.println(value);
        System.out.println(valueDefault);
    }
}
