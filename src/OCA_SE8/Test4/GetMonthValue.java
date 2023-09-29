package OCA_SE8.Test4;

import java.time.LocalDate;

public class GetMonthValue {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue());

        int i;
        for(i=0; i<=2; i++){}
        System.out.println(i);
    }

}
