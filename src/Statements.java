import java.util.Scanner;
public class Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SuperFast RollerCoaster!");
        System.out.print("Please enter your height in centimeters ");
        int height = scanner.nextInt();

        if (height < 130 || height > 210){
            System.out.print("Sorry. You do not meet the height requirements!");
        }
        else {
            System.out.print("Height accepted. Go ahead");
        }
    }
}
