package CodingCHallenge3;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so bat ky nao anh ieu: ");
        int numEnteredByPlayer = scanner.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        if (numEnteredByPlayer > 1 && numEnteredByPlayer < 5){
            System.out.print("Doan dung roi! Anh ieu gioi qua!");
        }
        else {
            System.out.print("Oi doan sai roi! Doan lai lan nua nao anh ieu!");
        }
        System.out.print("Your guess: ");
        int answer = scanner.nextInt();
        if (answer > 1 && answer < 5){
            System.out.print("Doan dung roi! Anh ieu gioi qua!");
        }
        else {
            System.out.print("Oi doan sai roi! Doan lai lan nua nao anh ieu!");
        }

    }
}
