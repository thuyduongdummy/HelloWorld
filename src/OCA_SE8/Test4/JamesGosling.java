package OCA_SE8.Test4;

import java.time.LocalDate;

public class JamesGosling {
    public static void main(String[] args) {
        String fName = "James";
        String lName = "Gosling";
        System.out.println(fName = lName);

            LocalDate date = LocalDate.of(2068, 4, 15);
            System.out.println(date.getMonth() + ":" + date.getMonthValue());
    }
}
