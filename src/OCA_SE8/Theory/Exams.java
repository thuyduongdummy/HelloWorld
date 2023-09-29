package OCA_SE8.Theory;

import java.util.Arrays;
import java.util.List;

public class Exams {
    public static void main(String[] args) {
        List <String> exams = Arrays.asList("OCA", "OCP");
        for (String e1 : exams)
            for (String e2 : exams)
                System.out.println(e1 + " " + e2);

        String builder = "54321";
        builder = builder.substring(4);
        System.out.println(builder.charAt(2));
    }
}
