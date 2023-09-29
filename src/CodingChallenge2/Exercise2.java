package CodingChallenge2;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much is your bill?");
        double bill = scanner.nextDouble();
        System.out.print("How many people are there?");
        int people = scanner.nextInt();
        double averageMoneyForEachPerson = bill/people;
        System.out.format("So with the bill of %2f dollars, divided by " + people + ", each person needs to pay %2f", bill, averageMoneyForEachPerson);

    }
}
