package combinatorpattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;
}
