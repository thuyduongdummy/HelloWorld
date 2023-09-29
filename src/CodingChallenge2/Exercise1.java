package CodingChallenge2;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        int nameLength = name.length();
        System.out.print("Your name has " + nameLength + " characters. \n");

        System.out.println("How old are you, " + name + " ?");
        int age = scanner.nextInt();
        System.out.println("You've lived " + age + " years. In  another " + age + " years, you'll be " + age * 2 + " years old");

    }


}
