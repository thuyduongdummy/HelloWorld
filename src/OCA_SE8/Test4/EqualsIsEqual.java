package OCA_SE8.Test4;

import java.time.LocalDate;

public class EqualsIsEqual {
    public static void main(String [] args) {
        LocalDate date1 = LocalDate.parse("1980-03-16");
        LocalDate date2 = LocalDate.parse("1980-03-16");
        System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));
    }
}
