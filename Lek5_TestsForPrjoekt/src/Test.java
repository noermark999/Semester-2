import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Test {
    public static void main(String[] args) {
        System.out.println(DAYS.between(LocalDate.of(2022,10,10),LocalDate.of(2022,10,12)));
    }
}
