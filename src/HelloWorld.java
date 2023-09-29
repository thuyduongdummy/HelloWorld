import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        int foo = 17;
        int bar = 4;
        System.out.print((double) foo/bar);



        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(anotherLine);
        System.out.print(line.length());



        LocalDate xmas = LocalDate.of(2016,  12,  25);

        System.out.println(xmas.getYear());

    }
}