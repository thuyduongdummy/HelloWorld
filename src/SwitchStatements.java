import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.print("You entered one");
                break;
            case 2:
                System.out.print("You entered two");
                break;
            default:
                System.out.print("Invalid number");
                break;
        }
    }

}
