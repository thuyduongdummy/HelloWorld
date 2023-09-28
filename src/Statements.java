import java.util.Scanner;
public class Ifstatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SuperFast RollerCoaster!");
        System.out.print("Please enter your height in centimeters");
        int height = scanner.nextInt();

        if (height < 130){
            System.out.print("Sorry. You are too short!");
        }
    }
}
