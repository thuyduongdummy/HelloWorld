import java.util.Scanner;
public class Writing_a_question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name );

        /*System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("How old are you?");
        int userAge = scanner.nextInt();
        System.out.println(userAge + "?" + " You are so young");

        System.out.println("How tall are you?");
        double userHeight = scanner.nextDouble();
        System.out.println("You are" + " m tall");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("The difference between your height and the average is: ");
        System.out.format(" %.2f m if you are female.\n", averageFemaleHeightDifference);
        System.out.format(" %.2f m if you are male", averageMaleHeightDifference);*/
    }
}
