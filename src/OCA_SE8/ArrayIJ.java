package OCA_SE8;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ArrayIJ {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }




    LocalDate date = LocalDate.parse("2000-01-01");
    Period period = Period.ofYears(-1000);


//          int grade = 75;
//         if(grade > 60)
//            System.out.println("Congratulations");
//             System.out.println("You passed");
//         else
//                 System.out.println("You failed");

}
