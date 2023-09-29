import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a VIP Pass? yes/no: ");
        String vipPassReply = scanner.next();

        if (age >= 18 && vipPassReply.equals("yes") || age > 70){
            System.out.println("Thanks. Go on in");
        }
        else {
            System.out.print("Sorry. No can do");
        }


    }
}
