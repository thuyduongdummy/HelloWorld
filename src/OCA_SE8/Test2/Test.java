package OCA_SE8.Test2;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

//        int [] arr = {3, 2, 1};
//        for(int i : arr) {
//            System.out.println(arr[i]);
//        }
//        LocalDate date = LocalDate.parse("1980-03-16");
//        System.out.println(date.minusYears(-5));

        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));


//        int score = 60;
//        switch (score) {
//            default:
//                System.out.println("Not a valid score");
//            case score < 70:
//                System.out.println("Failed");
//                break;
//            case score >= 70:
//                System.out.println("Passed");
//                break;
        }
    }
